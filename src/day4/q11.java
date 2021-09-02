package day4;

import java.util.Scanner;
public class q11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b;
		Scanner sc = new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		while(a>0&&a<=b)
		{
			System.out.println(a);
			a++;
		}
	}

}
