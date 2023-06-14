package db.model.dao;

import java.util.List;

import db.model.entites.Department;
import db.model.entites.Seller;

public interface SellerDAO {
	void insert(Seller obj);
	void update(Seller obj);
	void deleteById(Integer id);
	Seller findById(Integer id);
	List<Seller> findAll();
	List<Seller> findByDepartment(Department department);
}
