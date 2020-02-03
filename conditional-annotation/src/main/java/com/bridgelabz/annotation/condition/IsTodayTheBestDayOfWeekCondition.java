package com.bridgelabz.annotation.condition;

import java.time.DayOfWeek;
import java.time.LocalDate;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class IsTodayTheBestDayOfWeekCondition implements Condition {

	@Override
	public boolean matches(final ConditionContext context, final AnnotatedTypeMetadata metadata) {
		final DayOfWeek dayOfWeek = LocalDate.now().getDayOfWeek();
		return DayOfWeek.SUNDAY == dayOfWeek; // send true if today sunday
	}
}
