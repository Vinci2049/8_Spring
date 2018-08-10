package onlineStore.service;

import java.util.List;

import onlineStore.Product;

public interface ProductService {

    List<Product> productList();
    
	void printProductList();
    boolean addProduct(Product product);
    Product getProduct(String name);
    boolean deleteProduct(Product product);
    boolean updateProduct(Product product, String name, long price);
	
}
