package ex;
/*
 * Topic: 輸入一個字元，判斷是大寫或小寫或是其他字元。
 * Date: 2016/10/03
 * Author: 105021011 丁紹剛
 */
import java.util.Scanner;
public class ex02_105021011 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		char ch1 = scn.next().charAt(0);
		int v1 = ch1 - 'a';
		if(v1 >= 0 && v1 < 26){
			System.out.println("小寫");
		}else{
			v1 = ch1 - 'A';
			if(v1 >= 0 && v1 < 26){
				System.out.println("大寫");
			}else{
				System.out.println("其他字元");
			}
		}

	}

}
