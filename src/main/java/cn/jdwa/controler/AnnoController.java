package cn.jdwa.controler;

import cn.jdwa.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;

import javax.jws.WebParam;
import java.util.Date;
import java.util.Map;

/**
 * Created by czz on 2019/9/7.
 */
@Controller
@SessionAttributes(value = {"msg"})
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

    @RequestMapping("/testModelAttribute1")
    public String testModelAttribute1(@ModelAttribute("czz")User user){
        System.out.println("testModelAttribute执行了。。。");
//        System.out.println(header);
        System.out.println(user);
        return "success";
    }

//    @ModelAttribute
//    public void showUser(String name, Map<String,User> map){
//        System.out.println("showUser执行了。。。");
//        User user = new User();
//        user.setName(name);
//        user.setAge(20);
//        user.setBirthDay(new Date());
//        map.put("czz",user);
////        System.out.println(header);
////        return user;
//    }

//    @ModelAttribute
//    public User showUser(String name,int age){
//        System.out.println("showUser执行了。。。");
//        User user = new User();
//        user.setName(name);
//        user.setAge(age);
//        user.setBirthDay(new Date());
////        System.out.println(header);
//        return user;
//    }

    @RequestMapping("/testSetSessionAttribute")
    public String testSetSessionAttribute(Model model){
        System.out.println("testSetSessionAttribute。。。");
//        System.out.println(header);
        model.addAttribute("msg","mm");
        System.out.println(model);
        return "success";
    }


    @RequestMapping("/testGetSessionAttribute")
    public String testGetSessionAttribute(ModelMap map){
        System.out.println("testGetSessionAttribute。。。");
//        System.out.println(header);
        System.out.println(map);
        return "success";
    }


    @RequestMapping("/testDelSessionAttribute")
    public String testDelSessionAttribute(SessionStatus status){
        System.out.println("testDelSessionAttribute。。。");
//        System.out.println(header);
        status.setComplete();
        return "success";
    }
}
