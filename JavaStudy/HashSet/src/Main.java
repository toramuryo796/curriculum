import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//HashSet
		System.out.println("HashSetのため、ランダムに表示される");
		HashSet<String> sampleSet1 = new HashSet<String>();
		sampleSet1.add("A");
		sampleSet1.add("BA");
		sampleSet1.add("AB");
		sampleSet1.add("ABC");
		sampleSet1.add("DC");
		for (String s1 : sampleSet1) {
			System.out.println(s1);
		}

		//LinkedHashSet
		System.out.println("LinkedHashSetのため、昇順で表示される");
		LinkedHashSet<String> sampleSet2 = new LinkedHashSet<String>();
		sampleSet2.add("A");
		sampleSet2.add("CA");
		sampleSet2.add("AB");
		sampleSet2.add("ABC");
		sampleSet2.add("DC");
		for (String s2 : sampleSet2) {
			System.out.println(s2);
		}

		//TreeSet
		System.out.println("TreeSetのため,追加順で表示される");
		TreeSet<String> sampleSet3 = new TreeSet<String>();
		sampleSet3.add("A");
		sampleSet3.add("BA");
		sampleSet3.add("AB");
		sampleSet3.add("ABC");
		sampleSet3.add("DC");
		for (String s3 : sampleSet3) {
			System.out.println(s3);
		}
	}

}
