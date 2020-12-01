import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDate {

	public static void main(String[] args) throws ParseException {
		// TODO 自動生成されたメソッド・スタブ
	String dateTime = "2020/12/04 09:40:40";
	
	SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
	SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy");
	Date date = new Date();
	Date test = sdf1.parse(dateTime);
	
	System.out.println(test);
	System.out.println(sdf1.format(date));
	System.out.println(sdf2.format(date));
	}

}
