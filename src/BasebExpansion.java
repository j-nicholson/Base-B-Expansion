import java.util.ArrayList;
import java.util.Scanner;

public class BasebExpansion {
	
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number to convert to a new base, followed by the base to convert to: ");
		int convert = scan.nextInt();
		int base = scan.nextInt();
		
		System.out.println(basebExpansion(convert, base));
		scan.close();
		
	}
	
	public static ArrayList<Integer> basebExpansion(int n, int b) {
		int q = n;
		ArrayList<Integer> baseExpansion = new ArrayList<Integer>();
		
		while (q != 0) {
			baseExpansion.add(q % b);
			q = q / b;
		}
		
		ArrayList<Integer> conversion = new ArrayList<Integer>();
		for (int i = baseExpansion.size() - 1; i >= 0; i--) {
			conversion.add(baseExpansion.get(i));
		}
		
		return conversion;
	}
}
