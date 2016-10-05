package hw;
/*
 * Topic:輸入一個正整數值(不含 0)，傳回該數值是幾位數(# ofdigits)。
 * Date: 2016/10/03
 * Author: 105021011 丁紹剛
 */
import java.util.Scanner;
public class hw01_105021011 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("請輸入正整數值:");
		long n = scn.nextLong();
		int sum = 0;
		while(n > 0){
			sum = (int)sum + 1;
			n = n / 10;
		}
		System.out.println("此數為" + sum + "位數");

	}

}
