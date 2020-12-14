
public class Nanami implements FirstInterface, Sasaki {
	private String name;
	private String date;

	public Nanami(String n, String yyyyMM) {
		name = n;
		date = yyyyMM;
	}

	private void submitOrder(final int processing) {
		String nameAnd = name + '、';

		if (processing == 0) {
			System.out.println(nameAnd + date + "で名前入れてます");
		} else if (processing == 1) {
			System.out.println(nameAnd + date + "の対応もしました");
		} else {
			System.out.println(nameAnd + "本当はまだ何もしていません");
		}
	}

	public void doNothing() {
		submitOrder(-1);
	}

	@Override
	public void giveName() {
		// TODO 自動生成されたメソッド・スタブ
		submitOrder(0);
	}

	@Override
	public void greet() {
		// TODO 自動生成されたメソッド・スタブ
		submitOrder(1);
	}

	@Override
	public void dinner() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("ご飯食べよー");
	}

	@Override
	public String diet() {
		// TODO 自動生成されたメソッド・スタブ
		return "明日からダイエット始めます";
	}

}
