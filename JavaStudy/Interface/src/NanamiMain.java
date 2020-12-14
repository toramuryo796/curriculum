
public class NanamiMain {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Nanami nanami = new Nanami("七海", "2020/12/13");
		Jikoshoukai intro = new Jikoshoukai("高橋", "こんにちわ");
		nanami.giveName();
		nanami.greet();
		nanami.doNothing();
		nanami.dinner();

		final String message= nanami.diet();
		System.out.println("message: " + message);

		System.out.println();
		intro.greet();
		intro.giveName();
	}

}
