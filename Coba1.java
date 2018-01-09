import java.util.Scanner;
public class Coba1
{
      public static void main(String args[]){
             Scanner x = new Scanner(System.in);
             String nama, nim, jurusan;
             int khd, khd2, tgs, uts, uas;

             System.out.print("Nama = ");
             nama=x.nextLine();
             System.out.print("NIM = ");
             nim=x.nextLine();
             System.out.print("Jurusan = ");
             jurusan=x.nextLine();

             System.out.print("Nilai kehadiran = ");
             khd=x.nextInt();
             System.out.print("Jumlah pertemuan = ");
             khd2=x.nextInt();
             System.out.print("Nilai tugas = ");
             tgs=x.nextInt();
             System.out.print("Nilai UTS = ");
             uts=x.nextInt();
             System.out.print("Nilai UAS = ");
             uas=x.nextInt();
             
             khd=(khd/khd2)*10/100;
             tgs=tgs*20/100;
             uts=uts*30/100;
             uas=uas*40/100;
             
             int ahr=khd+tgs+uts+uas;
 
             System.out.println();
             System.out.println("Nama = " +nama);
             System.out.println("NIM = " +nim);
             System.out.println("Nilai Akhir = " +ahr);

             String hasil = (ahr>60) ? "Lulus" : "Tidak Lulus";
             System.out.print(hasil);

}
}

             