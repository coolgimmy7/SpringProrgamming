package com.bridgelabz.annotation.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

import com.bridgelabz.annotation.bean.EverydayBean;
import com.bridgelabz.annotation.bean.SundayBean;
import com.bridgelabz.annotation.condition.EverydayCondition;
import com.bridgelabz.annotation.condition.IsTodayTheBestDayOfWeekCondition;

@Configuration
public class AppConfig {

	private static final Logger LOGGER = LoggerFactory.getLogger(AppConfig.class);

	@Bean
	@Conditional(value = IsTodayTheBestDayOfWeekCondition.class) // value =if today sunday is true
	public SundayBean createSundayBean() {
		LOGGER.info("Today :-> Sunday bean is created successful.");
		return new SundayBean(); //
	}

	@Bean
	@Conditional(value = EverydayCondition.class) // everyday bean including sunday lso
	public EverydayBean createEverydayBean() {
		LOGGER.info("Everyday bean is created successful.");
		return new EverydayBean();
	}
}
