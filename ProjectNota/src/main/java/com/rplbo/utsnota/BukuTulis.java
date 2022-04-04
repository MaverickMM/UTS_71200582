package com.rplbo.utsnota;

public class BukuTulis extends Barang{
    private String merk;


    public BukuTulis(String kode, int harga, int berat, String deskripsi, String merk) {
        Barang.setKodebarang(kode);
        Barang.setKodebarang(harga);
        Barang.setKodebarang(berat);
        Barang.setKodebarang(deskripsi);
        Barang.setKodebarang(merk);
    }
}
