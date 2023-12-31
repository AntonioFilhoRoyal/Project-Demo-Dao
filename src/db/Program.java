package db;

import java.util.Date;
import java.util.List;

import db.model.dao.DaoFactory;
import db.model.dao.SellerDAO;
import db.model.entites.Department;
import db.model.entites.Seller;

public class Program {

	public static void main(String[] args) {
		SellerDAO sellerDao = DaoFactory.createSellerDao();
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);
		
		System.out.println("\n > FindBydDepartment < ");
		
		Department department = new Department(4, null);
		List<Seller> list = sellerDao.findByDepartment(department);
		
		for(Seller l : list) {
			System.out.println(l);
		}
		
		System.out.println("\n > FindAll <");
		
		
		list = sellerDao.findAll();
		
		for(Seller l : list) {
			System.out.println(l);
		}
		
		System.out.println("\n > Insert <");
		Seller newSeller = new Seller(null, "Juarez", "example@email.com", new Date(), 600.0, department);
		sellerDao.insert(newSeller);
		System.out.println("Inserted new ID = " + newSeller.getId());
	
		System.out.println("\n Update");
		
		seller = sellerDao.findById(1);
	//	seller.setName("Carlos Browm");
	//	sellerDao.update(seller);
		System.out.println("Update Success");
		
		System.out.println("\n Delete ");
		sellerDao.deleteById(15);
		System.out.println("DELETED!");
	}
}
