package cn.jdwa.controler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 请求参数绑定
 * Created by czz on 2019/9/1.
 */
@Controller
@RequestMapping("/param")
public class ParamController {
    @RequestMapping("/test")
    public String testParam(String user,String passwd){
        System.out.println("执行了... ..."+user);
        System.out.println("执行了... ..."+passwd);
        return "success";
    }
}
