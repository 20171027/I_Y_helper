import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class DummyData_hankaku {
	public static void main(String[] args) {
		int test = Integer.parseInt(args[0]);
		int marume = 0;
		int keta = 5;
		

		String dummy = "tst05";
		for (int i = 10; i <= test+keta; i = i + keta) {
			if (i < 100) {
				dummy = dummy + "tst" + i;
			} else if (i < 1000) {
				dummy = dummy + "ts" + i;
			} else {
				dummy = dummy + "t" + i;
			}
			marume = test - i;
		}
		System.out.println(marume);
		int kezuru = keta - marume;
		
		dummy = dummy.substring(0, dummy.length()-kezuru);
		
		System.out.println(dummy);

		// ファイルに関すること
		PrintWriter pw = null;
		try {
			File file = new File("./dummy_data.txt");
			pw = new PrintWriter(new BufferedWriter(new FileWriter(file)));
			pw.print(dummy);
			
		} catch (IOException e) {
			System.out.println(e);
		}finally {
			pw.close();
		}

	}

}

