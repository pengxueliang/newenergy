package newenergy.admin.controller;

import newenergy.core.util.ResponseUtil;
import newenergy.db.domain.Resident;
import newenergy.db.service.ResidentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/admin/resident")
@Validated
public class ResidentController {
    @Autowired
    private ResidentService residentService;

    //获取居民信息列表，包含带搜索条件查询
    @GetMapping("/list")
    public Object list(Integer id,
                       String address,
                       @RequestParam(defaultValue = "0") Integer page,
                       @RequestParam(defaultValue = "10") Integer limit){
        Page<Resident> pageResident = residentService.querySelective(id, address, page, limit);
        List<Resident> residentList = pageResident.getContent();
        int total = pageResident.getNumberOfElements();
        Map<String, Object> data = new HashMap<>();
        data.put("total",total);
        data.put("items", residentList);

        return ResponseUtil.ok(data);
    }

    //新增居民信息
    @PostMapping("/create")
    public Object create(@RequestBody Resident resident) {
        return null;
    }
}
