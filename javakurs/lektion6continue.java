package javakurs;

public class lektion6continue {
    public static void main(String [] args) {
        for (int count = 1; count <= 10; count++) {
            if (count == 5) {
                continue;
            }
            System.out.printf("%d ", count);
        }
        System.out.printf("%nUsed continue to skip printning 5%n");

    }
}
