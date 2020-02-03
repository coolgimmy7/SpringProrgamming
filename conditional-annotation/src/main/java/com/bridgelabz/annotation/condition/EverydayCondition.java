package com.bridgelabz.annotation.condition;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class EverydayCondition implements Condition {

	@Override
	public boolean matches(final ConditionContext context, final AnnotatedTypeMetadata metadata) {
		return true;
	}
}
