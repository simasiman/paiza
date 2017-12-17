import java.util.ArrayList;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useDelimiter("\n");
		String n = sc.nextLine();
		char c = n.charAt(0);
		int m = Integer.parseInt(sc.nextLine());
		int count = 0;

		ArrayList<String> result = new ArrayList<String>();

		for(int i=0; i<m; i++) {
	 		String str = sc.nextLine();
			for(int j=0; j<str.length(); j++) {
				if(str.charAt(j) == c) {
					count++;
				}
			}
			if(count == 0) {
				result.add(str);
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
