import java.util.Date;

public class Employment
{
	private final String ID;
	private int experience;
	private String qualification;
	private String skills;
	private Date dateHired;
	private String status;
	private Sting designation;
	private String department;
	private String project;

	public Employment(String id, int experience, String qualification, String skills, Date dateHired, String status, String designation, String department, String project) {
		ID = id;
		this.experience = experience;
		this.qualification = qualification;
		this.skills = skills;
		this.dateHired = dateHired;
		this.status = status;
		this.designation = designation;
		this.department = department;
		this.project = project;
	}

	public String getId() {
		return(ID);
	}

	public int getExperience() {
		return(experience);
	}

	public String getQualification() {
		return(qualification);
	}

	public String getSkills() {
		return(skills);
	}

	public Date getDateHired() {
		return(date);
	}

	public String getStatus() {
		return(status);
	}

	public String getDesignation() {
		return(designation);
	}

	public String getDepartment() {
		return(department);
	}

	public String getProject() {
		return(project);
	}
}
