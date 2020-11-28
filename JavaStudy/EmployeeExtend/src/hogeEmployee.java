
public class hogeEmployee extends Employee {
	boolean isTrainee;

	public hogeEmployee() {
	}
	
	//boleanが引数としてない
	public hogeEmployee(int empId, String name) {
		//挙動確認１
		super(empId, name);
		//挙動確認３
		boolean isTrainee;
		if(empId != 10192) {
			isTrainee = true;
		} else {
			isTrainee = false;
		}
		
		System.out.println(this.isTrainee? "研修生です" : "研修生ではありません" );
	}
	
	//boleanが引数にある
	public hogeEmployee(int empId, String name, boolean isTrainee) {
		//挙動確認１
		super(empId, name);
		//挙動確認２
		this.isTrainee = isTrainee;
		//挙動確認3
		isTrainee = true;
		System.out.println(this.isTrainee ?  "研修生です" : "研修生ではありません");
		// 挙動確認４
		this.printEmployeeInfo();
		super.printEmployeeInfo();
	}
}