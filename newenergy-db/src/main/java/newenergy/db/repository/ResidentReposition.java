package newenergy.db.repository;

import newenergy.db.domain.Resident;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface ResidentReposition extends JpaRepository<Resident, Integer>, JpaSpecificationExecutor<Resident> {

}
