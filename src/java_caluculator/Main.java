package java_caluculator;

import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
	
	Scanner sc=new Scanner(System.in);
	int a,b,ch;
	System.out.println("enter two numbers\n ");
	a=sc.nextInt();
	b=sc.nextInt();
	System.out.println("enter your choice\n");
	System.out.println("\n 1.add  2.sub 3.mul 4.div 5.modulus 6.exit\n");
	System.out.println("enter your choice");
	
	Caluculate c=new Caluculate();
	while(true) {
		ch=sc.nextInt();
		switch(ch)
		{
		case 1:
			System.out.println(c.add(a, b));
			break;
		case 2:
			System.out.println(c.sub(a, b));
			break;
		case 3:
			System.out.println(c.mul(a, b));
			break;
		case 4:
			System.out.println(c.div(a, b));
			break;
		case 5:
			System.out.println(c.mod(a, b));
			break;
		default:
			c.exit();
			break;
		}
	}
	
  }
}
