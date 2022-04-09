package com.TugasAsprak.PBO.UTP;

public class Buku {
    private String judul;
    private String penulis;
    private int jumlah;

    public Buku(String judul, String penulis, int jumlah){
        this.judul = judul;
        this.penulis = penulis;
        this.jumlah = jumlah;
    }

    void setJudul(String judul){
        this.judul = judul;
    }

    String getJudul(){
        return judul;
    }

    void setJumlah(int jumlah){
        this.jumlah = jumlah;
    }

    int getJumlah(){
        return jumlah;
    }

    void setPenulis(String penulis){
        this.penulis = penulis;
    }

    String getPenulis(){
        return penulis;
    }

    void tampilkanInfoBuku(){
        System.out.println("Judul Buku      : "+getJudul());
        System.out.println("Penulis         : "+getPenulis());
        System.out.println("Jumlah Buku     : "+getJumlah());
        
    }
}
