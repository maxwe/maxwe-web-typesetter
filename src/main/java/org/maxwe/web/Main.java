package org.maxwe.web;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.maxwe.web.book.Book;

/**
 * Created by dingpengwei on 6/14/15.
 */
public class Main {

    public static void test(){
        Configuration cfg = new Configuration();
        cfg.configure();
        SessionFactory sessionFactory = cfg.buildSessionFactory();

        Session session = sessionFactory.openSession();

        Book book = new Book(1,"isbn","this book name","/mnt/sdcard/xxx.png","/mnt/sdcard/xxx",100000l,"very good","dingpengwei","dpw",0);

        session.save(book);
    }

}
