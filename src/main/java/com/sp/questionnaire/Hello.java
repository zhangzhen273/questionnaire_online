package com.sp.questionnaire;

import com.sp.questionnaire.config.session.MySessionContext;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import javax.validation.constraints.Size;
import java.util.ArrayList;

/*
 * Author: Seven
 * Email : cpwu@foxmail.com
 * 2018-07-20 星期五 22:44
 */
@RestController
@Slf4j
public class Hello {


    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String hello(HttpServletRequest request){
        //request.getSession().setAttribute("key","1234");
        //System.out.println(request.getSession().getId());
        log.info("test url");
        return "Hello SpringBoot!";
    }
    @RequestMapping(value = "/test/admin", method = RequestMethod.GET)
    public String testAdmin(){
        return "Hello admin";
    }

    @RequestMapping(value = "nologin")
    public String noLogin(){
        return "you haven't login!";
    }

}
