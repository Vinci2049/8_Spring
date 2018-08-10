package onlineStore.DAO;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import onlineStore.Product;

@Repository
public class ProductDAOImpl implements ProductDAO {

    private List<Product> productList = new ArrayList<>();
    
    @Override
    public List<Product> productList() {
        //System.out.println(products);
        return productList;
    }
	
	@Override
	public boolean addProduct(Product product) {
		return productList.add(product);
	}

	@Override
	public Product getProduct(String name) {
		for (Product currentProduct : productList) {
			if (currentProduct.getName() == name) {
				return currentProduct;
			}
		}
		return null;
	}

	@Override
	public boolean deleteProduct(Product product) {
		if (productList.contains(product)) {
			return productList.remove(product);
		}
		return false;
	}

	@Override
    public boolean updateProduct(Product product, String name, long price) {
		if (product != null) {
			if (name != null) {
				product.setName(name);
			}
			product.setPrice(price);
			return true;
		} else {
			return false;
		}
	}

	@Override
	public void printProductList() {
		for(Product currentProduct: productList) {
			System.out.println(currentProduct.getId()+". "+currentProduct.getName()+" Цена: "+currentProduct.getPrice());
		}
	}
	
}
