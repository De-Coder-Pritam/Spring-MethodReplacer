package com.travelhub.pritam;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.ApplicationContext;

import com.travelhub.pritam.bean.Bank;
import com.travelhub.pritam.cfgs.AppConfig;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Bank sbi = (Bank) context.getBean("bank");
        System.out.println(sbi.calculateCompoundInterest(10000, 4, 3));
        ((AbstractApplicationContext) context).close();
    }
}
