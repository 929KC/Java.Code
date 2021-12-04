package intheheima5;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {

	public static void main(String[] args) {

		ArrayList<Student> array = new ArrayList<Student>();
		while (true) {
			System.out.println("-------欢迎来到学生管理系统-------");
			System.out.println("1添加学生");
			System.out.println("2删除学生");
			System.out.println("3修改学生");
			System.out.println("4查看所有学生");
			System.out.println("5退出");
			System.out.println("请输入出你的选择");
			Scanner sc = new Scanner(System.in);
			String line = sc.nextLine();
			switch (line) {
			case "1":
				// System.out.println("添加学生");
				addStudent(array);
				break;
			case "2":
				// ystem.out.println("删除学生");
				deleteStudent(array);
				break;
			case "3":
				// System.out.println("修改学生");
				updateStudent(array);
				break;
			case "4":
				// System.out.println("查看所有学生");
				findStudent(array);
				break;
			case "5":
				System.out.println("谢谢使用");
				System.exit(0);// JVM停止使用
			}
		}

	}

	// 定义一个方法，用于添加学生信息
	public static void addStudent(ArrayList<Student> array) {
		Scanner sc = new Scanner(System.in);
		String sid;
		while (true) {
			System.out.println("请输入学生学号");
			sid = sc.nextLine();
			boolean flag = isUsed(array, sid);
			if (flag) {
				System.out.println("你输入的学号已被使用，请重新输入");
			} else {
				break;
			}
		}
		System.out.println("请输入你的姓名");
		String name = sc.nextLine();
		System.out.println("请输入你的年龄");
		String age = sc.nextLine();
		System.out.println("请输入你的居住地");
		String address = sc.nextLine();
		Student s = new Student();
		s.setSid(sid);
		s.setName(name);
		s.setAddress(address);
		s.setAge(age);
		array.add(s);
	
		System.out.println("添加学生成功");
	}

	private static boolean isUsed(ArrayList<Student> array, String sid) {
		boolean flag = false;
		for (int i = 0; i < array.size(); i++) {
			Student s = array.get(i);
			if (s.getSid().equals(sid)) {
				flag = true;
				break;
			}
		}
		return flag;
	}

	// 定义一个方法，用于查看学生
	public static void findStudent(ArrayList<Student> array) {
		if (array.size() == 0) {
			System.out.println("无信息，请先添加信息后查询");
			// 为了不让程序往下执行，给出return;
			return;
			}

			
			System.out.println("学号\t\t姓名\t\t年龄\t\t居住地");

			
			for (int i = 0; i < array.size(); i++) {
			Student s = array.get(i);
			System.out.println(s.getSid() + "\t" + s.getName() + "\t\t" + s.getAge() + "岁\t" + s.getAddress());

		}
	}

	// 定义一个方法，用于删除学生
	public static void deleteStudent(ArrayList<Student> array) {

		Scanner sc = new Scanner(System.in);
		System.out.println("请输入你要删除学生的学号");
		String sid = sc.nextLine();
		// 遍历 集合将对应学生从对象中删除
		int index = -1;
		for (int i = 0; i < array.size(); i++) {
			Student s = array.get(i);
			if (s.getSid().equals(sid)) {
				index = i;
				break;
			}

		}
		if (index == -1) {
			System.out.println("该信息不存在，请重新输入");
		} else {
			array.remove(index);
			System.out.println("删除学生成功");
		}

//			for(int i=0; i<array.size(); i++) {
//				array.remove(i);
//				break;
//			}
		// System.out.println("删除学生成功");

	}

	// 定义一个方法，用于修改学生信息
	public static void updateStudent(ArrayList<Student> array) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入新的姓名");
		String name = sc.nextLine();
		System.out.println("请输入新的年龄");
		String age = sc.nextLine();
		System.out.println("请输入新的居住地");
		String address = sc.nextLine();
		System.out.println("请输入新的学号");
		String sid = sc.nextLine();
		Student s = new Student();
		s.setName(name);
		s.setAddress(address);
		s.setSid(sid);
		s.setAge(age);
		for (int i = 0; i < array.size(); i++) {
			Student student = array.get(i);
			if (student.getSid().equals(sid)) {
				array.set(i, s);
				break;
			}
		}
		System.out.println("修改学生成功");

	}
}
