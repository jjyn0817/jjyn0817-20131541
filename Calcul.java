import java.util.Scanner;

public class Calcul {

	public Calcul() {
		Scanner sc = new Scanner(System.in);

		System.out.println("<<<���⸦ �����ϼ���>>>");
		System.out.println("1.���п� ����");
		System.out.println("2.���� ����");
		System.out.println("3.ȯ�� ����");
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
		System.out.println("<<<���п� ���� ����>>>");
		System.out.println("1. �� ���� ����ϰڽ��ϴ�.");
		System.out.println("2. �� �� �̻� ����ϰڽ��ϴ�.");
		int sel = n.nextInt();

		switch (sel) {
		case 1:
			System.out.println("�μ��� �Է��ϼ���.");

			int num1 = n.nextInt();
			int num2 = n.nextInt();

			System.out.println("<<������ ����>>\n ");
			System.out.println("1.+ \n2.- \n3.x \n4./ \n5.���� ����\n");
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

				// ���� ����
				dis = Math.pow(b, 2) - (4 * a * c);
				root1 = ((-1 * b) + Math.sqrt(dis)) / (2 * a);
				root2 = ((-1 * b) - Math.sqrt(dis)) / (2 * a);

				// ���
				System.out.println("Root #1: " + root1);
				System.out.println("Root #2: " + root2);
				break;

			default:

				return;
			}
			break;

		case 2:
			System.out.println("���ڸ� �Է��ϼ���(�ִ� 4���� �� �Է� ����)");
			int n1 = n.nextInt();
			int n2 = n.nextInt();
			int n3 = n.nextInt();
			int n4 = n.nextInt();

			System.out.println("<<������ ����>>\n ");
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
		System.out.println("<<<��������>>");
		System.out.println("1.����� �������ϱ�");
		System.out.println("2.�������� ������ϱ�");

		Scanner scan_cal = new Scanner(System.in);
		System.out.println("1,2�� �� ������.");
		int cal = scan_cal.nextInt();

		switch (cal) {
		case 1:
			System.out.println("1.����� �������ϱ�");
			final double PY = 3.3058;
			Scanner scan = new Scanner(System.in);
			System.out.print("�Է�(��): ");
			double d = scan.nextDouble();
			System.out.println("��������: " + (d * PY));
			break;

		case 2:
			System.out.println("2.�������� ������ϱ�");
			final double d1 = 0.3;
			Scanner scan1 = new Scanner(System.in);
			System.out.print("�Է�(��������): ");
			double PY1 = scan1.nextDouble();
			System.out.println("��: " + (d1 * PY1));
			break;
		}
	}
		
	public void ExchangeRate() {

		System.out.print("1.�̱�ȯ��, 2.�Ϻ�ȯ��, 3.�߱�ȯ�� : ");
		Scanner input = new Scanner(System.in);
		
		int krw;
		int choice = input.nextInt();
		double rateDollar = 1117.20;
		double rateYen = 10.04;
		double rateYuan = 162.38;

		switch (choice) {
		case 1:
			System.out.println("��ȭ�ݾ��� �Է��Ͻÿ�. : ");
			krw = input.nextInt();
			System.out.println(+krw + "����" + krw * rateDollar + "�޷��Դϴ�.");
			break;
		case 2:
			System.out.println("��ȭ�ݾ��� �Է��Ͻÿ�. : ");
			krw = input.nextInt();
			System.out.println(+krw + "����" + krw * rateYen + "�޷��Դϴ�.");
			break;
		case 3:
			System.out.println("��ȭ�ݾ��� �Է��Ͻÿ�. : ");
			krw = input.nextInt();
			System.out.println(+krw + "����" + krw * rateYuan + "�޷��Դϴ�.");
			break;

		}
	}
}
