public class strukBelanja {
    String tanggal, namaBarang;
    int noTransaksi, jmlh, total;

    strukBelanja(int nt, String tgl, String nb, int j, int t) {
        noTransaksi = nt;
        tanggal = tgl;
        namaBarang = nb;
        jmlh = j;
        total = t;
    }
}