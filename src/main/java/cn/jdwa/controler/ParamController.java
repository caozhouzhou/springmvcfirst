package cn.jdwa.controler;

import cn.jdwa.pojo.Account;
import com.sun.deploy.net.HttpResponse;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.net.HttpCookie;

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

    @RequestMapping(value = "/test1",method = {RequestMethod.GET})
    public String test(HttpServletRequest request, HttpServletResponse response){
        System.out.println("执行了... ..."+request);
        System.out.println("执行了... ..."+request.getSession());
        System.out.println("执行了... ..."+request.getSession().getServletContext());
        System.out.println("-=-=-=-=-");
        return "success";
    }
}
