package prototype;

/*
 * AdventureExperience
 * */
public class AdventureExperience implements Cloneable {
	
	private String date;
	private String location;
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

}
