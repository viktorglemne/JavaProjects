package javakurs;

public class lektion5forcounter {
    public static void main(String [] args){
        int total = 0;

        for (int counter = 2; counter <= 20; counter += 2) {
            total += counter;

        }
        System.out.printf("Summan är %d%n", total );
    }
}  // det är 2 till 20 med 2 mellanrum som plusas ihop vilket blir 110 som summa