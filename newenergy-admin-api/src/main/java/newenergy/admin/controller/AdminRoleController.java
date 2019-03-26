//package newenergy.admin.controller;
//
//import newenergy.admin.annotation.RequiresPermissionsDesc;
//import newenergy.core.validator.Sort;
//import newenergy.db.domain.NewenergyRole;
//import newenergy.db.service.NewenergyPermissionService;
//import newenergy.db.service.NewenergyRoleService;
//import org.apache.shiro.authz.annotation.RequiresPermissions;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.domain.Page;
//import org.springframework.validation.annotation.Validated;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//@RestController
//@RequestMapping("/admin/role")
//@Validated
//public class AdminRoleController {
//    @Autowired
//    private NewenergyRoleService roleService;
//
//    @Autowired
//    private NewenergyPermissionService permissionService;
//
//    @RequiresPermissions("admin:role:list")
//    @RequiresPermissionsDesc(menu={"系统管理", "角色管理"}, button = "查询")
//    @GetMapping("/list")
//    public Object list(String name,
//                       @RequestParam(defaultValue = "1") Integer page,
//                       @RequestParam(defaultValue = "10") Integer limit,
//                       @Sort @RequestParam(defaultValue = "add_time") String sort){
//
//        List<NewenergyRole> roleList = roleService.querySelective(name, page, limit, sort);
//        int total = roleService.countSelective(name);
//        Map<String, Object> data = new HashMap<>();
//        return null;
//    }
//}
