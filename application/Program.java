package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {
	
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many students for course A? ");
		int a = sc.nextInt();
		Set<Integer> A = new HashSet<>();
		
		for(int i=0; i<a; i++) {
			A.add(sc.nextInt());
		}
		
		System.out.print("How many students for course B? ");
		int b = sc.nextInt();
		Set<Integer> B = new HashSet<>();
		
		for(int i=0; i<b; i++) {
			B.add(sc.nextInt());
		}
		
		System.out.print("How many students for course C? ");
		int c = sc.nextInt();
		Set<Integer> C = new HashSet<>();
		
		for(int i=0; i<c; i++) {
			C.add(sc.nextInt());
		}
		
		Set<Integer> D = new HashSet<Integer>(A);
		D.addAll(B);
		D.addAll(C);
		
		System.out.println("Total students: " + D.size());
		
	}

}
