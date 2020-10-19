import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {

		// new �����ڸ� ����ϱ����ؼ� �����ڸ� ����
		Practice practice = new Practice();

		// �ܺ��� ���� �޾Ƽ� ����ϱ�����
		Scanner scanner = new Scanner(System.in);
		int number = Practice.getNumberFromUser(scanner);
		// ��ĳ�� ����� ������ ���
		scanner.close();
		System.out.println("number : " + number);

	}

	// ��ĳ�ʸ� ����ϱ����ؼ� �޼ҵ� ����
	private static int getNumberFromUser(Scanner scanner) {
		// ���� ����
		int number;
		// �ܺο� ó�� �������� ������ ���ؼ�
		System.out.println("���ڸ� �Է����ּ���.");
		// ���ڿ��� �Է� �ޱ����ؼ� ���
		String numStr = scanner.next();

		// ���ܰ� �߻��� �� �����Ƿ� try catch�� ���
		try {
			// ���������� ���������� ��ȯ����� �ϹǷ� ���.
			number = Integer.parseInt(numStr);
		}
		// ����ڰ� ���ڸ��� ���ڸ� ������� �ÿ� catch �κп��� ���� ó��
		catch (NumberFormatException e) {
			// ����Լ��� ���������� catch���� ������ �߻��Ѱ� �ٽ� ������ ��ġ������ �ڱ��ڽ��� ȣ��
			number = getNumberFromUser(scanner);
			System.out.println("���ڸ� �Է��ϼ̽��ϴ�.");

		}
		return number;

		// Ÿ�Լ��� intŸ�Ը� ��밡���ϱ⿡ <Integer>�� ���
		ArrayList<Integer> numberBasket = new ArrayList<Integer>();
		// �ݺ��� ���
		for (int i = 1; i <= 45; i++) {
			numberBasket.add(i);
			// �迭�� �������ؼ� ���
			Collections.shuffle(numberBasket);

			int[] picked = new int[6];
			for (int j = 0; j < 6; j++) {
				picked[i] = numberBasket.get(i);
				// �迭�� ������������ �����ϱ� ���� ���
				Arrays.sort(picked);
			}
			// �迭������ ����ϱ����� Arrays.toString�� ���
			System.out.println(Arrays.toString(picked));

		}
	}
}
