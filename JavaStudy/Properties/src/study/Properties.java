package study;
import java.util.ResourceBundle;

public class Properties {
	public static void main(String args[]) {
		ResourceBundle bundle = ResourceBundle.getBundle("test");
		ResourceBundle nameBundle = ResourceBundle.getBundle("test");
		String value = bundle.getString("driver");
		String name = nameBundle.getString("name");
		System.out.println(value);
		System.out.println(name);
	}

}
