package com.eksad.latihanjdbc;

import java.util.Scanner;

import com.eksad.latihanjdbc.model.Employee;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
//        Employee employee = new Employee();
//        employee.conn();
//        employee.getAll();
//        employee.getById(2);
//        employee.getByName("mta");
//        employee.save();
		Scanner scan = new Scanner(System.in);

//    	System.out.println("Masukkan Nama");
//    	String inputnama = scan.nextLine();
//    	
//    	
//    	System.out.println("Masukkan Alamat :");
//    	String inputalamat= scan.nextLine();
//    

//    	String hasil = Employee.save(inputnama, inputalamat);
		EmployeeService employeeservice = new EmployeeService();
		Employee employee = new Employee();
		System.out.println("Masukkan Nama");
		String inputnama = scan.nextLine();
		employee.setName(inputnama);
		
		
		System.out.println("DOB :");
		String inputdob = scan.nextLine();
		employee.setDob(inputdob);
		
		

		System.out.println("Masukkan Alamat :");
		String inputalamat = scan.nextLine();
		employee.setAddress(inputalamat);
		
		

		employeeservice.save2(employee);
		
//		employeeService.save2(employee);
		System.out.println("Pilih Angka :");
		System.out.println("Pilih Angka :");
		System.out.println("Pilih Angka :");
		System.out.println("Pilih Angka :");
		

	}
}
