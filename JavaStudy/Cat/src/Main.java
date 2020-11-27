
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Cat pepe = new Cat("ぺぺ", 3);
		pepe.agePlus();
		pepe.age = 0; //カプセル化していないと不正な代入がされる
		pepe.showName();
		pepe.showAge();
	}

}
