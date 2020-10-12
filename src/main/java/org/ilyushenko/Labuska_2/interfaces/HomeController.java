package org.ilyushenko.Labuska_2.interfaces;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HomeController {
    private org.springframework.context.annotation.AnnotationConfigApplicationContext context;

    @RequestMapping(value = "/")
    public String home(@RequestParam(value = "name", required = false, defaultValue = "stranger") String name,
                       Model model){
        context = new AnnotationConfigApplicationContext(JavaConfig.class);
        Sender sender = context.getBean( "wirelessSenderImpl", Sender.class );
        model.addAttribute( "msg",  sender.sendMessage( "Hello " + name + "!" ));
        return "test";
    }
}
