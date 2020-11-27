
public class Cat {
	private String name;
	public int age;  //カプセル化していない

	//コンストラクタ
	public Cat(String n, int a) {
		this.name = n;
		this.age = a;
	}

	//メソッド
	public void showName() {
		System.out.println("名前は" + name + "です");
	}

	public void showAge() {
		System.out.println("年齢は" + age + "才です");
	}

	public void agePlus() {
		age++;
	}
}
