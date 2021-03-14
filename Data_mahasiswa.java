package PROGRAMRIKO;

import java.util.Scanner;

public class Data_mahasiswa {

    public static void main(String[] args) {

        String nama;
        String nim;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("=== DATA MAHASISWA ===");
        System.out.println("Nama Mahasiswa : ");
        
        nama = input.next();
        
        System.out.println("NIM : ");
        
        nim = input.next();
        
        //Menampilkan inputan user
        System.out.println("========================");
        System.out.println("Nama Mahasiswa : " + nama);
        System.out.println("NIM : " + nim);
    }
    
}
