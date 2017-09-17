import java.util.ArrayList;

public class Plane {

	private int MAX_SEATS;

	private ArrayList<Seat> seats;

	public Plane(int maxNumberSeats) {
		MAX_SEATS = maxNumberSeats; // some default number
		seats = new ArrayList<Seat>();
	}

	public boolean addSeat(Seat seat) {
		if (seats.size() < MAX_SEATS) {
			seats.add(seat);
			return true;
		}

		return false;
	}

	public int get_MAX_SEATS() {
		return MAX_SEATS;
	}

}
