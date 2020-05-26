package by.sergapit.javaspring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public TestSpring() {
    }

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        TestBean testBean = (TestBean)context.getBean("testBean", TestBean.class);
        System.out.println(testBean.getName());
        context.close();
    }
}
