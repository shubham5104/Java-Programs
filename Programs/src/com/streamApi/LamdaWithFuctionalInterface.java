package com.streamApi;

import java.util.function.Function;

public class LamdaWithFuctionalInterface {

	public static void main(String[] args) {
		
		Function<Integer, Integer> square= n->n*n;
		
		System.out.println(square.apply(5));

	}

}
