
public class Adult extends Human {
	
	String placeOfWork;
	String occupation;
	
	public Adult(int birthYear, int birthMonth, int birthDay, String firstName, String lastName, Gender gender, String placeOfWork, String occupation) {
		super(birthYear, birthMonth, birthDay, firstName, lastName, gender);
		this.placeOfWork = placeOfWork;
		this.occupation = occupation;
		// TODO Auto-generated constructor stub
	}

	
	public String getPlaceOfWork() {
		return placeOfWork;
		
	}
	public String getOccupation() {
		return occupation;
	}

}
