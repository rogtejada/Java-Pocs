package lists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int n;
		int id;
		String name;
		double salary;
		double increase;
		Scanner s = new Scanner(System.in);
		List<Employee> list = new ArrayList<>();

		System.out.println("How many employees will be registered?");
		n = Integer.parseInt(s.nextLine());
		Employee test = null;

		for (int i = 0; i < n; i++) {
			do {
				try {

					System.out.println("Employee #" + (i + 1));
					System.out.print("Id: ");
					id = Integer.parseInt(s.nextLine());
					System.out.print("Name: ");
					name = s.nextLine();
					System.out.print("Salary: ");
					salary = Double.parseDouble(s.nextLine());
					int idTest = id;
					test = list.stream().filter(x -> x.getId() == idTest).findFirst().orElse(null);
					if (test == null) {
						Employee e = new Employee(id, name, salary);
						list.add(e);
					} else {
						throw new Exception("Id already Taken");
					}

				} catch (Exception e) {
					System.out.println("ERRO: " + e.getMessage());
				}
			} while (test != null);
		}
		
		test = null;
		while (test==null) {
			try {
				System.out.println("--------");
				System.out.print("Employee id that will have the salary increased:  ");
				int testId = Integer.parseInt(s.nextLine());
				test = list.stream().filter(x -> x.getId() == testId).findFirst().orElse(null);
				if (test != null) {
					System.out.print("Enter the percentage:  ");
					increase = Double.parseDouble(s.nextLine());
					test.increaseSalary(increase);
				} else {
					throw new Exception("Id does not Exists");
				}

				System.out.println("--------");
				System.out.println("List of employees:");
				for (Employee obj : list) {
					System.out.println(obj);
				}
			} catch (Exception e) {
				System.out.println("Erro: " + e.getMessage());
			}
		}
		s.close();
	}
}
