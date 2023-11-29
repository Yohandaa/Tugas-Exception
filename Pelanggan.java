package com.PBO11;

import java.util.Scanner;

public class Pelanggan extends DataPelanggan{

    //method untuk mengisi data pelanggan
    public void isiDataPelanggan(){
        Scanner scanStr = new Scanner(System.in);
        Scanner scanIn = new Scanner(System.in);
        System.out.println("Masukkan no faktur = ");
        faktur = scanStr.next();
        System.out.println("Masukkan nama pelanggan = ");
        nama = scanStr.next();
        System.out.println("Masukkan nama barang = ");
        namaBarang = scanStr.next();
        System.out.println("Masukkan harga barang = ");
        hargaBarang = scanIn.nextInt();
        System.out.println("Masukkan jumlah barang = ");
        jmlBarang = scanIn.nextInt();
    }

    //menthod untuk mencetak struk
    @Override
    public void cetakStruk() {
        Integer totalBayar = hargaBarang*jmlBarang;
        this.totalBayar = totalBayar;

        System.out.println("========== Struk ==========");
        System.out.println("No Faktur = " + faktur);
        System.out.println("Nama Pelanggan " + nama);
        System.out.println("Nama Barang = " + namaBarang);
        System.out.println("Harga = " + hargaBarang);
        System.out.println("Jumlah = " + jmlBarang);
        System.out.println("Total Bayar = " + this.totalBayar);
        System.out.println("=============================");
    }
    

}