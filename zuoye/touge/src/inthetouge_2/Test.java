package inthetouge_2;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		int age = sc.nextInt();
		String sex = sc.next();
		Person p = new Person(name,age,sex);
		p.display();
	}

	}


