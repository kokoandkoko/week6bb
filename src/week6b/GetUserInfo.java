package week6b;

import java.util.Scanner;

public class GetUserInfo {
	public static void main(String[]args) {
		String name;
		int age;
		Scanner inputDevicve = new Scanner(System.in);
		System.out.print("please enter your name >> ");
		name = inputDevicve.nextLine();
		System.out.print("please enter your age >> ");
		age = inputDevicve.nextInt();
		System.out.println("Your name is "+name +" age "+age);
		
	}
}
