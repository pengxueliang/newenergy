package newenergy.admin.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by HUST Corey on 2019-03-26.
 */
@RestController
public class TestController {
    //在本地feat分支修改的内容，修改为第一行
    //从远程仓库dev分支pull下来的最新版本，修改为第二行
    @RequestMapping("/test")
    public String hello(){
        return "hello world123";
    }
}
