package hashMap;
import java.util.HashMap;
import java.util.Map;

public class HashmapAddition {
	public static void main(String[] args) {
		//パターン１
		Map <String, String> sampleHashMap1 = new HashMap<String, String>();
		sampleHashMap1.put("apple", "りんご");
		sampleHashMap1.put("orange", "みかん");
		sampleHashMap1.put("peach", "もも");
		
		//パターン２
		Map<String, String> animals;  
		animals = new HashMap<String, String>(){
			{
				put("bird", "とり");
				put("dog", "犬");
				put("cat", "ねこ");
			}
		};
		
		//キー値を指定して取得
		System.out.println("---果物のリスト---");
		System.out.println(sampleHashMap1.get("apple"));
		System.out.println(sampleHashMap1.get("orange"));
		System.out.println(sampleHashMap1.get("peach"));
		System.out.println();
		System.out.println("---動物のリスト---");
		System.out.println(animals.get("bird"));
		System.out.println(animals.get("dog"));
		System.out.println(animals.get("cat"));
	}
}
