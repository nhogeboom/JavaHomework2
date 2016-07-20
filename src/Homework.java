import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Homework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getSumOfNumbers("does 5 + 7 = 12?"));
		System.out.println("The array of sorted string is:");
		String [] arr = {"name","is","my","awesome"};
		String [] sortedArray = sortIgnoringSpaces(arr);
		int i = 0;
		for (i=0;i<sortedArray.length;i++) {
			System.out.println(sortedArray[i]);
		}
	}
	
	public static int getSumOfNumbers(String s) {
		/*

	        Please implement this method to
	        return the sum of all integers found in the parameter String. You can assume that
	        integers are separated from other parts with one or more spaces (' ' symbol).
	        For example, s="12 some text 3  7", result: 22 (12+3+7=22)
	       */
		 /* can also use split */
			String pattern = "[0-9]+";
			Pattern p = Pattern.compile(pattern);
			Matcher m = p.matcher(s);
			int result = 0;
			while (m.find()) {
				result = result+ Integer.parseInt(s.substring(m.start(),m.end()));
			}
			return result;
	}
	
	public static String[] sortIgnoringSpaces(String[] a) {
		/*

	        Please implement this method to
	        sort a given array of Strngs in alphabetical order
	        ignoring spaces (' ' symbols) within the strings.
	       */
			String tmpString;
			String stringA;
			String stringB;
			
			for (int i=0;i < a.length; i++) {
				for (int j=i+1;j < a.length; j++) {
					stringA = a[i].replace(" ","");
					stringB = a[j].replace(" ","");

					if (stringA.compareToIgnoreCase(stringB) > 0) {
						tmpString = a[i];
						a[i] = a[j];
						a[j] = tmpString;
					}
				}
			}
			return a;
			
	}

}
