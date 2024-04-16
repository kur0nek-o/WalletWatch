import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      while (true) {
        System.out.println("Selamat datang di WalletWatch!");
        System.out.println("Sebuah aplikasi untuk mengelola keuangan Anda.");
        System.out.println("Apa ada yang bisa kami bantu?");
        System.out.println("1. Lihat saldo");
        System.out.println("2. Tambah transaksi");
        System.out.println("3. Lihat Semua Transaksi");
        System.out.println("4. Hapus Transaksi");
        System.out.println("5. Keluar");
        System.out.println("");
        System.out.print("Pilih menu: ");

        int menu;

        try {
          menu = scanner.nextInt();
        } catch (InputMismatchException e) {
          System.out.println("Menu yang Anda pilih tidak valid.");
          System.out.println("");
        }
      }
    } catch (Exception e) {
      System.out.println("Terjadi kesalahan: " + e.getMessage());
      System.out.println("");
    }
  }
}