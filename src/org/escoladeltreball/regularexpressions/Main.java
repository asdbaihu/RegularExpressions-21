package org.escoladeltreball.regularexpressions;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.lang.System.out;

public class Main {

	private static final Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		String regex = sc.nextLine();
//		out.printf("RegEx %s, args)
		Pattern pattern = Pattern.compile(regex);
		String string = sc.nextLine();
		out.println(string);
		do {
			Matcher matcher = pattern.matcher(string);
			while (matcher.find()) {
				out.printf("%s %d %d%n", matcher.group(), matcher.start(),
						matcher.end());

			}
			string = sc.nextLine();
		} while(string != null);
	}

}
