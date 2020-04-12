/*
	Nama		: Paramadina Mulya Majid
	Stambuk		: 13020180006
	Kelas   	: B1
	Waktu   	: 20.32
	Hari/Tanggal	: Sabtu, 11 April 2020
*/

public class NilaiAssert{
	public static void main(String args[]){
		int Nilai = 75;
		assert(Nilai>0);
		if(Nilai>=80)
			System.out.println("Nilai Anda Mencapai Rata-Rata, Anda Lulus!");
		else
			System.out.println("Nilai Anda Tidak Mencapai Rata-Rata, Anda Gagal!");
	}
}