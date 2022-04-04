package com.rplbo;

public class Pria {
    private String nama;
    private int usia;
    private String status;
    private double jumlahCinta;
    private Perempuan jodoh;
    private Perempuan temanKencan;

    public Pria(String nama, int usia) {
        setNama(nama);
        setUsia(usia);
    }


    public void PDKT(Perempuan nama) {
        setTemanKencan(nama);
        nama.setTemanKencan(this);

    }

    public void MengajakKencan(Perempuan temanKencan) {
        jodoh = getJodoh();
        if (jodoh == null || jodoh == temanKencan){
            jumlahCinta = getJumlahCinta();
            double jumlahCinta1 = jumlahCinta + 1;
            temanKencan.setJumlahCinta(jumlahCinta1);
            setJumlahCinta(jumlahCinta1);
        }else{
            System.out.println("JANGAN SELINGKUH MAS HEI TOLONG");
            System.out.println("KAU JANGAN  TIDAK SETIA, JANGAN KAU AJAK CEWEK LAIN JALAN!!");
        }


    }

    public void MenembakKekasih(){
        if(temanKencan != null) {
            double temaneval = temanKencan.getStandarJumlahCinta();
            if(this.jumlahCinta >= temaneval || this.temanKencan!= null) {
                setJodoh(this.temanKencan);
                temanKencan.setJodoh(this);
                temanKencan.setStatus("Pacaran");
                System.out.println("SELAMAT KAMU DITERIMA :D | SELAMAT MENJALANI HIDUP BARU "+this.nama);
        }else {
                System.out.println("SIAPA YANG MAU KAMU TEMBAK :') | JANGAN NGAYAL DEH "+this.nama+"!!!");
            }

        }else{
            System.out.println("SIAPA YANG MAU KAMU TEMBAK :') | JANGAN NGAYAL DEH "+this.nama+"!!!");
        }
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getUsia() {
        return usia;
    }

    public void setUsia(int usia) {
        this.usia = usia;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getJumlahCinta() {
        return jumlahCinta;
    }

    public void setJumlahCinta(double jumlahCinta) {
        this.jumlahCinta = jumlahCinta;
    }

    public Perempuan getJodoh() {
        return jodoh;
    }

    public void setJodoh(Perempuan jodoh) {
        this.jodoh = jodoh;
    }

    public Perempuan getTemanKencan() {
        return temanKencan;
    }

    public void setTemanKencan(Perempuan temanKencan) {
        this.temanKencan = temanKencan;
    }



}
