package com.TugasAsprak.PBO.UTP;

public class Pelanggan {
    private String nama;
    private String nomorPelanggan;
    private Buku[] BukuPinjaman = new Buku[3];
    
    public Pelanggan(String nama, String nomorPelanggan){
        this.nama = nama;
        this.nomorPelanggan = nomorPelanggan;
    }
    
    void setNama(String nama){
        this.nama = nama;
    }
    
    String getNama(){
        return nama;
    }

    void setNomorPelanggan(String nomorPelanggan){
        this.nomorPelanggan = nomorPelanggan;
    }
    
    String getNomorPelanggan(){
        return nomorPelanggan;
    }

    void tambahBuku(Buku bukuPinjam){
        for(int i=0; i<= BukuPinjaman.length; i++){
            BukuPinjaman[i] = bukuPinjam;
        }
    }

    void tampilkaninfoPelanggan(){
        if(BukuPinjaman == null){
            System.out.println("Tidak Ada Buku yang dipinjam");
        }else{
        System.out.println("Nama                : "+getNama());
        System.out.println("Nomor Pelanggan     : "+getNomorPelanggan());
        System.out.println("Buku yang Dipinjam  : ");
        for(int i=0; i<= BukuPinjaman.length; i++){
            System.out.println(BukuPinjaman[i]);
            i++;
        }
    }
    }
}
