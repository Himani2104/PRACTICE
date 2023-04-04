package com.example.Restful.Webservices.Part2.GreetingWithUsername;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Locale;
@Controller
public class GreetingController {

    @Autowired
    private MessageSource messageSource;


    @GetMapping("/greeting")
    @ResponseBody
    public String MessageInternationalization(@RequestParam("username") String username){


        Locale locale= LocaleContextHolder.getLocale();
        String message= messageSource.getMessage("Hello.message",new Object[]{username},locale);
        return message;

    }



}
