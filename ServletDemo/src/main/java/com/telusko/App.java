package com.telusko;

import org.apache.catalina.Context;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;

import java.io.File;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws LifecycleException {
        System.out.println("Hello World!");

        Tomcat tomcat = new Tomcat();
        tomcat.setPort(8080);

        // This forces connector creation and initialization
        tomcat.getConnector();

        String docBase = new File(".").getAbsolutePath();
        Context context = tomcat.addContext("", docBase);

        System.out.println("Context created at: " + docBase);

        Tomcat.addServlet(context, "HelloServlet", new HelloServlet());
        context.addServletMappingDecoded("/hello", "HelloServlet");
        System.out.println("Servlet registered");

        tomcat.start();
        System.out.println("Tomcat started");
        tomcat.getServer().await();
    }
}
