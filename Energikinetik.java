import java.util.Scanner;
    public class Energikinetik {
     
public static void main(String []args){
     Scanner x=new Scanner(System.in);
     int massa ;
     int kecepatan ;
     double Energikinetik ;
     System.out.println("======RUMUS ENERGI KINETIK======");
     System.out.print("Masukkan massa :");
       massa=x.nextInt();
     System.out.print("Masukkan kecepatan :");
       kecepatan=x.nextInt();
       Energikinetik= 0.5*massa*kecepatan*kecepatan;
     System.out.println("Energikinetik= "+Energikinetik);
     System.out.println("==Keterangan yang dihasilkan==");
        if(massa > 100){
         System.out.println("Benda tidak dapat bergerak");
        }
	else if(kecepatan > 100){
         System.out.println("Benda bergerak dengan cepat");
        }
	else{
          System.out.println("Benda tidak dapat bergerak dan benda bergerak dengan cepat");
        if(massa < 100){
         System.out.println("Benda dapat bergerak");
        }
	else if(kecepatan < 100){
         System.out.println("Benda bergerak dengan lambat");
        }
	else{
         System.out.println("Benda dapat bergerak dan benda bergerak dengan lambat");
          }
	 }			
	}
} 