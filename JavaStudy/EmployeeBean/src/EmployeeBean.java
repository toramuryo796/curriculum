
class EmployeeBean {
	String empId;
	String department;
	String name;
	String tel;
	String mailAddress;

	//コンストラクタの生成
	public EmployeeBean(String empId, String department, String name, String tel, String mailAddress) {
		this.empId = empId;
		this.department = department;
		this.name = name;
		this.tel = tel;
		this.mailAddress = mailAddress;
	}
}
