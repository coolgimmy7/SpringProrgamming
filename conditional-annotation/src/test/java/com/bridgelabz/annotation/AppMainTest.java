package com.bridgelabz.annotation;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import java.time.DayOfWeek;
import java.time.LocalDate;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.bridgelabz.annotation.bean.EverydayBean;
import com.bridgelabz.annotation.bean.SundayBean;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AppMainTest {

	@Autowired(required = false)
	private SundayBean sundayBean;

	@Autowired(required = false)
	private EverydayBean everydayBean;

	@Test
	public void testSundayBean() {
		final DayOfWeek dayOfWeek = LocalDate.now().getDayOfWeek();
		if (DayOfWeek.SUNDAY == dayOfWeek) {
			assertNotNull(sundayBean);
		} else {
			assertNull(sundayBean);
		}
	}

	@Test()
	public void testEverydayBean() {
		assertNotNull(everydayBean);
	}
}
