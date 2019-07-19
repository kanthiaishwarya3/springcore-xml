package com.stackroute.domain;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.*;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;

public class Main
{
    public static void main(String args[])
    {
        // ApplicationContext provides configuration of application

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Movie movieobjA = context.getBean("MovieA", Movie.class);
        movieobjA.display();
        Movie movieobjB= context.getBean("MovieB", Movie.class);
        movieobjB.display();
        Movie movieobjC= context.getBean("MovieC", Movie.class);
        movieobjC.display();
        Movie movieobjD= context.getBean("MovieD", Movie.class);
        movieobjD.display();
        Movie movieobjE= context.getBean("MovieE", Movie.class);
        movieobjE.display();
        Movie movieobjF= context.getBean("MovieF", Movie.class);
        movieobjF.display();

        // Testing the bean scope using prototype
        Movie movieobj4 = context.getBean("MovieF", Movie.class);
        System.out.println(movieobj4==movieobjF);

    }
}
