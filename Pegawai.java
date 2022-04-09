package com.TugasAsprak.PBO.UTP;

public class Pegawai {
    private String nama;
    private String nomorPegawai;

    public Pegawai(String nama, String nomorPegawai){
        this.nama = nama;
        this.nomorPegawai = nomorPegawai;
    }

    public void setNomorPegawai(String nomorPegawai){
        this.nomorPegawai = nomorPegawai;
    }

    public String getNomorPegawai(){
        return nomorPegawai;
    }

    public void setNamaPegawai(String namaPegawai){
        this.nama = namaPegawai;
    }

    public String getNamaPegawai(){
        return nama;
    }

    void menambahBuku(String judul, String penulis, int jumlah){
        
    }

    void menambahPelanggan(String nama, String nomorPelanggan){
        Pelanggan p;

    }

    public void tampilkaninfoPegawai(){
        System.out.println("Informasi Pegawai di Perpustakaan :");
        System.out.println("Nama            : " +getNamaPegawai());
        System.out.println("Nomor Pegawai   : " +getNomorPegawai());
    }
}
