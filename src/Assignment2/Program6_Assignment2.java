package Assignment2;

public class Program6_Assignment2 {
public static void main(String[] args) {
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		HashSet<Integer> set = new HashSet<Integer>();
		
		int choice = 0;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Enter 0 to input elements to array list and 1 to exit inputting");
			choice = sc.nextInt();
			if(choice == 0) {
				System.out.println("Enter a number");
				int input = sc.nextInt();
				arrayList.add(input);
			}
			else if(choice == 1) {
				break;
			}
			else {
				System.out.println("Wrong choice");
			}
		}while(choice!=1);

		System.out.println("Enter the sum, whose pair is to be found");
		int k = sc.nextInt();
		boolean flag = false;
		
		for(int i: arrayList) {
			set.add(i);
			if(set.contains(k-i)) {
				System.out.println("Array List has the pair : " + (i) + " & " + (k-i));
				flag = true;
				break;
			}
		}
		
		if(!flag) {
			System.out.println("The array list has no pair that leads to sum " + k);
		}
		sc.close();
	}
}
