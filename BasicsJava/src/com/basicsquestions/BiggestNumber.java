package com.basicsquestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class BiggestNumber {
	//biggest of two number 
	public static String big(int a,int b)
	{
		if(a>b)
			return "a is biggest";
		else
			return "b is biggest";
	}
	//biggets of three number
	public static String big(int a,int b,int c)
	{
		if(a>b&&a>c)
			return "a is biggest";
		else if(b>a&&b>c)
			return "b is biggest";
		else 
			return "c is the biggest";
	}
	//biggest of two numbers using ternary operator 
	public static void bigTernary(int a,int b)
	{
		int result = a>b?a:b;
		System.out.println("The result :"+result);
	}
	//biggest number of three using ternay operator 
	public static void biggestTernary(int a,int b,int c)
	{
		int result= (a>b?a:b)>c?(a>b?a:b):c;
		System.out.println(result);
	}
	//largest number in an array
	public static void largest(int[] arr,int largest)
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>largest)
				largest =arr[i];
		}
		System.out.println(largest);
	}
	//Largest number by using streams
	public static void streamsLarge(int[] arr)
	{
		int large= Arrays.stream(arr).max().getAsInt();
		System.out.println(large);
	}
	//by using sorting 
	public static void sort(int[] arr)
	{
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=0;j<arr.length-1-i;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.println(arr[arr.length-1]);
	}
	//by using predefined function
	public static void preDefined(int[] arr)
	{
		Arrays.sort(arr);
		System.out.println(arr[arr.length-1]);
	}
	//by using collections 
	public static void example(int[] arr)
	{
		List<Integer> list= new ArrayList<>();
		for(int i=0;i<arr.length;i++)
		{
			list.add(arr[i]);
		}
		System.out.println(Collections.max(list));
	}
	//arr = {2, 3, 10, 6, 4, 8, 1}
	// Two elements with largest difference: 10 and 1
	public static int[] arrayP(int[] a)
	{
		int d,max=a[1]-a[0];
		int num1=a[1];
		int num2=a[0];
		 int res[] = new int[3];
		 for(int i=0;i<a.length;i++)
		 {
			 for(int j=i+1;j<a.length;j++)
			 {
				 d=Math.abs(a[i]-a[j]);
				 if(d>max)
				 {
					 max=d;
					 num1=a[i];
					 num2=a[j];
				 }
			 }
		 }
		 res[0]=max;res[1]=num1;
		 res[2]=num2;
		 return res;
	}
	//second largest number
	public static void secondLargest(int[] arr,int size)
	{
		int first,second,i;
		if(size<2)
		{
			System.out.println("wrong input:");
			return;
		}
		first=second=Integer.MIN_VALUE;
		for( i=0;i<size;i++)
		{
			if(arr[i]>first)
			{
				second=first;
				first=arr[i];
			}
			else if (arr[i] > second && arr[i] != first)
            second = arr[i];
		}
		if(second==Integer.MAX_VALUE)
		{
			System.out.println("their is no second largest number");
		}
		else 
		{
			System.out.println(second);
		}
	}
	//very important question kth largest numbers in array by using 
	//sorting we can do but these code will run all test cases
	public static void kLargest(Integer [] arr,int k)
	{
		 Arrays.sort(arr, Collections.reverseOrder());
		 for (int i = 0; i < k; i++)
	            System.out.print(arr[i] + " ");
	}
	 public static ArrayList<Integer> kLargest(int[] arr, int k)
	 {
		 Integer[] a= Arrays.stream(arr).boxed().toArray(Integer[] :: new);
		 Arrays.sort(a, Collections.reverseOrder());
		 ArrayList<Integer> list = new ArrayList<>(k);

	        for (int i = 0; i < k; i++)
	        {
	        	list.add(a[i]);
	        }
	        return list;
	 }
	 //kth smallest number
	  public static int kthSmallest(Integer[] arr, int K)
	    {
	        // Sort the given array
	        Arrays.sort(arr);

	        // Return K'th element in
	        // the sorted array
	        return arr[K - 1];
	    }
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	//	System.out.println("Enter the numbers :");
//		int n = sc.nextInt();
//		int m=sc.nextInt();
		BiggestNumber b= new BiggestNumber();
//		System.out.println(b.big(n, m));
//		System.out.println(b.big(m, n, 98));
//		b.bigTernary(n, m);
//		b.biggestTernary(n, m, 34432);
//		int[] arr= new int[5];
//		for(int i=0;i<arr.length;i++)
//		{
//			arr[i]=sc.nextInt();
//		}
//		
//		//b.largest(arr, arr[0]);
//		//b.sort(arr);
//		//b.preDefined(arr);
//		b.example(arr);
//		int[] a= {34,425,2654,54,454,45677,456,45};
//		int[] result = b.arrayP(a);
//		System.out.println("Difference: "+result[0]);
//		System.out.println(result[1]+"....::))"+result[2]);
		//b.secondLargest(a, a.length-1);
		Integer arr[]
	            = new Integer[] { 1, 23, 12, 9, 30, 2, 50 };
	        int k = 3;
	        kLargest(arr, k);
	        System.out.println();
	        System.out.println(kthSmallest(arr,k));

	}

}
