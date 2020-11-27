
public class ModAccessChild extends ModAccess{
	public void test() {
		System.out.println(this.pub_var);
		System.out.println(this.prot_var);
		System.out.println(this.pack_var);
	}
	
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		ModAccess mc = new ModAccessChild();
		mc.test();
	}

}
