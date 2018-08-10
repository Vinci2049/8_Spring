package onlineStore.service;

import onlineStore.Product;

import org.springframework.context.ApplicationContext;

public class DemoServiceImpl implements DemoService {

	@Override
	public void showDemoProduct(ApplicationContext applicationContext) {
		
        ProductService productService = applicationContext.getBean(ProductService.class);
		
        System.out.println("Добавляем товары: ");
        
        productService.addProduct(new Product("USB-hub", 50));
        productService.addProduct(new Product("Wi-fi router", 18));
        productService.addProduct(new Product("Яблоки", 23));
        productService.addProduct(new Product("Апельсины", 50));

        productService.printProductList();

        String productName = "Яблоки";
        System.out.println("Ищем товар по наименованию: "+productName);
        Product product = productService.getProduct(productName);
        if (product != null) {
            System.out.println("Нашли товар с названием "+productName);
        } else {
            System.out.println("Не нашли товар с названием "+productName);
        }
        
        System.out.println("Удаляем товары: ");

        productService.deleteProduct(product);
        
        productService.printProductList();
        
        String productName2 = "Апельсины";

        System.out.println("Меняем цену у товара с названием "+productName2);
        Product product2 = productService.getProduct(productName2);
        
        productService.updateProduct(product2, null, 100);
        
        productService.printProductList();
        		
	}

}
