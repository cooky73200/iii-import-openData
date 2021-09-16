package tw.iii.Dao;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;

import tw.iii.model.Att;
import tw.iii.model.Product;
import tw.iii.model.ProductAttributes;
import tw.iii.model.ProductImgs;
import tw.iii.model.ProductJ;
import tw.iii.model.ProductOptions;

public class ProductPack {

	public LinkedHashSet<ProductImgs> getimgs(Product product) {
		LinkedHashSet<ProductImgs> imgList = new LinkedHashSet<>();
		String[] images = product.getImages();
		for (String image : images) {
			ProductImgs pi = new ProductImgs();
			pi.setProductImg(image);
			pi.setProduct(product);
			imgList.add(pi);
		}
		return imgList;
	}

	public LinkedHashSet<ProductOptions> getOptions(Product product) {
		LinkedHashSet<ProductOptions> optionList = new LinkedHashSet<>();
		String[] options = product.getOptions();
		for (String option : options) {
			ProductOptions po = new ProductOptions();
			po.setpOption(option);
			po.setProduct(product);
			optionList.add(po);
		}
		return optionList;
	}
	
	public LinkedHashSet<ProductAttributes> getAttributes(Product product) {
		LinkedHashSet<ProductAttributes> attList = new LinkedHashSet<>();
		
		Att[] attArray = product.getAttributes();
		if(attArray!=null) {
			for(Att a : attArray) {
				ProductAttributes pa = new ProductAttributes();
				if(a!=null) {
					pa.setName(a.getName());
					pa.setValue(a.getValue());
					
				}
				pa.setProduct(product);
				attList.add(pa);
			}
			
			
		}
	
		
		return attList;
		
	}

}
