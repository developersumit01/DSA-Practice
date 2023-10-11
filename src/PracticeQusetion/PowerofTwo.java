package PracticeQusetion;

import java.util.Scanner;

public class PowerofTwo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		if(n<1) {
			System.out.println(false);
		}else {
			System.out.println((n&(n-1))==0);
		}
//		System.out.println((Math.log10(n) / Math.log10(2)) % 1 == 0);
	}
}
