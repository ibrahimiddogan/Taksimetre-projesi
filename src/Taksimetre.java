import java.util.Scanner;
public class Taksimetre {
    public static void main(String[] args) {
        int km;
        double perkm =2.20 ,total =10;
        Scanner alici = new Scanner(System.in);
        System.out.print("Km yi giriniz lütfen : ");
        km= alici.nextInt();
        total +=km*perkm;
        total = (total<20)? 20:total;
        System.out.println("Taksi metre tutarınız" + total);



    }
}
