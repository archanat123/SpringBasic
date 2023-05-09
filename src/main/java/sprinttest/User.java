package sprinttest;

public class User {
	
	private String userName;
	private Salary userSalary;
	private Company userCompany;
	private CompanyHQ companyHQ;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public Salary getUserSalary() {
		return userSalary;
	}
	public void setUserSalary(Salary userSalary) {
		this.userSalary = userSalary;
	}
	public Company getUserCompany() {
		return userCompany;
	}
	public void setUserCompany(Company userCompany) {
		this.userCompany = userCompany;
	}
	public CompanyHQ getCompanyHQ() {
		return companyHQ;
	}
	public void setCompanyHQ(CompanyHQ companyHQ) {
		this.companyHQ = companyHQ;
	}
	@Override
	public String toString() {
		return "User [userName=" + userName + ", userSalary=" + userSalary + ", userCompany=" + userCompany
				+ ", companyHQ=" + companyHQ + "]";
	}

	
	
	

}
