/*
	Nama		: Paramadina Mulya Majid
	Stambuk		: 13020180006
	Kelas   	: B1
	Waktu   	: 18.55
	Hari/Tanggal	: Sabtu, 11 April 2020
*/

import java.util.*;

public class MultiArray{
	public static void main(String[] args){
    		Scanner input=new Scanner(System.in);
   		int[][]array;
    		int baris;
    		int kolom;
    	
        	Scanner masuk=new Scanner(System.in);
    		System.out.print("Input Jumlah Baris :");
    		baris = masuk.nextInt();
    
		System.out.print("Input Jumlah Kolom : ");
    		kolom = masuk.nextInt();

    		System.out.println();
    		array = new int[baris][kolom];
    		for (int a=0; a<baris; a++){
			for (int b =0; b< kolom; b++){
				System.out.print("Input Angka : ");
       				array [a][b] = masuk.nextInt();
			}
    		}
        	for (int a=0; a<baris; a++){
            		for (int b=0; b<kolom; b++){
                		System.out.print(array[a][b]+" ");
            		}
        		System.out.println();
		}

	}
}