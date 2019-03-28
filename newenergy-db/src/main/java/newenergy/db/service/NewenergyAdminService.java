package newenergy.db.service;

import newenergy.db.domain.NewenergyAdmin;
import newenergy.db.repository.NewenergyAdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NewenergyAdminService {
    @Autowired
    private NewenergyAdminRepository adminRepository;

    public List<NewenergyAdmin> findAdmin(String username) {

        return adminRepository.getAllByUsernameAndDeletedIsFalse(username);

    }
}
