
public abstract class FirstAbstract {
	private String name;

	public FirstAbstract(String name) {
		this.name = name;
	}

	public abstract void greet();

	protected String getName() {
		return name;
	}
}
