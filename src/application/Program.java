package application;

import java.util.List;

import model.dao.DAOFactory;
import model.dao.SellerDAO;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		SellerDAO sellerDAO = DAOFactory.createSellerDAO();
		
		System.out.println("--- TEST 1: findById ---");
		Seller seller = sellerDAO.findById(3);
		System.out.println(seller);
		
		System.out.println("\n--- TEST 2: findByDepartment ---");
		Department dep = new Department(1, "Computers");
		List<Seller> sellersByDepartment = sellerDAO.findByDepartment(dep);
		
		for (Seller s : sellersByDepartment) {
			System.out.println(s);
		}
		
		System.out.println("\n--- TEST 3: findByAll ---");
		List<Seller> allSellers = sellerDAO.findAll();
		
		for (Seller s : allSellers) {
			System.out.println(s);
		}
	}

}
