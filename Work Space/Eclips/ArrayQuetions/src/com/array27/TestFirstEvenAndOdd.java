package com.array27;

import java.util.Scanner;

public class TestFirstEvenAndOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb=new Scanner(System.in);
		System.out.println("enter size of an array");
		int a=kb.nextInt();
		int arr[]=new int[a];
		System.out.println("enter elements in an array");
		for (int i = 0; i < arr.length; i++) {
			arr[i]=kb.nextInt();
		}
		FirstEvenAndOdd.printEvenAndOdd(arr);

	}

}
