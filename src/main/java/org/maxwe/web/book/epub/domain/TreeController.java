package org.maxwe.web.book.epub.domain;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * Created by Pengwei Ding on 2015-07-02 12:18.
 * Email: www.dingpengwei@foxmail.com www.dingpegnwei@gmail.com
 * Description: 对EPub文件结构目录树的操作
 */
@Controller
@RequestMapping("/epub")
public class TreeController {
    private static final Logger logger = LoggerFactory.getLogger(TreeController.class);

    @RequestMapping(value = "/init", method = RequestMethod.GET)
    public String createEPub(Locale locale, Model model) {
        logger.info("Welcome home! the client locale is " + locale.toString());
        Date date = new Date();
        DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG,DateFormat.LONG, locale);
        String formattedDate = dateFormat.format(date);
        model.addAttribute("serverTime", formattedDate);
        System.out.println("/epub/create-=============" + formattedDate + "=============-");
        return "book/epub/ePubTree";
    }

}
