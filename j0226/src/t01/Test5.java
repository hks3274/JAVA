package t01;

public class Test5 {
	public static void main(String[] args) {

		int su = 2;
		System.out.printf("숫자 : %d\n", su);

		int su2 = 50;
		System.out.println("숫자 : " + su2);

		int su3, su4;
		su3 = 40;
		su4 = 320;

		System.out.println("su3+su4 = " + (su3 + su4));

		int su5 = 5, su6 = 6;
		System.out.println("su5 : " + su5 + ", su6 : " + su6);

		int _su7 = 100, $su8 = 200, su$9 = 500, main = 400; // public = 500 => 예약어 사용금지
		System.out.println("su7 : " + _su7 + ", su8 : " + $su8 + ", su9 :" + su$9 + ", main :" + main);

		int su10, su11; // 사용하지 않은 변수는 선언하지 않는 것이 좋다.
		su10 = 999;
		// su11 = 852;
		// su10 = su10 + su11; //초기화되지 않은 변수는 사용할 수 없다.
		System.out.println("su10 :" + su10);

	}
}
