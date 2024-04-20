import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
  private static Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
    boolean isFirstLoop = true;

    while (true) {
      if (isFirstLoop) {
        System.out.println("Selamat datang di WalletWatch!");
        System.out.println("Sebuah aplikasi untuk mengelola keuangan Anda.");
      } else {
        System.out.println("");
      }

      System.out.println("Apa ada yang bisa kami bantu?");
      System.out.println("1. Lihat saldo");
      System.out.println("2. Tambah transaksi");
      System.out.println("3. Lihat Semua Transaksi");
      System.out.println("4. Hapus Transaksi");
      System.out.println("5. Keluar");
      System.out.println();
      System.out.print("Pilih menu: ");

      int menu = 0;

      try {
        menu = scanner.nextInt();

        if (menu < 1 || menu > 5) {
          throw new InputMismatchException();
        }
      } catch (InputMismatchException e) {
        printWithEnter("Menu yang Anda pilih tidak valid.");

        scanner.nextLine();
      }

      switch (menu) {
        case 1:
          System.out.println("Menu 1");
          break;
        case 2:
          System.out.println("Menu 2");
          break;
        case 3:
          System.out.println("Menu 3");
          break;
        case 4:
          System.out.println("Menu 4");
          break;
        case 5:
          System.out.println("Terima kasih telah menggunakan WalletWatch!");

          scanner.close();
          return;
      }

      isFirstLoop = false;
    }
  }

  static void printWithEnter(String message) {
    System.out.println(message);
    System.out.print("Tekan Enter untuk melanjutkan...");

    scanner.nextLine();
  }
}
