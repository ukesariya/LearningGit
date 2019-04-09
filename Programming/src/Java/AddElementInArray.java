package Java;

import java.util.Arrays;
import java.util.Scanner;

public class AddElementInArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Entet the size of an array");
		int size=sc.nextInt();
		System.out.println("enter the  "+size+" elements in array");
		int array[]=new int[size];
		for(int i =0;i<array.length;i++)
		{
			array[i]= sc.nextInt();
			
		}
		System.out.println("array is "+Arrays.toString(array));
	}

}
