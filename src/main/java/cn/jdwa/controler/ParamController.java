package cn.jdwa.controler;

import cn.jdwa.pojo.Account;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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

    @RequestMapping(value = "/save",method = {RequestMethod.POST})
    public String save(Account account){
        System.out.println("执行了... ..."+account.getUname());
        System.out.println("执行了... ..."+account.getPasswd());
        System.out.println("执行了... ..."+String.valueOf(account.getMoney()));
        System.out.println("-=-=-=-=-");
        System.out.println(account);
        return "success";
    }
}
