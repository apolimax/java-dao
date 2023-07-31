package application;

import java.util.Date;
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
		
//		System.out.println("\n--- TEST 4: insert seller ---");
//		Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", new Date(), 4000.0, dep);
//		sellerDAO.insert(newSeller);
//		System.out.println(newSeller);

		System.out.println("\n--- TEST 5: update seller ---");
		seller = sellerDAO.findById(1);
		seller.setName("Bruce Wayne");
		seller.setEmail("bruce@yahoo.com");
		sellerDAO.update(seller);
		System.out.println("Seller updated: " + seller.getName());
		
		System.out.println("\n--- TEST 6: delete seller ---");
		sellerDAO.deleteById(11);
		System.out.println("Seller deleted id: " + 11);

	}

}
