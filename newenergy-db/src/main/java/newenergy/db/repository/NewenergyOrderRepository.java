package newenergy.db.repository;

import newenergy.db.domain.NewenergyOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NewenergyOrderRepository extends JpaRepository<NewenergyOrder,Integer> {
}
