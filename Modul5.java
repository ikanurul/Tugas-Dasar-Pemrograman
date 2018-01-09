import java.util.Scanner;
public class Modul5
{
    public static void main(String args[]) 
    {
        Scanner insert = new Scanner(System.in);
        int data, x=1, i=0,  jumlah=0;
        double rata=0;
        System.out.print("Banyaknya data : ");
        data= insert.nextInt();
        while (x >= data) {
        System.out.print("Data ke-"+x+ " : ");
        i = insert.nextInt();
        jumlah=+i;
        x++;
        }
        rata=jumlah/data;
        System.out.println("Rata rata : "+ rata);
        System.out.println("Jumlah : "+ jumlah);
   }
}