import java.util.ArrayList;

public class Airline {

	private String name;

	private ArrayList<Plane> planes;

	public Airline() {
		planes = new ArrayList<Plane>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void addPlane(Plane plane) {
		if (plane != null) {
			planes.add(plane);
		}
	}

}
