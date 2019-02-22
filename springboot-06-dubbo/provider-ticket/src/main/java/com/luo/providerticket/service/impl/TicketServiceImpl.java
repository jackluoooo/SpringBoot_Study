package com.luo.providerticket.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.luo.providerticket.service.TicketService;
import org.springframework.stereotype.Component;

/**
 * @author：罗金星 date 2019/1/28 15:18
 **/
@Component
@Service//将服务发布出去
public class TicketServiceImpl implements TicketService {
    @Override
    public String getTicket() {
        return "《厉害了，我的国》";
    }
}
