import java.util.Scanner;

public class Exempel02_02 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Skriv namn :");
		String namn = input.nextLine();

		System.out.println("ange �lder:");

		int �lder = input.nextInt();

		System.out.println("ange l�ngd:");

		double l�ngd = input.nextDouble();


		System.out.println(namn+" "+�lder+" "+l�ngd);

	}

}
