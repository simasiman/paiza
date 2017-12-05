import java.util.*;

public class C040 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		String[] ary = new String[n];
		String[][] ary2 = new String[n][2];
		double num = 0;
		double max = 0;
		double min = 0;

		for(int i=0;i<ary.length;i++) {
			ary[i] = sc.nextLine();
			ary2[i] = ary[i].split(" ");
		}

		for(String[] s:ary2) { //"le"=以下 "ge"=以上
			num = Double.valueOf(s[1]);
			if(s[0].equals("le") && (num < max || max == 0)) {
				max = num;
			} else if(s[0].equals("ge") && (num > min || min == 0)) {
				min = num;
			}
		}
		System.out.println(min + " " + max);

		sc.close();
	}
}
