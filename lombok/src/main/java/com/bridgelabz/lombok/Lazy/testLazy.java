package com.bridgelabz.lombok.Lazy;

import lombok.extern.java.Log;

@Log
public class testLazy {

	public static void main(String[] args) {

		// Lazy
		GetLazy getLazy = new GetLazy();
		Long beforeTime = System.currentTimeMillis();
		double[] value1 = getLazy.getLazyValue();
		Long afterTime1 = System.currentTimeMillis();
		double[] value2 = getLazy.getLazyValue();
		Long afterTime2 = System.currentTimeMillis();

		log.info("diff : " + (afterTime1 - beforeTime));
		log.info("diff 2nd time : " + (afterTime2 - afterTime1));
		log.info("value1 : " + value1);
		log.info("value2 : " + value2);
	}
}
