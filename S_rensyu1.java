import java.util.*;

public class S_rensyu1 {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		String[] num = line.split(" ");
		int n = Integer.parseInt(num[0]);
		int m = Integer.parseInt(num[1]);

		String[] product = new String[n];
		int[] price = new int[n];
		String[] text = new String[m];
		int[] total = new int[m];

		for(int i=0; i<n;i++) {
			String[] ary = sc.nextLine().split(" ");
			product[i] = ary[0];
			price[i] = Integer.parseInt(ary[1]);
		}
		for(int i=0; i<text.length; i++) {
			text[i] = sc.nextLine();
		}

		total = total(text,product,price);

		for(int i=0; i<total.length; i++) {
			System.out.println(total[i]);
		}
		sc.close();
	}

	public static int[] total(String[] text, String[] product, int[] price) {
		int total = 0;
		int[] totalPrice = new int[text.length];
		for(int i=0; i<text.length;i++) {
			for(int j=0; j<product.length;j++) {
				if(text[i].charAt(0) == product[j].charAt(0)
				  && text[i].length() <= product[j].length()
				  && text[i].equals(product[j].substring(0, text[i].length()))) {
					total += price[j];
				}
			}
			totalPrice[i] = total;
			total = 0;
		}
		return totalPrice;
	}
}
