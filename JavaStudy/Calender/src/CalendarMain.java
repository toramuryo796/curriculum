import java.util.Calendar;
public class CalendarMain {
	static Calendar cal = Calendar.getInstance();
	static final int YEAR = cal.get(Calendar.YEAR);
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println(YEAR + "年");
		cal.add(Calendar.MONTH, 1);
		System.out.println(cal.get(Calendar.MONTH) + "月");
		System.out.println(cal.get(Calendar .DATE) + "日");
	}

}
