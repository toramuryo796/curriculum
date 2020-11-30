import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZonedDateTime;

public class TimeMain {
	public static void main(String[] args) {
		LocalDateTime ldtNow = LocalDateTime.now();
		OffsetDateTime odtNow = OffsetDateTime.now();
		ZonedDateTime zdtNow = ZonedDateTime.now();
		
		System.out.println("LocalDateTime:" + ldtNow);
		System.out.println("OffsetDateTime:" + odtNow);
		System.out.println("ZonedDateTime:" + zdtNow);
		
		//月の操作
		LocalDateTime month = ldtNow.withMonth(8);
		System.out.println();
		System.out.println("月の操作");
		System.out.print(ldtNow.getMonthValue() + "月");
		System.out.print("→" + month.getMonthValue() + "月");
		
	}
}
