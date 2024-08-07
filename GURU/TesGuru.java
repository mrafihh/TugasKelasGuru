//Driver class
public class TesGuru {
    public static void main(String[] args) {
        //membuat objek
        Guru aulia = new Guru();
        Guru bagus = new Guru();
        Guru nasikin = new Guru();
        Guru feni = new Guru();
        Guru asry = new Guru();

        aulia.id = 1;
        aulia.nama = "Aulia Mas'adah S.Kom";
        aulia.mapel = "Dasar Program Keahlian(RPL)";
        aulia.alamat = "Malang";

        bagus.id = 2;
        bagus.nama = "Muhammad Bagus Arifin S.Pd";
        bagus.mapel = "Informatika";
        bagus.alamat = "Malang";

        nasikin.id = 3;
        nasikin.nama = "Ahmad Nasikin M.Pd";
        nasikin.mapel = "Pendidikan Agama Islam";
        nasikin.alamat = "Malang";
        
        feni.id = 4;
        feni.nama = "Feniliya Mayrini";
        feni.mapel = "Matematika";
        feni.alamat = "Malang";

        asry.id = 5;
        asry.nama = "Asry Wahyunignsih S.Pd";
        asry.mapel = "Bahasa Indonesia";
        asry.alamat = "Malang";

        System.out.println("Ini Data Bu Aulia");
        System.out.println(aulia.id);
        System.out.println(aulia.nama);
        System.out.println(aulia.mapel);
        System.out.println(aulia.alamat);

        System.out.println("Ini Data Pak Bagus");
        System.out.println(bagus.id);
        System.out.println(bagus.nama);
        System.out.println(bagus.mapel);
        System.out.println(bagus.alamat);

        System.out.println("Ini Data Pak Nasikin");
        System.out.println(nasikin.id);
        System.out.println(nasikin.nama);
        System.out.println(nasikin.mapel);
        System.out.println(nasikin.alamat);

        System.out.println("Ini Data Bu Feni");
        System.out.println(feni.id);
        System.out.println(feni.nama);
        System.out.println(feni.mapel);
        System.out.println(feni.alamat);

        System.out.println("Ini Data Bu Asry");
        System.out.println(asry.id);
        System.out.println(asry.nama);
        System.out.println(asry.mapel);
        System.out.println(asry.alamat);
     
    }
}
