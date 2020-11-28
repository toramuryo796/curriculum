package nstanceOfJava;

public class Main {
	public static void main(String[] args) {
		InstanceOfSato sato1 = new InstanceOfSato("優輝");
		InstanceOfSato sato2 = new InstanceOfSato("志希");
		InstanceOfSato sato3 = new InstanceOfSato("優輝");

		System.out.println("-------インスタンス毎のハッシュコード--------");
		System.out.println("sato1:" + sato1.hashCode());
		System.out.println("sato2:" + sato2.hashCode());
		System.out.print("sato3:" + sato1.hashCode());

		System.out.println("-------sato1とsato2のインスタンスが同一か-------");
		System.out.println("参照先インスタンスとの比較:" + (sato1 == sato2));
		System.out.println("参照先インスタンスの値との比較:" + (sato1.equals(sato2)));

		System.out.println("-------sato1とsato3のインスタンが同一か--------");
		System.out.println("参照先インスタンスとの比較:" + (sato1 == sato2));
		System.out.println("参照先インスタンスの値との比較:" + (sato1.equals(sato3)));
		
		System.out.println("------incrementId()------");
		System.out.println("sato1:");
		sato1.incrementId();
		System.out.println("sato2:");
		sato2.incrementId();
		System.out.println("sato3:");
		sato3.incrementId();
	}
}
