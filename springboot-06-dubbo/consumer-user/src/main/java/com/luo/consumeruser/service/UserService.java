package com.luo.consumeruser.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.luo.providerticket.service.TicketService;
import org.springframework.stereotype.Service;

/**
 * @author：罗金星 date 2019/1/28 15:49
 **/
@Service
public class UserService {
    @Reference//按照全类名进行远程调用
    TicketService ticketService;
    public void hello(){
        String ticket = ticketService.getTicket();
        System.out.println("买到票了:"+"ticket");
    }
}
