package Learn_array;

import java.util.Scanner;

public class SD_Array {

	public static void main(String[] args) {
//		Single Dimensional Array
		int ar[] = new int[5];
		ar[0] = 10;
		ar[1] = 20;
		ar[2] = 30;
		ar[3] = 40;
		ar[4] = 50;
		
		
//		System.out.println(ar[0]);
//		System.out.println(ar[1]);
//		System.out.println(ar[2]);
//		System.out.println(ar[3]);
//		System.out.println(ar[4]);
		
//		System.out.println(ar.length);
		
//		array iterate the for loop :
		
//		for(int i = 0;i<ar.length;i++) {
//			System.out.println(ar[i]);
//		}
		
//		for each loop or enhanced for loop
		
//		for(int v:ar) {
//			System.out.println(v);
//		}
		
//		Array with Scanner
		
		Scanner scan = new Scanner(System.in);
//		System.out.print("Enter the Array Size : ");
//		int size = scan.nextInt();
//		
//		int ar1[] = new int[size];
//		
//		for(int i=0;i<size;i++) {
//			System.out.print("Enter the "+i+" Index Value :");
//			ar1[i]=scan.nextInt();
//		}
//		
//		for(int v:ar1) {
//			System.out.println(v);
//		}
		
		
//		Array in c method
//		int ar2[] = {100,200,300,400,500};
//		for(int i = 0;i<ar2.length;i++) {
//			System.out.println(ar2[i]);
//		}
		
		
//		Multi-Dimensioal Array
//		2D Array
		
		/*
		 *     Column
		 *       ^
		 *       |
		 * 	     0  1  2  
		 *    0  10 20 30  <-- row
		 *    1  40 50 60
		 */
		
		int td[][] = new int[2][3];
		
		td[0][0]=10;
		td[0][1]=20;
		td[0][2]=30;
		td[1][0]=40;
		td[1][1]=40;
		td[1][2]=40;
		
		
//		System.out.println(td[0][11]);
		
//		for(int i=0;i<2;i++){
//			for(int j=0; j<3;j++) {
//				System.out.print(td[i][j]+" ");
//			}
//			System.out.println();
//		}
		
//		Nested Enhanced for loop
//		for(int a[]:td) {
//			for(int v : a) {
//				System.out.print(v+" ");
//			}
//			System.out.println();
//		}
		
		
//		User input 2D array : 
//		System.out.print("Enter the Array Row Size : ");
//		int row = scan.nextInt();
//		
//		System.out.print("Enter the Array Column Size : ");
//		int column = scan.nextInt();
//		
//		int arr[][] = new int[row][column];
//		
//		for(int i=0;i<row;i++) {
//			for(int j=0;j<column;j++) {
//				System.out.print("Array row : "+i+" Column : "+j+" : ");
//				arr[i][j] = scan.nextInt();
//			}
//		}
//		for(int a[]:arr) {
//			for(int v : a) {
//				System.out.print(v+" ");
//			}`
//			System.out.println();
//		}
		
		
//		2d ARRAY USING C METHOD
		int u[][] = {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
//		for(int i=0;i<4;i++){
//			for(int j=0; j<3;j++) {
//				System.out.print(u[i][j]+" ");
//			}
//			System.out.println();
//		}
		
		
//		int x[][] = {{1,2,3},{4,5,6},{7,8,9}};
//		int y[][] = {{10,20,30},{40,50,60},{70,80,90}};
//		
//		int z[][] = new int[3][3];
//		for(int i = 0;i<3;i++) {
//			for(int j=0;j<3;j++) {
//				z[i][j] = x[i][j]+y[i][j];
//			}
//		}
//		
//		for(int i=0;i<3;i++){
//			for(int j=0; j<3;j++) {
//				System.out.print(z[i][j]+" ");
//			}
//			System.out.println();
//		}
//		
		
		
		
		
//		tasks 1 - max element of the array
		
//		int t[] = {34,56,23,1,81,33,74,67};
//		int mv = t[0];
//		for(int i = 0;i<t.length;i++) {
//			if(t[i] > mv) {
//				mv = t[i];
//			}
//		}
//		System.out.println("Max Value Of Array : "+mv);
		
		
//		Sort array -> assendintg order
		int arr[]= {20,2,6,7,3};
		
		
		for(int i = 0; i<arr.length;i++) {
			for(int j = i+1;j < arr.length;j++) {
				if(arr[i]>arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		for(int v:arr) {
			System.out.print(v+" ");
		}
		
		
		
	}

}
