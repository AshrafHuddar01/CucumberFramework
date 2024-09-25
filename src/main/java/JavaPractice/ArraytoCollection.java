package JavaPractice;

import java.util.Arrays;


public class ArraytoCollection {
	
	public static void main(String[] args) {
		 String[] array = {"apple", "banana", "cherry"};
		 
		 StringBuilder SB =new StringBuilder();
       
		 System.out.println(Arrays.asList(array)); ////output--[apple, banana, cherry]
		 
		 for(int i=0;i<array.length;i++)
		 {
			 System.out.print(array[i]+ " ");  //output--apple banana cherry 
		
		     SB.append(array[i]);
		     
		     
		     
		     if(i<array.length-1) {  //to add commas
		    	 SB.append(", ");
		     }
		 }
		 
		 System.out.print(SB); //output--apple, banana, cherry
		 
		 
		 
	}
}



