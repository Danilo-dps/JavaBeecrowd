package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String[] valores = sc.nextLine().split(" ");
		int[] nums = new int[valores.length];
		for(int i = 0; i < valores.length; i++) {
			nums[i] = Integer.parseInt(valores[i]);
		}
		
		System.out.println();
		
		//Tem como automatizar todos esses sysout dentro de um for sem perder a lógica do if?
		if(nums[0] < nums[1] && nums[0] < nums[2] && nums[1] < nums[2]) {
			System.out.println(nums[0]);
			System.out.println(nums[1]);
			System.out.println(nums[2]);
			
			System.out.println();
			for(int i = 0; i < valores.length; i++) {
				System.out.println(nums[i]);
			}
		}
		
		else if(nums[0] < nums[1] && nums[0] < nums[2] && nums[2] < nums[1]) {
			System.out.println(nums[0]);
			System.out.println(nums[2]);
			System.out.println(nums[1]);
			
			System.out.println();
			for(int i = 0; i < valores.length; i++) {
				System.out.println(nums[i]);
			}
		}
		
		else if(nums[1] < nums[0] && nums[1] < nums[2] && nums[0] < nums[2]) {
			System.out.println(nums[1]);
			System.out.println(nums[0]);
			System.out.println(nums[2]);
			
			System.out.println();
			for(int i = 0; i < valores.length; i++) {
				System.out.println(nums[i]);
			}
		}
		
		else if(nums[1] < nums[0] && nums[1] < nums[2] && nums[2] < nums[0]) {
			System.out.println(nums[1]);
			System.out.println(nums[2]);
			System.out.println(nums[0]);
			
			System.out.println();
			for(int i = 0; i < valores.length; i++) {
				System.out.println(nums[i]);
			}
		}
		
		else if(nums[2] < nums[0] && nums[2] < nums[1] && nums[0] < nums[1]) {
			System.out.println(nums[2]);
			System.out.println(nums[0]);
			System.out.println(nums[1]);
			
			System.out.println();
			for(int i = 0; i < valores.length; i++) {
				System.out.println(nums[i]);
			}
		}
		
		else {
			System.out.println(nums[2]);
			System.out.println(nums[1]);
			System.out.println(nums[0]);
			
			System.out.println();
			for(int i = 0; i < valores.length; i++) {
				System.out.println(nums[i]);
			}
		}
		
		sc.close();
	}
}
