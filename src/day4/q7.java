package day4;
import java.util.Scanner;
public class q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
			int n,a,i=0,count=0,s=0;
			Scanner sc = new Scanner(System.in);
			System.out.println("eneter the n value ");
			n = sc.nextInt();
			do
			{
				count++;
				System.out.println("enter a value");
				a=sc.nextInt();
				s=s+a;
				i++;// TODO Auto-generated method stub
			}
			while(s<n);
			System.out.println("no .of turns "+count);
				

	}

}
