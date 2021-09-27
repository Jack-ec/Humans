
public class WilliamAberhartStudent extends Youth {
	int homeRoom;
	String homeRoomTeacher;
	String schoolName = "William Aberhart High School";
	
	public WilliamAberhartStudent(int birthYear, int birthMonth, int birthDay, String firstName, String lastName,
			Gender gender, int schoolGrade, int homeRoom, String homeRoomTeacher) {
		super(birthYear, birthMonth, birthDay, firstName, lastName, gender, schoolGrade, homeRoomTeacher);
		this.homeRoom = homeRoom;
		this.homeRoomTeacher = homeRoomTeacher;
	}
	
	public int getHomeRoom() {
		return homeRoom;
	}
	public String getHomeRoomTeacher() {
		return homeRoomTeacher;
	}
	public String getSchoolName() {
		return schoolName;
	}

	

	

}
