package newenergy.db.repository;

import newenergy.db.domain.NewenergyPermission;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NewenergyPermissionRepository extends JpaRepository<NewenergyPermission, Integer> {

    public List<NewenergyPermission> getAllByDeletedIsFalseAndRoleIdIn(Integer[] roleIds);
}
