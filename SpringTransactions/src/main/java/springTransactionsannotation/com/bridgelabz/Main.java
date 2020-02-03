package springTransactionsannotation.com.bridgelabz;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import springTransactionsannotation.com.bridgelabz.dao.BookPurchaseDao;

public class Main {
	private static ApplicationContext context;
	
	public static void main(String[] args) throws Exception {
		context=new ClassPathXmlApplicationContext("springTransactionsannotation/spring.xml"); 
		BookPurchaseDao bookPurchaseDao = (BookPurchaseDao)context.getBean("bookPurchaseDaoImpl");
		bookPurchaseDao.bookPurchase(1, 1, "admin123");
	}
}
