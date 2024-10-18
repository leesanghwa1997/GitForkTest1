package Lsh1208;

import java.util.Scanner;

public class Jih0316 {

	public static void main(String[] args) {
		System.out.println("로그인 form");

		Scanner scanner = new Scanner(System.in);
		System.out.println("ID를 입력해주세요 : ");
		String userId = scanner.next();

		System.out.println("Password를 입력해주세요 : ");
		String userPwd = scanner.next();

		// switch
		switch (userId) {
		case "admin":

			switch (userPwd) {
			case "1234":
				System.out.println("환영합니다! 조이한님!");
				break;
			default:
				System.out.println("비밀번호가 잘못되었습니다!");
				break;
			}
			break;

		default:

			switch (userPwd) {
			case "1234":
				System.out.println("아이디가 잘못되었습니다.");
				break;
			default:
				System.out.println("아이디와 비밀번호가 잘못되었습니다.");
				break;
			}
			break;
		}
	}

}
