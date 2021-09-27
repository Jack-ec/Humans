import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Human {
	
	int birthYear;
	int birthMonth;
	int birthDay;
	String firstName;
	String lastName;
	Gender gender;
	
	public Human(int birthYear, int birthMonth, int birthDay, String firstName, String lastName, Gender gender) {
		this.birthYear = birthYear;
		this.birthMonth = birthMonth;
		this.birthDay = birthDay;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
	}
	//accessors
	public int getBirthYear() {
		return birthYear;
	}
	public int getBirthMonth() {
		return birthMonth;
	}
	public int getBirthDay() {
		return birthDay;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public Gender getGender() {
		return gender;
	}
	// mutators
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	// 
	public int calculateCurrentAgeInYears() {
		LocalDate today = LocalDate.now();
		LocalDate dateOfBirth = LocalDate.of(birthYear, birthMonth, birthDay);
		long years = ChronoUnit.YEARS.between(dateOfBirth, today);
		return (int)years;
	}

}
