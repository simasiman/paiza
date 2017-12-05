import java.util.ArrayList;
import java.util.Scanner;
public class C_rensyu01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		String[] ary = line.split(" ");
		int overlapCount = 0;
		int count = 0;
		ArrayList<String> text = new ArrayList<String>();
		ArrayList<Integer> counter = new ArrayList<Integer>();

		for(int i=0;i<ary.length;i++){
			for(int j=ary.length-(ary.length-i);j>=0;j--){//重複を省く（i番目より前に同じ単語はないか確認）
				if(i != j && ary[i].equals(ary[j])){
					overlapCount++;
				}
			}
			if(overlapCount == 0){//出現回数をカウント
				text.add(ary[i]);
				count++;
				for(int k=i+1;k<ary.length;k++){
					if(ary[i].equals(ary[k])){
						count++;
					}
				}
				counter.add(count);
			}
			overlapCount = 0;
			count = 0;
		}
		for(int i=0;i<text.size();i++){
			System.out.println(text.get(i)+ " " + counter.get(i));
		}
		sc.close();
	}
}
