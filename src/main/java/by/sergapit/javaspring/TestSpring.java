package by.sergapit.javaspring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public TestSpring() {
    }

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Music music = context.getBean("musicBean", Music.class);
        System.out.println(testBean.getName());
        context.close();
    }
}
