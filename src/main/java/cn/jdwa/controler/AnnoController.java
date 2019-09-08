package cn.jdwa.controler;

import cn.jdwa.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

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

    @RequestMapping("/testRequestBody")
    public String testRequestBody(@RequestBody String body){
        System.out.println("执行了。。。");
        System.out.println(body);
        return "success";
    }

    @RequestMapping("/{name}/testPathVariable/{id}")
    public String testPathVariable(@PathVariable("name") String name,@PathVariable("id")String id){
        System.out.println("执行了。。。");
        System.out.println(name);
        System.out.println(id);
        return "success";
    }

    @RequestMapping("/testRequestHeader")
    public String testRequestHeader(@RequestHeader("Accept") String header){
        System.out.println("执行了。。。");
        System.out.println(header);
        return "success";
    }

    @RequestMapping("/testCookieValue")
    public String testCookieValue(@CookieValue("JSESSIONID") String header){
        System.out.println("执行了。。。");
        System.out.println(header);
        return "success";
    }

    @RequestMapping("/testModelAttribute")
    public String testModelAttribute(User user){
        System.out.println("testModelAttribute执行了。。。");
//        System.out.println(header);
        System.out.println(user);
        return "success";
    }

    @ModelAttribute
    public User showUser(String name,int age){
        System.out.println("showUser执行了。。。");
        User user = new User();
        user.setName(name);
        user.setAge(age);
        user.setBirthDay(new Date());
//        System.out.println(header);
        return user;
    }
}
