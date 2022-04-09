package com.TugasAsprak.PBO.UTP;

public class Perpustakaan {
    Buku[] listBuku = new Buku[100];
    Pegawai pegawaiPerpus;
    static Pelanggan[] listPelanggan = new Pelanggan[20];

    public Perpustakaan(Pegawai pegawai){
        this.pegawaiPerpus = pegawai;
    }
    void pinjam(String namaPelanggan, String judulBuku){

    }

    Buku cariBuku(String judulBuku){
        return null;
    }
    public void tampilkanInfoPerpustakaan(){
        pegawaiPerpus.tampilkaninfoPegawai();
        int i = 0;
        int j = 0;
        listBuku[i].tampilkanInfoBuku();
        i++;
        listPelanggan[j].tampilkaninfoPelanggan();
        j++;

    }
}
