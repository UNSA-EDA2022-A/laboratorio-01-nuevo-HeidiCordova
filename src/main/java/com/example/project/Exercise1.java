package com.example.project;

import java.util.Scanner;

public class Exercise1 {

	public static void main(final String[] args) {

		Exercise1 obj = new Exercise1();
		Scanner sc = new Scanner(System.in);
		while (true) {
			int n = sc.nextInt();
			System.out.println(obj.convertirBaseGabriel(n));			
		}
	}


	public String convertirBaseGabriel(int a) {

		    String numCadena= Integer.toString(a);
		    int[] numero= new int[numCadena.length()];
		    int numerodos=0;
		    int numeroGab=0;
		    String numeroGabriel="";
		    int k=numCadena.length();
		    //rellenar el arreglo
		    for (int i = 0; i < numCadena.length();i++) {
		    	numero[i]=Integer.parseInt(numCadena.substring(i,i+1));


		    //parametros
		    		if(numero[i]<3 && numero[i]>=0 && numerodos<=1 && numero[numero.length-1]!=2 && numCadena.indexOf("0")>=0&& numCadena.indexOf("1")>=0) {//solo numeros de 0 a 2
		    	
		    			if(numero[i]==2) {
		    				numerodos++;//para que la cantidad de "2" no sea mayor A 1
		    			}
		    			//convertir a base gabriel
		    
		    			int ga=(int) Math.pow(2,k);

		    			int	numeroGabR= numero[i]*(ga-1);
		    			numeroGab+=numeroGabR;
		    		}else {

		    			return "El numero proporcionado no esta en base Gabriel.";
		    		}
		    
		    		k--;//el indice va disminuyendo

		    }

		    numeroGabriel= Integer.toString(numeroGab);
			return numeroGabriel;	
	}
}
