/*
	Nama		: Paramadina Mulya Majid
	Stambuk		: 13020180006
	Kelas   	: B1
	Waktu   	: 20.40
	Hari/Tanggal	: Sabtu, 11 April 2020
*/

public class TryCatchFinally{
    public static void main(String[] args) {
        try{
            int a = 6/0;
        }
        catch (Exception a){
            System.out.println("There is an error!");
        }
        finally{
            System.out.println("Thank you for use this program");
        }
    }
}