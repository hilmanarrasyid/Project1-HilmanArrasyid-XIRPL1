package classes;

public class Pesanan {

    private Menu menu;
    private int jumlah;
    private String keterangan;

    //tambahkan
    public Pesanan(Menu menu, int jumlah) {
        this.menu = menu;
        this.jumlah = jumlah;
    }

    //tambahkan
    public Menu getMenu() {
        return menu;
    }

    //tambahkan
    public int getJumlah() {
        return jumlah;
    }

    public void setKeterangan(String Keterangan) {}

    public String getKeterangan() { return ""; }
}
