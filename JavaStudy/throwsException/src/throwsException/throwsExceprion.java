package throwsException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Objects;

public class throwsExceprion {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		try {
			inputFile();
		}catch(FileNotFoundException e) {
			System.out.print("指定されたファイルは存在しませんでした");
		}catch(IOException e){
			System.out.print("ファイル読み込み中にエラーが発生しました");
		}finally {
			if(Objects.nonNull(fr)) {
				try {
					fr.close();
				}catch(IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

	private static void inputFile() throws FileNotFoundException, IOException{
		// TODO 自動生成されたメソッド・スタブ
		FileReader fr = new FileReader("sample.txt");
		System.out.print(fr);
		outputFileContents(fr);
	}
	
	private static void outputFileContents(final FileReader fr) throws IOException{
		int textData;
		while((textData = fr.read()) != -1) {
			System.out.print((char) textData);
		}
	}

}
