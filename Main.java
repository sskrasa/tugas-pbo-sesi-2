public class Main {
    public static void main(String[] args) {
        Komputer mykom = new Komputer();
        mykom.setDataKomputer("LAPTOP", "MACBOOK");
        System.out.println("Komputer jenis: " + mykom.getJenis());
        System.out.println("Komputer merk: " + mykom.getMerk());

        HandPhone hp = new HandPhone();
        hp.setDataHP("Android", 2023);
        System.out.println("HandPhone jenis: " + hp.getJenisHP());
        System.out.println("Tahun pembuatan: " + hp.getTahunPembuatan());
    }
}
