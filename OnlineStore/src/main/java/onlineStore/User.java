package onlineStore;

public class User {

	private int id;
	private String name;
	private String surname;
	private rights rights;
	public enum rights {admin, client};

	public User(int id, String name, String surname, rights rights) {
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.rights = rights;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public rights getRights() {
		return rights;
	}

	public void setRights(rights rights) {
		this.rights = rights;
	}
	
}
