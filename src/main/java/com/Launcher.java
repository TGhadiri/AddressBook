package com;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Launcher {
    public void launch() {
        String[] contextPaths = new String[] {"app-content.xml"};
        new ClassPathXmlApplicationContext(contextPaths);
    }
}