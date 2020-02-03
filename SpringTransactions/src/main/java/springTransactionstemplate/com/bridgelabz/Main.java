package springTransactionstemplate.com.bridgelabz;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import springTransactionstemplate.com.bridgelabz.dao.BookPurchaseDao;

public class Main {
	private static ApplicationContext context;

	public static void main(String[] args) {
		context = new ClassPathXmlApplicationContext("springTransactionstemplate/spring.xml");
		BookPurchaseDao bookPurchaseDao = (BookPurchaseDao) context.getBean("bookPurchaseDaoImpl");
		bookPurchaseDao.bookPurchase(1, 1, "admin123"); // user id=1 and password=admin123
	}
}
