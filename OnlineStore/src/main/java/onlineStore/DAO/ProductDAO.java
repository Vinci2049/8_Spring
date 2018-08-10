package onlineStore.DAO;

import java.util.List;

import onlineStore.Product;

public interface ProductDAO {

    List<Product> productList();
	
	void printProductList();
    boolean addProduct(Product product);
    Product getProduct(String name);
    boolean deleteProduct(Product product);
    boolean updateProduct(Product product, String name, long price);
}
