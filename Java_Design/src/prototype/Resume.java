package prototype;

/*
 * Resume
 * */
public class Resume implements Cloneable {
	
	private String name;
	private String profession;
	private int level;
	private AdventureExperience experience;
	
	public Resume(String name, String profession, int level) {
		super();
		this.name = name;
		this.profession = profession;
		this.level = level;
		this.experience = new AdventureExperience();
	}
	
	private Resume(AdventureExperience experience) throws CloneNotSupportedException {
		this.experience = (AdventureExperience) experience.clone();
	}
	
//	@Override
//	public Object clone() throws CloneNotSupportedException {
//		return super.clone();
//	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		Resume clone = new Resume(experience);
		clone.setName(this.name);
		clone.setProfession(this.profession);
		clone.setLevel(this.level);
		return clone;
	}
	
	public void display() {
		System.out.printf("Adventurer: %s-%s Level: %d \n", name, profession, level);
		System.out.printf("AdventureExperience: %s %s \n", experience.getDate(), experience.getLocation());
		System.out.println();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public String getProfession() {
		return profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}

	public AdventureExperience getExperience() {
		return experience;
	}

	public void setExperience(String date, String location) {
		experience.setDate(date);
		experience.setLocation(location);
	}
}
