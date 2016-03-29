/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jurnal1;

import java.util.Scanner;
public class Jurnal1 {


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Masukkanpa angka : ");
	int n = s.nextInt();
	for(int i=1;i<=n;i++)
	System.out.print(angka(i) + " ");
	System.out.println();
    }
    	private static int angka(int n)
	{
		int f;
		if(n==1 || n==2)
			f=1;
		else
			f = angka(n-1) + angka(n-2);
		return f;
	}
}
