/*
	Nama		: Paramadina Mulya Majid
	Stambuk		: 13020180006
	Kelas   	: B1
	Waktu   	: 17.48
	Hari/Tanggal	: Sabtu, 11 April 2020
*/

import java.util.Arrays;

public class Array {

    public static void main(String[] args) {

        int[] Array1 = {130, 2018, 6, 25, 2, 2000};
	int[] Array2 = {17,43, 11, 4, 2020, 10};
        System.out.println("Angka sebelum di urutkan : ");
        
	System.out.print("Array 1 : ");
	for(int Ar: Array1){
		System.out.print(Ar+" ");
        }
	System.out.print("\nArray 2 : ");
	for(int Ar: Array2){
            System.out.print(Ar+" ");
        }

        Arrays.sort(Array1);
	Arrays.sort(Array2);

        System.out.println("\n\nAngka setelah di urutkan : ");
        
	System.out.print("Array 1 : ");
	for(int Ar: Array1){
            System.out.print(Ar+" ");
        }

	System.out.print("\nArray 2 : ");
	for(int Ar: Array2){
            System.out.print(Ar+" ");
        }
	
	System.out.print("\n\nPerbandingan Kedua Array : ");
	if(Arrays.equals(Array1,Array2))
		System.out.print("\nKedua Array Sama"); 
	else 
		System.out.print("\nKedua Array Tidak Sama");
	
	System.out.print("\n\nHasil Pencarian Data : ");
	System.out.println(Arrays.binarySearch(Array1,130));

    }
}