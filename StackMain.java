import java.util.Scanner;

public class StackMain {
    Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack stk = new Stack(5);
        StackMain main = new StackMain();
        

        int pil;
        while (true) {
            System.err.println("=========================");
            System.err.println("Pilihan");
            System.err.println();
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Print");
            System.out.println("5. GetMax");
            System.out.println("6. Keluar");
            System.out.print("Pilih salah satu (1/2/3/4/5/6) : ");
            pil = sc.nextInt();
            switch (pil) {
                case 1:
                    main.pushPakaian(stk);
                    break;
                case 2:
                    stk.pop();
                    break;
                case 3:
                    stk.peek();
                    break;
                case 4:
                    stk.print();
                    break;
                case 5:
                    stk.getMax();
                    break;
                case 6:
                    return;
                default:
                    System.out.println("Pilihan tidak tersedia. ");
                    break;
            }
        }
    }

    public void pushPakaian(Stack stk) {
        char pilih;
        do {
            System.out.print("Jenis: ");
            String jenis = sc.next();
            System.out.print("Warna: ");
            String warna = sc.next();
            System.out.print("Merk: ");
            String merk = sc.next();
            System.out.print("Ukuran: ");
            String ukuran = sc.next();
            System.out.print("Harga: ");
            double harga = sc.nextDouble();

            Pakaian p = new Pakaian(jenis, warna, merk, ukuran, harga);
            System.out.print("Apakah Anda akan menambahkan data baru ke stack (y/n) ? ");
            pilih = sc.next().charAt(0);
            
            stk.push(p);
        } while (pilih == 'y');
    }
}