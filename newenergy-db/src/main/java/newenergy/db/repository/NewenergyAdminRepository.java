package newenergy.db.repository;

import newenergy.db.domain.NewenergyAdmin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NewenergyAdminRepository extends JpaRepository<NewenergyAdmin, Integer> {

    public List<NewenergyAdmin> getAllByUsernameAndDeletedIsFalse(String username);

}
