package springJdbcTransactions.com.bridgelabz;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import springJdbcTransactions.com.bridgelabz.dao.BookPurchaseDao;

public class Main {
	private static ApplicationContext context;

	public static void main(String[] args) {
		context = new ClassPathXmlApplicationContext("springJdbcTransactions/spring.xml");
		BookPurchaseDao bookPurchaseDao = (BookPurchaseDao) context.getBean("bookPurchaseDaoImpl");
		bookPurchaseDao.bookPurchase(1, 1, "admin123");
	}
}
