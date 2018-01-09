import java.util.Scanner;
public class Buku {
  public static void main(String [] args){
  Scanner insert= new Scanner(System.in);
  int x ;
  String a, b ;
  int r ;
  
 do{
  System.out.println("====KATALOG BUKU====");
  System.out.println("===1. KALKULUS ===");
  System.out.println("===2. FISIKA ===");
 
  System.out.print("Masukkan Pilihan Anda : ");
  x = insert.nextInt();
  
  if(x==1){
    a="kalkulus";
    b="120000";
    System.out.println("Buku " +a+    " Harganya " +b);
  }else if(x==2){
    a="fisika";
    b="150000";
    System.out.println("Buku " +a+    " Harganya " +b);
  }else{
   
    System.out.println("Pilihan Anda Salah");
  }
System.out.println();
System.out.println(" Tekan 1 Jika Ingin Lanjutkan ");
System.out.print ("Masukkan Pilihan : ");
r= insert.nextInt();
 }while( r==1 );
}		
}


 

  
   
     