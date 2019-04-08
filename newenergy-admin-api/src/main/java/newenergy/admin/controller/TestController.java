package newenergy.admin.controller;

import newenergy.db.domain.DeviceRequire;
import newenergy.db.service.DeviceRequireService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by HUST Corey on 2019-03-26.
 */
@RestController
@RequestMapping("test")
public class TestController {
    @Autowired
    DeviceRequireService requireService;
    @RequestMapping(value = "add", method = RequestMethod.POST)
    public DeviceRequire add(DeviceRequire require, Integer userid){
        return requireService.addDeviceRequire(require,userid);
    }

    @RequestMapping(value = "update", method = RequestMethod.POST)
    public DeviceRequire update(DeviceRequire require, Integer userid){
        return requireService.updateDeviceRequire(require,userid);
    }

    @RequestMapping(value = "delete", method = RequestMethod.POST)
    public void delete(Integer id, Integer userid){
        requireService.deleteDeviceRequire(id,userid);
    }

}
