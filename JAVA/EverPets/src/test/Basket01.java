package test;

import java.util.Scanner;

public class Basket01 {

	public static void main(String[] args) {

		String[] productlist = new String[4];
		productlist[0] = "밥";
		productlist[1] = "국";
		productlist[2] = "치킨";
		productlist[3] = "먹을거";

		int[] productvalue = new int[4];
		productvalue[0] = 24;
		productvalue[1] = 47;
		productvalue[2] = 14;
		productvalue[3] = 23;	// 임의의 상품목록

		int basketvalue = 0;
		String[] basketlist = { "" };

		int basketplusvalue = 0;
		int[] basketpluslist = { 0 };

		System.out.println("----상품목록----");
		for (int i = 0; i < productlist.length; i++) {
			System.out.println(i + "번 상품 : " + productlist[i] + " / 재고 : " + productvalue[i]);
		}
		System.out.println("---------");
		start: while (true) {
			System.out.println("상품을 선택하세요");
			Scanner scan1 = new Scanner(System.in);
			int productname = scan1.nextInt();

			System.out.println("선택한 상품은 " + productlist[productname] + " 입니다.");
			System.out.println("선택한 상품의 재고는 " + productvalue[productname] + " 입니다.");
			System.out.println("구매할 수량을 입력하세요");
			Scanner scan2 = new Scanner(System.in);
			int value1 = scan2.nextInt(); // 수량
			System.out.println("입력한 수량은 " + value1 + "입니다.");
			System.out.println("장바구니에 추가하시려면 1을 입력하세요.");
			Scanner scan3 = new Scanner(System.in);
			int value2 = scan3.nextInt(); // 수량

			if (value2 == 1) {
				basketvalue++;
				basketplusvalue++;
				System.out.println(productlist[productname] + " 상품 " + value1 + " 개를 장바구니에 추가했습니다. ");
				String productnamevalue = productlist[productname];
				basketlist[basketvalue - 1] = productnamevalue;
				int basketplusvaluenum = value1;
				basketpluslist[basketplusvalue - 1] = basketplusvaluenum;

				System.out.println("----------------------------------------");
				System.out.println("장바구니를 확인하시려면 1, 쇼핑을 계속하려면 2를 눌러주세요.");
				Scanner scan5 = new Scanner(System.in);
				int value4 = scan5.nextInt();
				{
					if (value4 == 1) {
						System.out.println("장바구니 목록");
						System.out.println(
								basketlist[basketvalue - 1] + " / 수량 : " + basketpluslist[basketplusvalue - 1]);

						System.out.println("구매하기 1 / 장바구니 비우기 2 를 눌러주세요.");
						Scanner scan6 = new Scanner(System.in);
						int value5 = scan6.nextInt();
						{
							if (value5 == 1) {
								System.out.println("구매가 완료되었습니다.");
								productvalue[productname] = productvalue[productname]
										- basketpluslist[basketplusvalue - 1];

								System.out.println(productlist[productname] + " 의 남은 재고는  " + productvalue[productname]
										+ " 개 입니다.");

								break start;
							} else if (value5 == 2) {
								basketlist[basketvalue - 1] = "";
								basketpluslist[basketplusvalue - 1] = 0;
								basketvalue--;
								basketplusvalue--;
								System.out.println("장바구니를 비웠습니다.");
								continue start;
							}
						}

					} else {
						continue start;
					}

				}

			} else {
				System.out.println("장바구니에 추가되지 않았습니다.");
				System.out.println("쇼핑을 계속하시려면 1을 눌러주세요.");
				Scanner scan4 = new Scanner(System.in);
				int value3 = scan4.nextInt(); // 수량
				{
					if (value3 == 1) {
						continue start;
					} else {
						System.out.println("쇼핑을 종료합니다.");
						break start;
					}
				}
			}
		}
	}

}