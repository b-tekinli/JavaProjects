public class Main {

    public static void main(String[] args) {
        //For
        for (int i = 2; i < 10; i += 2) {
            System.out.println(i);
        }
        System.out.println("For döngüsü bitti");

        int i = 1;
        //While
        while (i < 10) {
            System.out.println(i);
        }
        //infinite loop
        System.out.println("While döngüsü bitti.");

        //Do While
        int j = 100;
        do {
            //System.out.println("Loglandı.");
            System.out.println(j);
            j += 2;
        } while (i < 10);
        System.out.println("Do-While döngüsü bitti.");
    }
}
