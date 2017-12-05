import java.util.ArrayList;
import java.util.Scanner;
public class C013 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useDelimiter("\n");
		String n = sc.nextLine();
		char c = n.charAt(0);
		int m = Integer.parseInt(sc.nextLine());
		String[] ary = new String[m];
		int count = 0;

		ArrayList<String> result = new ArrayList<String>();

		for(int i=0; i<m; i++) {
			String str = sc.nextLine();
			ary[i] = str;
		}

		for(int i=0; i<ary.length; i++) {
			for(int j=0;j<ary[i].length();j++) {
				if(ary[i].charAt(j) == c) {
					count++;
				}
			}
			if(count == 0) {
				result.add(ary[i]);
			}
			count = 0;
		}
		if(result.isEmpty()) {
			System.out.println("none");
		} else {
			for(String s:result) {
				System.out.println(s);
			}
		}
		sc.close();
	}
}
