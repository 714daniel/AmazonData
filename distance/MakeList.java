package distance;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class MakeList {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("src\\OldList"));
		PrintStream ps = new PrintStream(new File("newList.txt"));
		String temp = "";
		while (sc.hasNext()) {
			temp = sc.next();
			if (temp.length() == 7 || temp.length() == 8 || temp.length() == 9) 
			ps.println(temp);
			System.out.println(temp);
		}

	}
}
