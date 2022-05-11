package com.example.project;

import java.util.Scanner;

public class Exercise2 {

	public static void main(final String[] args) {

		Exercise2 obj = new Exercise2();
		Scanner sc = new Scanner(System.in);
		while (true) {

            int a [] = new int [7];
            for(int i = 0; i < 7; i++){
                int n = sc.nextInt();
                a[i] = n;
            }
			
			System.out.println(obj.getMenorNumeroSaltos(a));			
		}
	}

	
	public Integer getMenorNumeroSaltos(int a []) {
		//seleccionar el mas cercano a 50
		int cont=0;
		int pos=0;
		int pos2=0;
		int pos3=0;
		int mayor=a[0];
		
		while(true) {//repita el proceso
			
			for (int i = 0; i < a.length; i++) {
				//posicion1
				if(a[i]<=50 && a[i] > mayor) {
					pos=i;
					cont++;
				break;

				}
				
				if((a[i]<= 50+a[pos])&&a[i]>a[pos]) {
					mayor=a[i];
					pos2=i;
					cont++;
					
				}
			
				
			
	
			}
			
			System.out.println("la posicion  es: "+pos);
			System.out.println(a[pos]);
			System.out.println("la poscicon 2 es: "+mayor);
			System.out.println("la siguientes es: "+pos3);
			System.out.println(a[pos3]);
			System.out.println("total de saltos : "+cont);
return cont;}} }
}
