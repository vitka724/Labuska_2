package org.ilyushenko.Labuska_2.interfaces;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
   private  org.springframework.context.annotation.AnnotationConfigApplicationContext context;
    @RequestMapping(value = "/")
    public String home(){
        context = new AnnotationConfigApplicationContext(JavaConfig.class);
        Sender sender = context.getBean("wirelessSenderImpl", Sender.class);
        return sender.sendMessage("Message from Java config");

    }
}
