package com.offcn.controller;

import com.offcn.demo.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.*;

@Controller
public class SecondThymeleafController{
    /**
     * 访问localhost:8080 页面
     * 将数据message填充到templates/index2.html
     * @param model
     * @return
     */
    @GetMapping("/second")
    public String indexPage(Model model) {
        String message = "我是java的爸爸";
        User user = new User(1,"优就业",18);
        User user1 = new User(2,"五方桥",19);
        User user2 = new User(3,"草莓园",20);

        Map map = new HashMap();
        map.put("user",user);
        map.put("user1",user1);
        map.put("user2",user2);
        model.addAllAttributes(map);


        List<User> list=new ArrayList<User>();
        User u1 = new User(1,"优就业",18);
        list.add(u1);

        User u2 = new User(2,"中公教育",28);
        list.add(u2);

        User u3 = new User(3,"IT先锋",88);
        list.add(u3);

        User u4 = new User(4,"JAVA第一",888);
        list.add(u4);

        model.addAttribute("userList", list);

        model.addAttribute("userName","百度");
        model.addAttribute("href", "http://www.baidu.com");




        model.addAttribute("flag","yes");
        model.addAttribute("meau","admin");
        model.addAttribute("manager","manager");





        //日期时间
        Date date = new Date();
        model.addAttribute("date", date);
        //小数的金额
        double price=128.5678D;
        model.addAttribute("price", price);
        //定义大文本数据
        String str="Thymeleaf是Web和独立环境的现代服务器端Java模板引擎，能够处理HTML，XML，JavaScript，CSS甚至纯文本。\r\n" +
                "Thymeleaf的主要目标是提供一种优雅和高度可维护的创建模板的方式。为了实现这一点，它建立在自然模板的概念上，将其逻辑注入到模板文件中，不会影响模板被用作设计原型。这改善了设计的沟通，弥补了设计和开发团队之间的差距。\r\n" +
                "Thymeleaf也从一开始就设计了Web标准 - 特别是HTML5 - 允许您创建完全验证的模板，如果这是您需要的\r\n" ;
        model.addAttribute("strText", str);
        //定义字符串
        String str2="JAVA-offcn";
        model.addAttribute("str2", str2);
        return "index";

    }



    /**
     * 访问localhost:8080/java003 页面
     * 将数据message填充到templates/index6.html
     * @param
     * @return
     */
    @GetMapping("/six")
    public String baseUrl(Model model) {
        return "index1";
    }


/*-----------------------------------------------------------------------------------------------------------------*/
/*-----------------------------------------------------------------------------------------------------------------*/
   /* @GetMapping("/three")
    public String indexPage1(Model model) {

    }*/

}


