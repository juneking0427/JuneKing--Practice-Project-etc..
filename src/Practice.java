import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {

		// new 연산자를 사용하기위해서 생성자를 만듬
		Practice practice = new Practice();

		// 외부의 값을 받아서 출력하기위해
		Scanner scanner = new Scanner(System.in);
		int number = Practice.getNumberFromUser(scanner);
		// 스캐너 사용이 끝날때 사용
		scanner.close();
		System.out.println("number : " + number);

	}

	// 스캐너를 사용하기위해서 메소드 생성
	private static int getNumberFromUser(Scanner scanner) {
		// 변수 선언
		int number;
		// 외부에 처음 보여지는 설명을 위해서
		System.out.println("숫자를 입력해주세요.");
		// 문자열을 입력 받기위해서 사용
		String numStr = scanner.next();

		// 예외가 발생할 수 있으므로 try catch를 사용
		try {
			// 문자형에서 정수형으로 변환해줘야 하므로 사용.
			number = Integer.parseInt(numStr);
		}
		// 사용자가 숫자말고 문자를 사용했을 시에 catch 부분에서 예외 처리
		catch (NumberFormatException e) {
			// 재귀함수를 쓰는이유는 catch에서 문제가 발생한걸 다시 문제를 고치기위해 자기자신을 호출
			number = getNumberFromUser(scanner);
			System.out.println("문자를 입력하셨습니다.");

		}
		return number;

		// 타입설정 int타입만 사용가능하기에 <Integer>를 사용
		ArrayList<Integer> numberBasket = new ArrayList<Integer>();
		// 반복문 사용
		for (int i = 1; i <= 45; i++) {
			numberBasket.add(i);
			// 배열을 섞기위해서 사용
			Collections.shuffle(numberBasket);

			int[] picked = new int[6];
			for (int j = 0; j < 6; j++) {
				picked[i] = numberBasket.get(i);
				// 배열을 오름차순으로 정리하기 위해 사용
				Arrays.sort(picked);
			}
			// 배열내용을 출력하기위해 Arrays.toString을 사용
			System.out.println(Arrays.toString(picked));

		}
	}
}
