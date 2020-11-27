public class ModAccess {
	public String pub_var = "publicだよ";
	protected String prot_var = "protectedだよ";
	String pack_var = "package provateだよ";
	private String pri_var = "privateだよ";

	public void test(){
		System.out.println(this.pub_var);
		System.out.println(this.prot_var);
		System.out.println(this.pack_var);
		System.out.println(this.pri_var);
	}
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		ModAccess m = new ModAccess();
		m.test();
	}

}
