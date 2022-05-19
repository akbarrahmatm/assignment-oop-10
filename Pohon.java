/*

Nama : Akbar Rahmat Mulyatama
NIM : 2112500851
Tugas P10 PBO

*/

class PohonMangga extends Pohon{
    // Pembuatan atribut buah yang hanya bisa diakses class PohonMangga
    private String buah;
    // Pembuatan konstruktor class PohonMangga untuk isi atribut buah
    PohonMangga(){
        this.buah = "Mangga";
    }
    // Pembuatan method CiriPohonMangga() untuk print atribut buah
    void CiriPohonMangga(){
        System.out.println("Buah\t: " + this.buah);
    }
}

class PohonJambu extends Pohon{
    // Pembuatan atribut buah yang hanya bisa diakses class PohonJambu
    private String buah;
    // Pembuatan konstruktor class PohonJambu untuk isi atribut buah
    PohonJambu(){
        this.buah = "Jambu";
    }
    // Pembuatan method CiriPohonJambu() untuk print atribut buah
    void CiriPohonJambu(){
        System.out.println("Buah\t: " + this.buah);
    }
}

class Pohon{
    // Pembuatan atribut akar, daun, batang yang hanya bisa diakses oleh class Pohon
    private String akar;
    private String daun;
    private String batang;
    // Pembuatan konstruktor untuk pengisian nilai atribut
    Pohon(){
        this.akar = "Tunggang";
        this.daun = "Menyirip";
        this.batang = "Bercabang";
    }
    // Pembuatan method CiriPohon() untuk print atribut
    void CiriPohon(){
        System.out.println("Akar\t: " + this.akar);
        System.out.println("Daun\t: " + this.daun);
        System.out.println("Batang\t: " + this.batang);
    }
    public static void main(String[] args) {
        // Buat Object dari class PohonMangga
        PohonMangga mangga = new PohonMangga();
        // Buat Object dari class PohonJambu
        PohonJambu jambu = new PohonJambu();
        // Panggil method CiriPohon() dan CiriPohonMangga() dari object class PohonMangga
        System.out.println("Pohon Mangga\n");
        mangga.CiriPohon();
        mangga.CiriPohonMangga();

        // Panggil method CiriPohon() dan CiriPohonJambu() dari object class PohonJambu
        System.out.println("\n\nPohon Jambu\n");
        jambu.CiriPohon();
        jambu.CiriPohonJambu();
    }
}