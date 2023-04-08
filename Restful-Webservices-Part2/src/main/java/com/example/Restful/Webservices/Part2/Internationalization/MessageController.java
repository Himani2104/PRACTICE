package com.example.Restful.Webservices.Part2.Internationalization;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;

@RestController
public class MessageController {
@Autowired
    private MessageSource messageSource;

    public MessageController(MessageSource messageSource) {
        this.messageSource = messageSource;
    }

    @GetMapping("/message")
    public String MessageInternationalization()
    {


        Locale locale= LocaleContextHolder.getLocale();
       return messageSource.getMessage("app.title",null,locale)
               +" "+messageSource.getMessage("app.welcome",null,locale);
    }

}
