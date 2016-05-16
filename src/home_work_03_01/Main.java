package home_work_03_01;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int a;
		int b;
		Scanner in=new Scanner(System.in);
		a=in.nextInt();
		b=in.nextInt();
		if(a>=0&& b>=0){
			System.out.println("+");
			
		}else if(a<0&&b<0){
			System.out.println("+");
		}else if(a>=0&&b<0){
			System.out.println("-");
		}else if(a<0&&b>=0){
			System.out.println("-");
		}

	}

}
