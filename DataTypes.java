import javax.swing.JOptionPane;
import java.util.Scanner;

public class DataTypes{
 public static void main(String[]args){

  Scanner scanner = new Scanner(System.in);  

  String namaDepan = "Muhammad";
  String namaTengah = "Zidan";
  String namaBelakang = "Ramadhani";
  int usia = 20;
  int targetTahunKuliah = 4;
  double ipk = 3.89;
  char nilaiAbjad = 'A';
  boolean tampan = true;
  
  System.out.print("Input Nama Depan : ");
  namaDepan = scanner.nextLine();
  System.out.print("Input Usia : ");
  usia = scanner.nextInt();
  System.out.print("Input IPK : ");
  ipk = scanner.nextDouble();
  System.out.print("");
  System.out.print("Input Nilai Abjad : ");
  nilaiAbjad = scanner.next().charAt(0);
  System.out.print("Tampan? : ");
  tampan = scanner.nextBoolean();

  System.out.println("============= OUTPUT =============");
  System.out.println("Nama Lengkap : " + " " 
	+ namaDepan +" "
         + namaTengah +" "
         +namaBelakang);

  System.out.println("Usia : " + usia + " Tahun");
  System.out.println("Usia ketika lulus : " + (usia + targetTahunKuliah) + " Tahun");
  JOptionPane.showMessageDialog(null, "Hai " + namaDepan +" "
         + namaTengah +" "
         +namaBelakang);
  namaBelakang = JOptionPane.showInputDialog("Nama Belakang : ");
 }
}