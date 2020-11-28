
public class Employee {
	private int empId;
	private String name;

	//引数なしのコンストラクタ
	public Employee() {
	}

	public Employee(int empId, String name) {
		this.empId = empId;
		this.name = name;
	}

	public void printEmployeeInfo() {
		System.out.println("社員番号:" + this.empId);
		System.out.println("氏名   :" + this.name);
	}

}
