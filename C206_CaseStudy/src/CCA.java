
public class CCA {
	private String title;
	private String description;
	private int size;
	private String day;
	private String time;
	private String venue;
	private String instructor;
	private String category;
	
	public CCA(String title, String description, int size, String day, String time, String venue, String instructor, String category) {
		this.title = title;
		this.description = description;
		this.size = size;
		this.day = day;
		this.time = time;
		this.venue = venue;
		this.instructor = instructor;
		this.category = category;
	}
	
	public CCA(String category) {
		this.category = category;
	}

	public String getTitle() {
		return title;
	}

	public String getDescription() {
		return description;
	}

	public int getSize() {
		return size;
	}

	public String getDay() {
		return day;
	}

	public String getTime() {
		return time;
	}

	public String getVenue() {
		return venue;
	}

	public String getInstructor() {
		return instructor;
	}
	
	public String getCategory() {
		return category;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public void setDay(String day) {
		this.day = day;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public void setVenue(String venue) {
		this.venue = venue;
	}

	public void setInstructor(String instructor) {
		this.instructor = instructor;
	}

	public void setCategory(String category) {
		this.category = category;
	}
	
	
	
}