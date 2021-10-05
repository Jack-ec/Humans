import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Comparator;

public class Human implements Comparable<Human> {

	public static Comparator<Human> AGE_ORDER = new Comparator<Human>() {
		public int compare(Human h1, Human h2) {
			return h1.compareTo(h2);
		}
	};
	public static Comparator<Human> ASSEMBLY_ORDER = new Comparator<Human>() {
		public int compare(Human h1, Human h2) {
			Integer humanOneOrdinal = humanOrdinal(h1);
			Integer humanTwoOrdinal = humanOrdinal(h2);
			return humanOneOrdinal.compareTo(humanTwoOrdinal);
		}
	};
	public static Comparator<Human> NAME_ORDER = new Comparator<Human>() {
		public int compare(Human h1, Human h2) {
			return (h1.lastName.compareToIgnoreCase(h2.lastName) + h1.firstName.compareToIgnoreCase(h2.firstName));
		}
	};

	public static int humanOrdinal(Human h1) {
		if (h1 instanceof WilliamAberhartStudent) {
			return 0;
		}
		if (h1 instanceof Youth) {
			return 1;
		}
		if (h1 instanceof Adult) {
			return 2;
		}
		if (h1 instanceof Human) {
			return 3;
		}
		else {
			return 4;
		}
	}


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

	public int calculateCurrentAgeInDays() {
		LocalDate today = LocalDate.now();
		LocalDate dateOfBirth = LocalDate.of(birthYear, birthMonth, birthDay);
		long days = ChronoUnit.DAYS.between(dateOfBirth, today);
		return (int)days;
	}



	public int compareTo(Human h2) {
		int difference = h2.calculateCurrentAgeInDays() - calculateCurrentAgeInDays();
		return difference;
	}

	public int compareAssembly(Human h2) {

	}
}
