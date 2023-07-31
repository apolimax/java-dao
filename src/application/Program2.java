package application;

import java.util.List;

import db.DB;
import model.dao.DAOFactory;
import model.dao.DepartmentDAO;
import model.entities.Department;

public class Program2 {
	public static void main(String[] args) {
		DepartmentDAO departmentDAO = DAOFactory.createDepartmenDAO();
		
		Department dep = new Department(null, "Food");
		System.out.println("\n--- TEST 1: insert department ---");
		departmentDAO.insert(dep);
		System.out.println(dep);
		
		System.out.println("\n--- TEST 2: findById department ---");
		dep = departmentDAO.findById(1); 
		System.out.println(dep);
		
		System.out.println("\n--- TEST 3: update department ---");
		dep = departmentDAO.findById(6);
		dep.setName("HR");
		departmentDAO.update(dep);
		System.out.println(dep);
		
		System.out.println("\n--- TEST 4: findAll departments ---");
		List<Department> deps = departmentDAO.findAll();
		
		for (Department d : deps) {
			System.out.println(d);
		}
		
		System.out.println("\n--- TEST 5: delete department ---");
		departmentDAO.deleteById(9);
		System.out.println("Delete department: " + 9);
		
		DB.closeConnection();
	}
}
