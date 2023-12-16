import java.util.Scanner;
public class MukemmelSayi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // sayımızı number değişkenine atıyoruz

        System.out.print("Bir sayı giriniz:  ");
        int number = input.nextInt();
        int sum = 0;

        // for dongusuyle sayının kendisi hariç 1den başlayarak tüm pozitif sayılara tam bolenlerini sum
        // değişkeninde topluyoruz ve sayının kendisiyle karşılaştırıyoruz
        
        for(int i = 1; i < number;i++){
            if(number%i==0) sum += i;
        }

        if(sum == number) System.out.println(number+" Mükkemmel bir sayıdır.");
        else System.out.println(number+" Mükkemmel bir sayı değildır.");
    }
}
