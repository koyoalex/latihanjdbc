package com.eksad.latihanjdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

import com.eksad.latihanjdbc.model.Employee;

public class EmployeeService {

	private static final String URL = "jdbc:postgresql://localhost:5432/eksaddb"; // jdbc adalah standar dari java .
																					// kemudian databasenya, kemudian
																					// server yg diambil portnya
																					// apa,kemudian nama databasenya apa

	private static final String USERNAME = "postgres";
	private static final String PASSWORD = "postgres";

	public Connection conn() {
		// connection untuk menghungkan aplikasi dengan database

		try {
			// agar aplikasi tidak stuck karena error
			Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
//			System.out.println("Koneksi Berhasil");
			return connection;

		} catch (SQLException e) {
			System.out.println("Koneksi Gagal");
			e.printStackTrace();
			return null;

		}

	}

	public void getAll() {
		try {
			Connection con = conn();
			Statement st = con.createStatement();

			String sql = "SELECT* from employee";
			ResultSet result = st.executeQuery(sql);

			while (result.next()) {
				int id = result.getInt("id");
				String name = result.getString("name");
				Date don = result.getDate("dob");
				String address = result.getString("address");

				System.out.print("ID : " + id);
				System.out.print(",Name : " + name);
				System.out.print(", Date of Birth : " + don);
				System.out.print("Address : " + address);

			}

			result.close();
			st.close();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			// blok trus klik kanan trus pilih surround with try catch
		}
	}

	public void getById(int id) {
		try {
			Connection con = conn();
			Statement st = con.createStatement();

			String sql = "SELECT* from employee WHERE id = " + id;
			ResultSet result = st.executeQuery(sql);

			while (result.next()) {
				id = result.getInt("id");
				String name = result.getString("name");
				Date don = result.getDate("dob");
				String address = result.getString("address");

				System.out.print("ID : " + id);
				System.out.print(",Name : " + name);
				System.out.print(", Date of Birth : " + don);
				System.out.print("Address : " + address);

			}

			result.close();
			st.close();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			// blok trus klik kanan trus pilih surround with try catch
		}
	}

	public void getByName(String name) {
		try {
			Connection con = conn();
			Statement st = con.createStatement();

			String sql = "SELECT* from employee WHERE name  =" + "'" + name + "'"  ;
			ResultSet result = st.executeQuery(sql);

			while (result.next()) {
				int id = result.getInt("id");
				name = result.getString("name");
				Date don = result.getDate("dob");
				String address = result.getString("address");

				System.out.print("ID : " + id);
				System.out.print(",Name : " + name);
				System.out.print(", Date of Birth : " + don);
				System.out.print("Address : " + address);

			}

			result.close();
			st.close();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}
		

	}
	
	public void save(String nama , String address) {
		try {
			Connection con = conn();
			Statement st = con.createStatement();

//			String sql = "insert into employee(name,dob,address) values ("
//					+ "'abc',"
//					+"'2019-06-28',"
//					+"'Bandung')";
			String sql = "insert into employee(name,address) values ("
					+ "'" + nama + "',"
					+"'" + address + "')"  ;
				
//			 sql = "update employee set name = " +  "'" + nama + "',"
//			 		+ "address ="+ "'"+ address+ "'" 
//			 		;
			int result = st.executeUpdate(sql);
			
			
/*
			while (result.next()) {
				int id = result.getInt("id");
				name = result.getString("name");
				Date don = result.getDate("dob");
				String address = result.getString("address");

				System.out.print("ID : " + id);
				System.out.print(",Name : " + name);
				System.out.print(", Date of Birth : " + don);
				System.out.print("Address : " + address);

			}

			result.close();
*/
			st.close();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		}
		
		public void save2(Employee employee) {
			try {
				Connection con = conn() ;
				Statement st = con.createStatement();

				String sql = "insert into employee(name,dob,address) values ("
						+ "'" + employee.getName() + "',"
								+ "'" + employee.getDob() + "',"
						+"'" + employee.getAddress() + "')"  ;
					

				int result = st.executeUpdate(sql);

				st.close();
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
		
		
	}
		}

}
