public class LeapYear extends CalendarMain{
	
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		boolean isLeapYear = false;
		if((YEAR % 4 == 0) && (YEAR % 100 ==0)) {
		 isLeapYear = ((YEAR % 400) == 0);
		}else {
			isLeapYear = true;
		}
		System.out.println(YEAR + "年はうるう年" + (isLeapYear? "です" : "ではありません"));
	}

}
