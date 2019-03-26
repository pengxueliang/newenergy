package newenergy.db.service;

import newenergy.db.domain.NewenergyPermission;
import newenergy.db.repository.NewenergyPermissionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class NewenergyPermissionService {

    @Autowired
    private NewenergyPermissionRepository permissionRepository;

    public Set<String> queryByRoleIds(Integer[] roleIds) {

        Set<String> permissions = new HashSet<String>();
        if(roleIds.length == 0){
            return permissions;
        }
        List<NewenergyPermission> permissionList = permissionRepository.getAllByDeletedIsFalseAndRoleIdIn(roleIds);
        for (NewenergyPermission permission : permissionList){
            permissions.add(permission.getPermission());
        }

        return permissions;
    }
}
