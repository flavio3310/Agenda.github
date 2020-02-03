package Programa;

public class Agenda {

	public static void main(String[] args) {
		String [][] matriz= new String[5][5];
	     
	      matriz[0][0] = "Daise";
	      matriz[1][0] = "Flavio";
	      matriz[2][0] = "Fernanda";
	      matriz[3][0] = "Otavio";
	      matriz[4][0] = "Michele";
	     
	      
	      matriz[0][1] = "8740-5011";
	      matriz[0][2] = "3340-2222";
	      matriz[0][3] = "3322-0530";
	      matriz[0][4] = "9955-1518";
	  
	  
	      matriz[1][1] = "9910-1140";
	      matriz[1][2] = "3750-1110";
	      matriz[1][3] = "8119-9357";
	      matriz[1][4] = "8860-2040";
	 
	      matriz[2][1] = "8730-1111";
	      matriz[2][2] = "3240-7870";
	      matriz[2][3] = "3115-9949";
	      matriz[2][4] = "3333-4410";
	 
	      matriz[3][1] = "9170-1030";
	      matriz[3][2] = "3260-5011";
	      matriz[3][3] = "3232-1515";
	      matriz[3][4] = "3456-0040";
	 
	      matriz[4][1] = "3265-6978";
	      matriz[4][2] = "3112-1130";
	      matriz[4][3] = "9877-5099";
	      matriz[4][4] = "3455-9919";
	 
	        for(int linha =0; linha <5; linha++){
	          for(int coluna =0; coluna <5; coluna++){
	           if(coluna == 4){
	             System.out.println(matriz[linha][coluna]);
	              } else{
	                 System.out.print(matriz[linha][coluna] + "-" );
	                      }
	                    }
	                   }
	                 }
	                }

