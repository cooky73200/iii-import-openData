package tw.iii.Dao;

import java.util.ArrayList;

import org.hibernate.Session;

import tw.iii.model.Animal;
import tw.iii.model.Hospital;
import tw.iii.model.Product;

public class AnimalDao {
	private Session session;
	
	public AnimalDao() {
		
	}
	public AnimalDao(Session session ) {
		this.session = session;
	}
	
	public void insertAnimal(Animal animal) {
		session.save(animal);
		
	}
	
	public void insertHospital(Hospital hospital) {
		session.save(hospital);
	}
	public void insertProduct(Product product) {
		session.save(product);
	}

}
