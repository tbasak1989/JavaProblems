/*An object is immutable if its state cannot change after construction
 * */

//Make your class final, so that no other classes can extend it.
public final class ImmutableClass {
	//Make all your fields final, so that they’re initialized only once inside the constructor and never modified afterward.
	private final int id;
	private final String name;
	private final Address address;
	
	public ImmutableClass(int id, String name, Address address) {
		super();
		this.id = id;
		this.name = name;
		Address cloneAddress = new Address();
		cloneAddress.setPin(address.getPin());
		cloneAddress.setCity(address.getCity());
		cloneAddress.setStreet(address.getStreet());
		this.address=cloneAddress;
	}

	//Don’t expose setter methods.
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Address getAddress() {
		//when returning mutable fields from immutable object, you should return a clone instance of them and not the real instance of the field.
		Address address = new Address();
		address.setPin(this.address.getPin());
		address.setCity(this.address.getCity());
		address.setStreet(this.address.getStreet());
		return address;
	}

}
