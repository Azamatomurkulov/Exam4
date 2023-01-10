import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Numbers {
    public static void main(String[] args){
        Set<Integer> numbers = new HashSet<>();
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int num4 = sc.nextInt();
        int num5 = sc.nextInt();
        int num6 = sc.nextInt();
        int num7 = sc.nextInt();

        numbers.add(num1);
        numbers.add(num2);
        numbers.add(num3);
        numbers.add(num4);
        numbers.add(num5);
        numbers.add(num6);
        numbers.add(num7);


        for(Integer e: numbers){
            System.out.print(e+" ");
        }
    }
}
