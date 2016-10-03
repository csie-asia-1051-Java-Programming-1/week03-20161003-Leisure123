package ex;
/*
 * Topic: 輸入一正整數，判斷其奇偶數。
 * Date: 2016/10/03
 * Author: 105021011 丁紹剛
 */
import java.util.Scanner;
public class ex05_105021011 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("請輸入正整數；");
		int x = scn.nextInt();
		int y = x % 2;
		if(y == 1){
			System.out.println("此數為奇數");
		}else{
			System.out.println("此數為偶數");
		}

	}

}
