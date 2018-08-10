package onlineStore;

public class Client extends User{

	public Client(int id, String name, String surname, onlineStore.User.rights rights) {
		super(id, name, surname, rights);
	}

	public boolean registerOrder() {

		return true;
	}
	
	public boolean paidOrder() {
		
		return true;
	}

}
