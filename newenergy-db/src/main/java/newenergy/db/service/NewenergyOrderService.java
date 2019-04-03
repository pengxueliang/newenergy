package newenergy.db.service;

import newenergy.db.domain.NewenergyOrder;
import newenergy.db.repository.NewenergyOrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class NewenergyOrderService {
    @Autowired
    private NewenergyOrderRepository newenergyOrderRepository;

    public NewenergyOrder add(NewenergyOrder order){
        order.setRecharge_time(LocalDateTime.now());
        order.setState(0);
        return newenergyOrderRepository.save(order);
    }
}
