package com.ljx.springbootweb04.component;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.web.servlet.LocaleResolver;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.Locale;

/**
 * @author：罗金星 date 2019/1/15 13:32
 **/
@Slf4j
public class MyLocaleResolver implements LocaleResolver {
    public  Locale locale=Locale.getDefault();
    @Override
    public Locale resolveLocale(HttpServletRequest httpServletRequest) {
        String l=httpServletRequest.getParameter("l");
//        Locale locale=Locale.getDefault();
        if(!StringUtils.isEmpty(l)){
            String[] split= l.split("_");
            locale=new Locale(split[0],split[1]);
//            HttpSession session=httpServletRequest.getSession();
//            session.setAttribute("",locale);
        }
//        log.error(locale.toString());
        return locale;
    }

    @Override
    public void setLocale(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Locale locale) {

    }
}
