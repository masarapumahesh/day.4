package day4;
import java.util.*;
public class q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n;
Scanner sc = new Scanner(System.in);
n= sc.nextInt();
System.out.println("enter n valvue");
while (n!=1)
{
	System.out.println(n+" ");
	if(n%2==0)
	{
		n=n/2;
	}
	else
	{
		n=3*n+1;
	}
	
	
}
	
System.out.print(n); 
	}}