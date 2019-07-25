package com.psl.langFund;

public class Problem3 {
	private static int[] arr = {2,3,4,7,9,23,25,31,37,49,51,53,59};

	private static  int findPrime(int[] ar) {
		// TODO Auto-generated method stub
		boolean f;
		for (int i = 0; i < ar.length; i++) {
			f= isPrime(ar[i]);
			if(f){
				System.out.println(ar[i] + " ");
			}
		}
		return 0;
	}
	
	private static boolean isPrime(int n)
	{
		if(n<=1)
			return false;
		
		for(int i=2; i<(n/2);i++)
		{
			if(n % i ==0)
			{
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		findPrime(arr);
	}
}
