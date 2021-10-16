public class Main {

    public static void main(String[] args) {
        //6 --> 1,2, ve 3 'e bölünür. 3+2+1=6 yapar.
        //28 --> 1,2,4,7 ve 14'e bölünür. 14+7+4+2+1=28

        int number = 5;
        int total = 0;

        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                total += i;
            }
        }

        if (total == number) {
            System.out.println("Mükemmel sayıdır.");
        } else {
            System.out.println("Mükemmel sayı değildir.");
        }
    }
}
