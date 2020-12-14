package exceptionCheck;

import java.util.Objects;

public class Check {
	private static final String CONST_ROPPONGI_HILLS = "六本木ヒルズ";
	private static final String CONST_IMPERIA_HOTEL = "帝国ホテル";

	public static void main(String[] args) {
		String hogeOffice = CONST_ROPPONGI_HILLS;
//		String hogeOffice = null;
		try {
			if(Objects.isNull(hogeOffice)) {
				throw new NullPointerException("変数hogeOfficeがNUllです");
			}
			if(!(hogeOffice.equals(CONST_IMPERIA_HOTEL))) {
				throw new Exception("オフィスは帝国オフィスだよ");
			}
			//throw以降の処理は実行されない
			System.out.println("hogeオフィスは" + CONST_IMPERIA_HOTEL);
		}catch (Exception e){
			System.out.println("オフィスが間違っています");
			System.out.println(e);
		}
	}
}
