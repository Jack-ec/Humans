
public class Youth extends Human{
	
	int schoolGrade;
	String schoolName;
	
	public Youth(int birthYear, int birthMonth, int birthDay, String firstName, String lastName, Gender gender, int schoolGrade, String schoolName) {
		super(birthYear, birthMonth, birthDay, firstName, lastName, gender);
		this.schoolGrade = schoolGrade;
		this.schoolName = schoolName;
		// TODO Auto-generated constructor stub
	}

	
	public int getSchoolGrade() {
		return schoolGrade;
		
	}
	public String getSchoolName() {
		return schoolName;
	}
	public void setSchoolGrade(int grade) {
		schoolGrade = grade;
		
	}
	public void setSchoolName(String school) {
		schoolName = school;
	}

}

