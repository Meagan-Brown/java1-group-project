package finalProjectCS141;

public class Group {
	private String name;
	private String meetings;
	private String contact;
	
	public Group(String n, String m, String c) {
		name = n;
		meetings = m;
		contact = c;
	}
	
	public String getName() {
		return name;
	}
	
	public String getMeetings() {
		return meetings;
	}
	
	public String getContact() {
		return contact;
	}

	
	//Idk if setters are necessary
}
