package com.src.main;

public class Arrays2D {
public static void main(String[] args) {
	int x[]= {5,6,7,8};
	int y[]= {6,7,8,9};
	int z[]= {9,8,7,6};
	int p[][]= {{5,6,7,8},
			    {6,7,8,9},
			    {9,8,7,6}
	            };
	for(int i=0;i<3;i++) {    // for loop
		for(int j=0;j<4;j++) {
			System.out.print(p[i][j]+" ");
			}
		System.out.println(" ");
	}
	for(int i[]:p)   // Enhanced for loop
	{
		for(int j:i) {
			System.out.print(j+" ");
		}
		System.out.println("");
	}
	int k[][]=new int[3][];// you can define in this way for jagged array. Jagged array means it may not have symmetrical structure.
	k[0]= new int[4];
	k[1]=new int[2];
	k[2]=new int[3];
	
}
}
