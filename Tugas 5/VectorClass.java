/*
	Nama		: Paramadina Mulya Majid
	Stambuk		: 13020180006
	Kelas   	: B1
	Waktu   	: 19.08
	Hari/Tanggal	: Sabtu, 11 April 2020
*/

import java.util.Vector;

public class VectorClass { 
    public static void main (String[] args){
        Vector<Integer> a = new Vector<Integer>();

        System.out.println("Panjang deret awal: "+a.size());

        for (int i = 0; i < 5; i++){
            a.add(i * 5);
        }

        System.out.println("\nPanjang deret setelah ditambah elemen: "+a.size());

        for (int i = 0; i < a.size(); i++){
            System.out.println("elemen ke - " + i + " : " + a.get(i));
        }

        System.out.println("\nPengecekan Vector Apakah Kosong : ");
        System.out.println(a.isEmpty());    

        System.out.println("\nPengecekan Keberadaan Sebuah Elemen: ");
        System.out.println(a.contains(5)); 
        System.out.println(a.contains(10)); 
        System.out.println(a.contains(25)); 

        System.out.println("\nPenghapusan Elemen Pada Index Tertentu ");
        a.remove(2);         

        System.out.println("\nPerubahan deret setelah menghapus beberapa elemen: "+a.size());

        for (int i = 0; i < a.size(); i++){
            System.out.println("elemen ke - " + i + " : " + a.get(i));
        }

        System.out.println("\nPenyisipan Elemen : ");
        a.insertElementAt( 130, 3 );

        System.out.println("\nPerubahan deret setelah menyisipkan elemen: "+a.size());

        for (int i = 0; i < a.size(); i++){
            System.out.println("elemen ke - " + i + " : " + a.get(i));
        }
    }
}