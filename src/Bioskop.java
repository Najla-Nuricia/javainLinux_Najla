import java.util.Scanner;

public class Bioskop {
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int kursiPesan =0, kursiAda;

        String[][] kursi = new String[5][8];
        while (true) {
            for ( int i = 0; i < kursi.length;i++) {
                for ( int j = 0; j < kursi[i].length;j++) {
                    if (kursi[i][j] == null) {
                        kursi[i][j] = "O";
                    }
                    System.out.print(kursi[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println("menu ");
            System.out.println("1. pesan kursi");
            System.out.println("2. keluar");
            System.out.print("silakan pilih menu: ");
            int menu = sc.nextInt();
            if ( menu == 1) {
                System.out.print("masukkan baris kursi: ");
                int baris = sc.nextInt();
                System.out.print("masukkan kolom kusi: ");
                int kolom = sc.nextInt(); 
                if (baris < 1 || baris > 5 || kolom < 1 || kolom > 8) {
                    System.out.println("baris atau kolom tidak valid");
                    continue;
                }

                if (kursi[baris-1][kolom-1] == "X") {
                    System.out.println("kursi sudah terisi , silahkan pilih kursi yang lain");
                    continue;
                }

                kursi[baris -1][kolom-1] = "X";
                System.out.println("kursi berhasil di pesan!");
                kursiPesan++;
                kursiAda=40-kursiPesan;

                System.out.println("kursi yang sudah dipesan: " + kursiPesan);
                System.out.println("kursi tersedia: " + kursiAda);
            }  else break;
        }
    }
    

}
