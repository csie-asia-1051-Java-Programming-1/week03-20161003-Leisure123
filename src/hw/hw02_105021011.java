package hw;
/*
 * Topic: 讓使用者輸入多個數，統計正數、負數及零各有多少個。
 * Date: 2016/10/03
 * Author: 105021011 丁紹剛
 */
import java.util.Scanner;
public class hw02_105021011 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int input;
		int p = 0;
		int n = 0;
		int z = 0;
		char check;
		while(true){
			System.out.print("請輸入一個數字:");
			input = scn.nextInt();
			if(input == 0){
				z = z + 1;
			}else if(input > 0){
				p = p + 1;
			}else if(input < 0){
				n = n + 1;
			}
				System.out.print("是否繼續 (Y/N):");
				check = scn.next().charAt(0);
				if(check == 'n' || check == 'N'){
				System.out.println("正數有" + p + "個");
				System.out.println("負數有" + n + "個");
				System.out.println("零有" + z + "個");
				break;
				}
				}
		
     }
  
}
