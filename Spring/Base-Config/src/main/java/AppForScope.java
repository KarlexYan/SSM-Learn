import com.KarlexYan.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppForScope {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");

        BookService bookService1 = (BookService) ac.getBean("bookService");
        BookService bookService2 = (BookService) ac.getBean("bookService");

        System.out.println(bookService1);
        System.out.println(bookService2);
    }
}
