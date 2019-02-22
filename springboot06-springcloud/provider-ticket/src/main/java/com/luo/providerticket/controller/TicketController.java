package com.luo.providerticket.controller;

import com.luo.providerticket.servicce.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author：罗金星 date 2019/1/31 14:18
 **/
@RestController
public class TicketController {
    @Autowired
    TicketService ticketService;
    @GetMapping
    public String getTicket(){
        return  ticketService.getTicket();
    }
}
