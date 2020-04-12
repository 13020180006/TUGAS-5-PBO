/*
	Nama		: Paramadina Mulya Majid
	Stambuk		: 13020180006
	Kelas   	: B1
	Waktu   	: 21.25
	Hari/Tanggal	: Sabtu, 11 April 2020
*/

import java.util.Scanner;

public class jumlahArray{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int n;
		int hasil;

		System.out.print("Jumlah Bilangan : ");
		n = input.nextInt();
		hasil = 0;
		System.out.print("Input Angka : ");
		for(int i = 0; i < n; i++){
			hasil=hasil + input.nextInt();
		}
		
		System.out.println("Hasil Penjumlahan : "+hasil);
	}
}