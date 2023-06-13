package db.model.dao;

import java.util.List;

import db.model.entites.Department;

public interface DepartmentDAO {
	void insert(Department obj);
	void update(Department obj);
	void deleteById(Integer id);
	Department findById(Integer id);
	List<Department> findAll();
}
