package day4;
import java.util.*;
public class q6 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, mid_digit=0,total_digit;
		Scanner sc= new Scanner(System.in);
		 n=sc.nextInt();
	
		 if(n>100&&n<=999)
		 {
			 int mid =((n/10))%10;
			 if(mid%3==0)
			 {
				 System.out.println("trendy number");	
			 }
			 else
			 {
				 System.out.println("not a trendy number");	
			 }
	}

	}}
