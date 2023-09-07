package com.smartBazar.Dao;


import java.sql.Connection;
import java.util.*;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


import com.mysql.cj.jdbc.Driver;
import com.smartBazar.Dto.CustomerDto;

public class CustomerDao {
	
	
	
	public void signup(CustomerDto customerDto) throws Throwable {
		//loading
		Driver d = new Driver();
		DriverManager.registerDriver(d);
		
		//establishing the connection
		String url = "jdbc:mysql://localhost:3306/custdb?createDatabaseIfNotExist=true";
		String user = "root";
		String pwd = "root";
		Connection con = DriverManager.getConnection(url, user, pwd);
	

		Statement cs = con.createStatement();
		cs.execute(
				"create table If not Exists customer (name varchar(120),phone bigint,email varchar(120),password varchar(120),wallet bigint)");
		PreparedStatement stat = con.prepareStatement("insert into customer values(?,?,?,?,?)");
		stat.setString(1, customerDto.getName());
		stat.setLong(2, customerDto.getPhone());
		stat.setString(3, customerDto.getEmail());
		stat.setString(4, customerDto.getPassword());
		stat.setDouble(5, customerDto.getWallet());

		int n = stat.executeUpdate();

		con.close();
		stat.close();
		cs.close();
	}

	public  boolean  login(CustomerDto customerDto) throws Throwable {
		// loading
		Driver d = new Driver();
		DriverManager.registerDriver(d);
		//establishing the connection
		String url = "jdbc:mysql://localhost:3306/custdb?createDatabaseIfNotExist=true";
		String user = "root";
		String pwd = "root";
		Connection con = DriverManager.getConnection(url, user, pwd);
		

		Statement cs = con.createStatement();

		PreparedStatement stat = con.prepareStatement("select * from customer where email=? AND password=? ");
		
		stat.setString(1,customerDto.getEmail() );
		stat.setString(2,customerDto.getPassword());

		ResultSet res = stat.executeQuery();

				
		if(res.next()) {
			return true;
			}
		else {
			return false;
		}
		
		
	}
	
	public double getwalletData(CustomerDto customerDto) throws Throwable {
		//loading  
		Driver d = new Driver();
		DriverManager.registerDriver(d);
	
		// establish the connection
		String url = "jdbc:mysql://localhost:3306/custdb";
		String user = "root";
		String pwd = "root";
		Connection con = DriverManager.getConnection(url, user, pwd);
	

		Statement cs = con.createStatement();

		PreparedStatement stat = con.prepareStatement("select wallet from customer where email=? and password=? ");
		
		stat.setString(1,customerDto.getEmail() );
		stat.setString(2,customerDto.getPassword());	
		ResultSet res = stat.executeQuery();	
		double value=0;
		while(res.next()) {
			 value=res.getLong("wallet");
			
		}
		return value;
		
				
	}
	public void updateWallet( CustomerDto customerDto) throws Throwable {
		//loading  
				Driver d = new Driver();
				DriverManager.registerDriver(d);
			
				// establish the connection
				String url = "jdbc:mysql://localhost:3306/custdb";
				String user = "root";
				String pwd = "root";
				Connection con = DriverManager.getConnection(url, user, pwd);
			

				Statement cs = con.createStatement();

				PreparedStatement stat = con.prepareStatement("update customer set wallet=? where email=? and password=?");
				stat.setDouble(1,customerDto.getWallet());
				stat.setString(2,customerDto.getEmail());
				stat.setString(3,customerDto.getPassword());
				
				stat.execute();
				
		
	}
	
	
	
}
