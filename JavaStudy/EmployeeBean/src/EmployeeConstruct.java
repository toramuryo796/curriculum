
public class EmployeeConstruct {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		EmployeeBean employee = new EmployeeBean("00000", "技術部", "コンストラクタ", "XXX-XXXX-XXXX", "java@ぶるー");
		
		System.out.println(employee.empId);
		System.out.println(employee.department);
		System.out.println(employee.name);
		System.out.println(employee.tel);
		System.out.println(employee.mailAddress);
		
	}

}
