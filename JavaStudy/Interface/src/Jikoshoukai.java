
public class Jikoshoukai implements FirstInterface{
	private String name;
	private String greet;

	Jikoshoukai(String name, String greet){
		this.name = name;
		this.greet = greet;
	}



	@Override
	public void giveName() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("私は" + name + "です");
	}

	@Override
	public void greet() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("こんにちわ！");

	}

	@Override
	public void dinner() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("今日ご飯行きませんか?");
	}

}
