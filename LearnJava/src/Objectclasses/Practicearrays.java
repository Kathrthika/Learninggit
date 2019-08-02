package Objectclasses;

import java.util.Arrays;

public class Practicearrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Program starts");
		int[] intArray = new int[5];
		System.out.println("array name:"+intArray);
		System.out.println("array length:"+intArray.length);
		System.out.println("2nd element"+intArray[1]);
		System.out.println("Array elements are");
		Arrays.sort(intArray);
		
		for (int i = 0;i<intArray.length;i++) {
			System.out.println(i+" elements in "+intArray[i]);
			
		}
		
		for(int k:intArray) {
			System.out.println("Element"+k);
		}
	}

}
