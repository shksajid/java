package com.techPalle.examples;

import java.util.Scanner;

public class PrimeNumberChecking {

	public static void main(String[] args) {
		System.out.println("enter the number");
	    Scanner sc = new Scanner(System.in);
	    int i = sc.nextInt();
	    for(int p=2;p<i;p++){
	    	if(i%p==0){
	    		System.out.println("its not prime");
	    		return;
	    	}
	    }
	    System.out.println("its prime");
	}

}
