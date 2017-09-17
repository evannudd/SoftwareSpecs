
public class NormalSeat extends Seat {

	public NormalSeat(String id, double price) {
		super(id, price);
	}

	@Override
	public String toString() {
		return "NormalSeat: " + super.toString();
	}

}
