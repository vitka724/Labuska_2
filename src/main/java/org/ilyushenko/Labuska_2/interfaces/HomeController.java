package org.ilyushenko.Labuska_2.interfaces;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
   private final Sender sender;
   private final Receiver receiver;

    public HomeController() {
        this.receiver = new ReceiverImpl();
        this.sender = new SenderImpl(this.receiver);
    }
    @RequestMapping(value = "/")
    public String home(){
        return sender.sendMessage("Hello Word!");
    }
}
