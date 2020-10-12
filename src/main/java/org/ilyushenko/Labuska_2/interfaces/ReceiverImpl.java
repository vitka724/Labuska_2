package org.ilyushenko.Labuska_2.interfaces;

import org.springframework.stereotype.Component;

@Component
public class ReceiverImpl implements Receiver {
    @Override
    public String getMessage(String message){
        return message;
    }
}
