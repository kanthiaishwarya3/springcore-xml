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
        // ApplicationContext.............

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Movie movieobj = context.getBean("movie", Movie.class);
        movieobj.display();

        // XmlBeanFactory............

        BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("beans.xml"));
        Movie  movieobjxml = beanFactory.getBean("movie",Movie.class);
        movieobjxml.display();

        // BeanDefinitionReader...............

        DefaultListableBeanFactory beanFactoryReader= new DefaultListableBeanFactory();
        BeanDefinitionReader reader = new XmlBeanDefinitionReader(beanFactoryReader);
        reader.loadBeanDefinitions(new FileSystemResource("src/main/resources/beans.xml"));
        Movie moviebean= (Movie) beanFactory.getBean("movie");
        moviebean.display();

    }
}