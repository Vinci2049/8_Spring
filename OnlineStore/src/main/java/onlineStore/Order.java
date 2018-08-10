package onlineStore;

import java.util.List;

public class Order {

	private static int maxId;
	private int id;
	private enum status {registered, paid};
	private Client client;
	private List<Product> productList;
	
	private List<Order> orderList;
	
	public void printOrder(Order order) {
		System.out.println();
		System.out.println("Заказ клиента № "+order.getId());
		System.out.println("Клиент: "+order.getClient().getId()+" - "+order.getClient().getName()+" "+order.getClient().getSurname());
		System.out.println("Товары:");
		for (Product currentProduct : order.getProductList()) {
			System.out.println(currentProduct.getName());
		}
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public List<Order> getOrderList() {
		return orderList;
	}

	public void setOrderList(List<Order> orderList) {
		this.orderList = orderList;
	}

	public List<Product> getProductList() {
		return productList;
	}

	public void setProductList(List<Product> productList) {
		this.productList = productList;
	}

	public Order(int id, Client client, List<Product> productList, List<Order> orderList) {
		this.id = maxId++;
		this.client = client;
		this.productList = productList;
		this.orderList = orderList;
	}
	
	
	
}
