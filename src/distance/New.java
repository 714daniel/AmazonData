package distance;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Path;
import java.util.Scanner;

public class New {
	public static void main(String[] args) throws FileNotFoundException {
		File F = new File("H:\\My Documents\\reviews_Video_Games.json");
		InputStream F1 = new InputStream(F);
		Scanner reviews = new Scanner(F);

		File Y = new File("newList.txt");
		Scanner words = new Scanner(Y);
		DistanceGetter dg = new DistanceGetter();
	}

	public static void goThroughAmazon(Scanner reviews, Scanner words,
			DistanceGetter gd) {

	}

}
