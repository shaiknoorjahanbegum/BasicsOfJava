package com.basicsquestions;

public class PalindromeNumber {
	//palindrome
	public static String palindrome(int n)
	{
		int rev=0;int temp=n;
		while(n>0)
		{
			rev=rev*10+n%10;
			n/=10;
		}
		if(temp==rev)
			return "palindrome number";
		else 
			return "not palindrome number";
		
	}
	//palindrome range 
	public static void palindromeRange(int n)
	{
		int rev=0;
		for(int i=101;i<=n;i++)
		{
			int temp=i;rev=0;
			while(temp>0)
			{
				rev=rev*10+temp%10;
				temp/=10;
			}
			if(i==rev)
			{
				System.out.println(i);
			}
		}
	}
	public int reverse(int x) {
	    long sum =0;
	    
	    long temp=x;
	    if(x<0)
	        temp=-x;
	   // count how many digits
	    int digits= 0;
	    while(temp>=1){
	        temp/=10;
	        digits++;
	        
	    }
	    // 123= 3*100+2*10+1*1
	     while(digits>0){
	        sum+=(x%10)*(Math.pow(10,digits-1));
	        digits--;
	        x=x/10;
	        
	    }
	    if(sum>Integer.MAX_VALUE||sum<Integer.MIN_VALUE)
	        return 0;
	    
	    return (int)sum;
	}
	public static void main(String[] args) {
		//System.out.println(palindrome(121));
		//palindromeRange(1000);
		PalindromeNumber p= new PalindromeNumber();
		System.out.println(p.reverse(-321));
	}

}
