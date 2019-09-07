package cn.jdwa.controler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by czz on 2019/9/7.
 */
@Controller
@RequestMapping("/anno")
public class AnnoController {

    @RequestMapping("/testRequestParam")
    public String testRequestParam(@RequestParam("name")String username){
        System.out.println("执行了。。。");
        System.out.println(username);
        return "success";
    }
}
