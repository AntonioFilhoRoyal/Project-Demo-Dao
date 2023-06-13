package db;

import java.util.Date;

import db.model.entites.Department;
import db.model.entites.Seller;

public class Program {

	public static void main(String[] args) {
		Department department = new Department(1, "Book");
		Seller seller = new Seller(1, "Antonio", "example@email.com", new Date(), department);
		
		System.out.println(seller);
		
	}

}
