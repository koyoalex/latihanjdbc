package com.eksad.latihanjdbc;

import java.util.Scanner;

import com.eksad.latihanjdbc.model.Employee;

public class MenuApp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Pilih Menu :");
		System.out.println("1.Tampilkan Data Karyawan");
		System.out.println("2.Cari Karyawan");
		System.out.println("3.Input Karyawan");
		
		EmployeeService karyawan = new EmployeeService();
		
		String angkaTerpilih = scan.nextLine();
		
		if (angkaTerpilih.equals("1")) {
			karyawan.getAll();
			
			
		}else if (angkaTerpilih.equals("2")) {
	    	System.out.println("Masukkan Nama");
	    	String inputnama = scan.nextLine();
			karyawan.getByName(inputnama);
		
			
		}else if (angkaTerpilih.equals("3")) {
			
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
			System.out.println("input berhasil");
			
			
		} else {
			System.out.println("Salah Pilih Angka");

		}
		
		
		
		
		
		
		
		
	}

}
