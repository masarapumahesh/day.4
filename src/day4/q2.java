package day4;
import java.util.*;
public class q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n,i=1,fact=1;
Scanner sc = new Scanner(System.in);
System.out.println("enter the n valve");
n=sc.nextInt();
for(i=1;i<n;i++) {
	fact=fact*i;
	
}
if (n==fact) 
{
	System.out.println("yes,no");
}
System.out.println(fact);
	
}
	}

