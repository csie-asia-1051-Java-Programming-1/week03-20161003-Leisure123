package hw;
/*
 * Topic:讓使用者輸入一正整數n，計算1(1+1) + 2(2+1) + 3(3+1) + … + n(n+1)並輸出結果。
 * Date: 2016/10/03
 * Author: 105021011 丁紹剛
 */
import java.util.Scanner;
public class hw05_105021011 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("輸入n值(n為正整數):");
		int n = scn.nextInt();
		int sum = 0;
		while(n > 0){
			sum = sum + n * ( n + 1 );
			n --;
		}
		System.out.println( "總共為" + sum );

	}

}