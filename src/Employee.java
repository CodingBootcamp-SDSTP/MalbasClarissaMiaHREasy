import java.time.LocalDate;

public class Employee
{
	final int ID;
	private String firstName;
	private String middleName;
	private String lastName;
	private String emailAdd;
	private LocalDate birthdate;
	private String religion;
	private String gender;
	private int age;
	private String civilStatus;
	private String address;

	public Employee(int id, String firstName, String middleName, String lastName, String emailAdd, LocalDate birthdate, String religion, String gender, int age, String civilStatus, String address) {
		ID = id;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.emailAdd = emailAdd;
		this.birthday = birthdate;
		this.religion = religion;
		this.gender = gender;
		this.age = age;
		this.civilStatus = civilStatus;
		this.address = address;
	}

	public String getJobId() {
		return(jobId);
	}

	public String getFirstName() {
		return(firstName);
	}

	public String getMiddleName() {
		return(middleName);
	}

	public String getLastName() {
		return(lastName); 
	}

	public String getEmailAdd() {
		return(emailAdd);
	}

	public LocalDate getBirthdate() {
		return(birthdate);
	}

	public String getReligion() {
		return(religion);
	}

	public String getGender() {
		return(gender);
	}

	public int getAge() {
		return(age);
	}

	public String getCivilStatus() {
		return(civilStatus);
	}

	public String getAddress() {
		return(address);
	}
}
