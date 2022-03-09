package javakurs;

public class lektion5product {

    public static void main(String[] args){

        int product = 3;
        int counter = 0;

        while (product <= 100) {
            product += 3;
            counter++;
        }
        System.out.println(product + " " + counter);
    }
}
