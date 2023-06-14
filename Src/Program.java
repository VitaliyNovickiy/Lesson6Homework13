import java.util.Random;

public class Program {
    public static void main(String[] args) {

           Random random = new Random();

                int num = random.nextInt(100_000) + 11;
                int temp = num;
                int sum = 0;

                for (int i = 0; i < 5; i++) {
                    sum += num % 10;
                    num = num / 10;
                }

                System.out.println("Сума чисел числа = " + temp + " = " + sum);
            }
        }






