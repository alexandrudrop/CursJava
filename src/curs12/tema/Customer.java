package curs12.tema;

class Customer {
    private String name;
    private String address;
    private String email;

    public Customer(String name, String address, String email) {
        this.setName(name);
        this.setAddress(address);
        this.setEmail(email);
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}