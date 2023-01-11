package practicespringaop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import practicespringaop.service.ProductService;

public class TestSpring {
    ApplicationContext context =new ClassPathXmlApplicationContext(new String[]{ "applicationContext.xml"});
    ProductService s = (ProductService) context.getBean("s");
    s.doSomeService

}
