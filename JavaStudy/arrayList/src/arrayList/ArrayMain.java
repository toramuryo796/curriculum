package arrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayMain {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		//パターン１
		List<String> sampleList = new ArrayList<String>();
		sampleList.add("ABC");
		sampleList.add("DEF");
		
		//パターン２
		sampleList = new ArrayList<String>() {
			{
				add("ABC");
				add("DEF");
			}
		};
		
		//リストの格納要素を出力
		for(int i = 0; i < sampleList.size(); i++) {
			System.out.println(sampleList.get(i));
		}
	}
}
