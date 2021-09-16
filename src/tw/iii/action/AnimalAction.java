package tw.iii.action;

import java.util.ArrayList;
import java.util.LinkedHashSet;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import tw.iii.Dao.OpenData;
import tw.iii.Dao.ProductPack;
import tw.iii.model.Animal;
import tw.iii.model.Hospital;
import tw.iii.model.Product;
import tw.iii.model.ProductAttributes;
import tw.iii.model.ProductImgs;
import tw.iii.model.ProductOptions;
import tw.iii.service.AnimalService;
import tw.iii.utils.HibernateUtil;

public class AnimalAction {
	static SessionFactory factory = HibernateUtil.getSessionFactory();
	static OpenData openData = new OpenData();

	public static void main(String[] args) {
//		importAnimal();
//		importHospital();
		importProduct();
		HibernateUtil.closeSessionFactory();

	}

	public static void importProduct() {
		Session session = factory.openSession();
		ProductPack productPack = new ProductPack();
		AnimalService service = new AnimalService(session);
		try {
			session.beginTransaction();
			Product[] products = openData.getProduct();
			for(Product product : products) {
				LinkedHashSet<ProductImgs> imgs = productPack.getimgs(product);
				LinkedHashSet<ProductOptions> options = productPack.getOptions(product);
				LinkedHashSet<ProductAttributes> atts = productPack.getAttributes(product);
				product.setTableImgs(imgs);
				product.setTableOptions(options);
				product.setTableAttributes(atts);
			}

			for(Product product:products) {
				service.insertProduct(product);
			}


			session.getTransaction().commit();
		}catch(Exception e ) {
			session.getTransaction().rollback();
		}
	}


	public static void importHospital() {
		Session session = factory.openSession();

		try {
			session.beginTransaction();
			openData = new OpenData();
			AnimalService service = new AnimalService(session);
			ArrayList<ArrayList<Hospital>> allHospital = openData.getAllHospital();
			allHospital.forEach((cityHospital) -> {
				cityHospital.forEach((hospital) -> {
					service.insertHospital(hospital);
				});
				session.flush();
				session.clear();
			});
			session.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
			session.getTransaction().rollback();
		}

	}

	public static void importAnimal() {
		Session session = factory.openSession();

		try {
			session.beginTransaction();
			openData = new OpenData();
			Animal[] animals = openData.getAnimal();
			AnimalService service = new AnimalService(session);
			int i = 0;
			for (Animal animal : animals) {

				service.insertAnimal(animal);
				if (i >= 200) {
					session.flush();
					session.clear();
					i = 0;
				}

			}
			session.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
			session.getTransaction().rollback();
		}

	}

}
