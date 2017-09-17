
public class Seat {

	private String id;
	private double price;

	public Seat(String id, double price) {
		this.id = id;
		this.price = price;
	}

	public String getId() {
		return id;
	}

	public double getPrice() {
		return price;
	}

	public String toString() {
		return "[Seat: Price: ]" + Double.toString(price);
	}
}
