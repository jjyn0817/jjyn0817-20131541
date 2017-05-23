import java.util.Scanner;

public class Calcul {

	public Calcul() {
		Scanner sc = new Scanner(System.in);

		System.out.println("<<<계산기를 선택하세요>>>");
		System.out.println("1.공학용 계산기");
		System.out.println("2.면적 계산기");
		System.out.println("3.환율 계산기");
		int sel = sc.nextInt();

		switch (sel) {
		case 1:
			Num();
			break;
		case 2:
			Area();
			break;
		case 3:
			ExchangeRate();
			break;

		}
	}

	public void Num() {
		
		Scanner n = new Scanner(System.in);
		System.out.println("<<<공학용 계산기 실행>>>");
		System.out.println("1. 두 수를 계산하겠습니다.");
		System.out.println("2. 두 수 이상 계산하겠습니다.");
		int sel = n.nextInt();

		switch (sel) {
		case 1:
			System.out.println("두수를 입력하세요.");

			int num1 = n.nextInt();
			int num2 = n.nextInt();

			System.out.println("<<연산자 선택>>\n ");
			System.out.println("1.+ \n2.- \n3.x \n4./ \n5.근의 공식\n");
			int dns = n.nextInt();

			switch (dns) {
			case 1:
				System.out.println(num1 + "+" + num2 + "=" + (num1 + num2));
				break;
			case 2:
				System.out.println(num1 + "-" + num2 + "=" + (num1 - num2));
				break;
			case 3:
				System.out.println(num1 + "X" + num2 + "=" + (num1 * num2));
				break;
			case 4:
				System.out.println(num1 + "/" + num2 + "=" + (num1 / num2));
				break;
			case 5:
				// double in_root = 0;
				// double rootVal = Math.sqrt(in_root);

				int a, b, c;
				double dis, root1, root2;

				Scanner scan = new Scanner(System.in);
				System.out.print("a: ");
				a = scan.nextInt();

				System.out.print("b: ");
				b = scan.nextInt();

				System.out.print("c: ");
				c = scan.nextInt();

				// 근의 공식
				dis = Math.pow(b, 2) - (4 * a * c);
				root1 = ((-1 * b) + Math.sqrt(dis)) / (2 * a);
				root2 = ((-1 * b) - Math.sqrt(dis)) / (2 * a);

				// 출력
				System.out.println("Root #1: " + root1);
				System.out.println("Root #2: " + root2);
				break;

			default:

				return;
			}
			break;

		case 2:
			System.out.println("숫자를 입력하세요(최대 4개의 수 입력 가능)");
			int n1 = n.nextInt();
			int n2 = n.nextInt();
			int n3 = n.nextInt();
			int n4 = n.nextInt();

			System.out.println("<<연산자 선택>>\n ");
			System.out.println("1.+ \n2.- \n3.x \n4./ \n");
			int dn = n.nextInt();

			switch (dn) {
			case 1:
				System.out.println(n1 + "+" + n2 + "+" + n3 + "+" + n4 + "=" + (n1 + n2 + n3 + n4));
				break;
			case 2:
				System.out.println(n1 + "-" + n2 + "-" + n3 + "-" + n4 + "=" + (n1 - n2 - n3 - n4));
				break;
			case 3:
				System.out.println(n1 + "X" + n2 + "X" + n3 + "X" + n4 + "=" + (n1 * n2 * n3 * n4));
				break;
			case 4:
				System.out.println(n1 + "/" + n2 + "/" + n3 + "/" + n4 + "=" + (n1 / n2 / n3 / n4));
				break;
			default:

				return;
			}
			break;

		}

	}

	public void Area() {
		System.out.println("<<<면적계산기>>");
		System.out.println("1.평수로 면적구하기");
		System.out.println("2.면적으로 평수구하기");

		Scanner scan_cal = new Scanner(System.in);
		System.out.println("1,2번 중 고르세요.");
		int cal = scan_cal.nextInt();

		switch (cal) {
		case 1:
			System.out.println("1.평수로 면적구하기");
			final double PY = 3.3058;
			Scanner scan = new Scanner(System.in);
			System.out.print("입력(평): ");
			double d = scan.nextDouble();
			System.out.println("제곱미터: " + (d * PY));
			break;

		case 2:
			System.out.println("2.면적으로 평수구하기");
			final double d1 = 0.3;
			Scanner scan1 = new Scanner(System.in);
			System.out.print("입력(제곱미터): ");
			double PY1 = scan1.nextDouble();
			System.out.println("평: " + (d1 * PY1));
			break;
		}
	}
		
	public void ExchangeRate() {

		System.out.print("1.미국환율, 2.일본환율, 3.중국환율 : ");
		Scanner input = new Scanner(System.in);
		
		int krw;
		int choice = input.nextInt();
		double rateDollar = 1117.20;
		double rateYen = 10.04;
		double rateYuan = 162.38;

		switch (choice) {
		case 1:
			System.out.println("원화금액을 입력하시오. : ");
			krw = input.nextInt();
			System.out.println(+krw + "원은" + krw * rateDollar + "달러입니다.");
			break;
		case 2:
			System.out.println("원화금액을 입력하시오. : ");
			krw = input.nextInt();
			System.out.println(+krw + "원은" + krw * rateYen + "달러입니다.");
			break;
		case 3:
			System.out.println("원화금액을 입력하시오. : ");
			krw = input.nextInt();
			System.out.println(+krw + "원은" + krw * rateYuan + "달러입니다.");
			break;

		}
	}
}
