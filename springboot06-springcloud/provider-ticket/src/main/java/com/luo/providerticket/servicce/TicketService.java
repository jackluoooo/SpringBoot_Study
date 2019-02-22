package com.luo.providerticket.servicce;

import org.springframework.stereotype.Service;

/**
 * @author：罗金星 date 2019/1/31 14:16
 **/
@Service
public class TicketService {
    public String getTicket(){
        System.out.println("8002");
        return "<<厉害了，我的国>>";
    }
}
