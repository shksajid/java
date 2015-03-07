package com.techPalle.examples;

import java.util.Scanner;

public class Prime {
	
     
	public static void main(String[] args) {
		int flag=0;
      Scanner scr = new Scanner(System.in);
      System.out.println("enter num");
      int num=scr.nextInt();
      for(int i=2;i>0;i++){
       int count=0;
       
    	  for(int j=2;j<i;j++){
    		  if(i%j==0){
    			  count++;
    			  break;
    		  }
    	  }
    	  
    	  if(count==0){
    		  flag++;
        	  System.out.println(i);
        	  if(flag==num){
        		  return;
        	  }
          }
      
      
      }
	}

}
