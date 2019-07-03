package com.eksad.latihanjdbc;

import java.util.Scanner;

public class AppDua {
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Pilih Angka :");
		System.out.println("1.Jeruk");
		System.out.println("2.Mangga");
		System.out.println("3.Apel");
		
		String angkaTerpilih = scan.nextLine();
		
		if (angkaTerpilih.equals("1")) {
			System.out.println("Saya pilih jeruk");
			
		}else if (angkaTerpilih.equals("2")) {
			System.out.println("Saya pilih mangga");
			
		}else if (angkaTerpilih.equals("3")) {
			System.out.println("Saya pilih apel");
			
		} else {
			System.out.println("Anda salah pilih ");

		}
	}
	
	

}
