package com.luo.springboot04task;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.test.context.junit4.SpringRunner;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.io.File;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Springboot04TaskApplicationTests {

    @Autowired
    JavaMailSender mailSender;
    @Test
    public void contextLoads() {
        SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
        //TODO 邮件设置
        simpleMailMessage.setSubject("通知-今晚开会");//标题
        simpleMailMessage.setText("hello杨佳：7:30开会");//内容
        simpleMailMessage.setTo("569653441@qq.com");
        simpleMailMessage.setFrom("2451652673@qq.com");
        mailSender.send(simpleMailMessage);
    }
    @Test
    public void test02() throws MessagingException {

        //创建一个复杂邮件
        MimeMessage mimeMessage = mailSender.createMimeMessage();
        MimeMessageHelper mimeMessageHelper = new MimeMessageHelper(mimeMessage, true);

        //TODO 邮件设置
        mimeMessageHelper.setSubject("通知-今晚开会");//标题
        mimeMessageHelper.setText("<b style='color:red'> hello杨佳：7:30开会</b>",true);//内容
        mimeMessageHelper.setTo("569653441@qq.com");
        mimeMessageHelper.setFrom("2451652673@qq.com");

        //上传文件
        mimeMessageHelper.addAttachment("wen.jpg",new File("D:\\hello\\wen.jpg"));
        mailSender.send(mimeMessage);
    }

}

