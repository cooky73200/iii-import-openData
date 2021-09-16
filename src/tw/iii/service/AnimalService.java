package tw.iii.service;

import java.util.ArrayList;

import org.hibernate.Session;

import tw.iii.Dao.AnimalDao;
import tw.iii.model.Animal;
import tw.iii.model.Hospital;
import tw.iii.model.Product;

public class AnimalService {
	private AnimalDao animalDao;
	public AnimalService() {
		
	}
	public AnimalService(Session session) {
		this.animalDao = new AnimalDao(session);
	}
	public void insertAnimal(Animal animal) {
		
		animalDao.insertAnimal(animal);
	}
	public void insertHospital(Hospital hospital) {
		animalDao.insertHospital(hospital);
	}
	public void insertProduct(Product product) {
		animalDao.insertProduct(product);
	}

}
