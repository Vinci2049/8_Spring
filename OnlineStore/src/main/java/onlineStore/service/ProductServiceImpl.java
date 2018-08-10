package onlineStore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
//import com.example.ProductDAO;
import org.springframework.stereotype.Service;

import onlineStore.DAO.ProductDAO;
import onlineStore.Product;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	ProductDAO productDAO;
		
	@Override
	public boolean addProduct(Product product) {
        return this.productDAO.addProduct(product);
	}

	@Override
	public Product getProduct(String shortName) {
        return this.productDAO.getProduct(shortName);
	}

	@Override
	public boolean deleteProduct(Product product) {
        return this.productDAO.deleteProduct(product);
	}

	@Override
	public boolean updateProduct(Product product, String name, long price) {
        return this.productDAO.updateProduct(product, name, price);
	}

	@Override
	public void printProductList() {
        this.productDAO.printProductList();		
	}

	@Override
	public List<Product> productList() {
        return this.productDAO.productList();
	}
	
}
