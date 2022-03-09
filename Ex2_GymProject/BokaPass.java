package Ex2_GymProject;

import java.util.Scanner;

public class BokaPass {

    // menyval för olika typer av pass som sedan tar en tillbaka till inloggningsmeny

    public void passVal() {
        System.out.println("Vilket pass vill du boka?");
        System.out.println("1. Spinning              ");
        System.out.println("2. Yoga                  ");
        System.out.println("3. Aerobics              ");
        System.out.println("4. Avsluta               ");
        Scanner in = new Scanner(System.in);
        while (true) {
            int selectMenu = in.nextInt();
            switch (selectMenu) {
                case 1: {
                    spinning();
                    break;
                }
                case 2: {
                    yoga();
                    break;
                }
                case 3: {
                    Aerobics();
                    break;
                }
                case 4: {
                    System.exit(0);
                    break;
                }
                default: {
                    System.out.println("ogiltigt menyval");
                    break;
                }
            }
        }
    }
    private void spinning() {
        System.out.println("Vilken plats vill du bli bokad på?");
        System.out.println("1. A1");
        System.out.println("2. A2");
        System.out.println("3. A3");
        System.out.println("4. B1");
        System.out.println("5. B2");
        System.out.println("6. B3");
        System.out.println("7. C1");
        System.out.println("8. C2");
        System.out.println("9. C3");
        Scanner in = new Scanner(System.in);
        while (true) {
            int selectMenu = in.nextInt();
            switch (selectMenu) {
                case 1: {
                    System.out.println("Du är bokad på Spinning! A1");
                    new Menyer().inloggMeny();
                    break;
                }
                case 2: {
                    System.out.println("Du är bokad på Spinning! A2");
                    new Menyer().inloggMeny();
                    break;
                }
                case 3: {
                    System.out.println("Du är bokad på Spinning! A3");
                    new Menyer().inloggMeny();
                    break;
                }
                case 4: {
                    System.out.println("Du är bokad på Spinning! B1");
                    new Menyer().inloggMeny();
                    break;
                }
                case 5: {
                    System.out.println("Du är bokad på Spinning! B2");
                    new Menyer().inloggMeny();
                    break;
                }
                case 6: {
                    System.out.println("Du är bokad på Spinning! B3");
                    new Menyer().inloggMeny();
                    break;
                }
                case 7: {
                    System.out.println("Du är bokad på Spinning! C1");
                    new Menyer().inloggMeny();
                    break;
                }
                case 8: {
                    System.out.println("Du är bokad på Spinning! C2");
                    new Menyer().inloggMeny();
                    break;
                }
                case 9: {
                    System.out.println("Du är bokad på Spinning! C3");
                    new Menyer().inloggMeny();
                    break;
                }
                case 10: {
                    System.exit(0);
                    break;
                }
                default: {
                    System.out.println("ogiltigt menyval");
                    new Menyer().inloggMeny();
                    break;
                }
            }
        }
    }
    private void yoga () {
        System.out.println("Vilken plats vill du bli bokad på?");
        System.out.println("1. A1");
        System.out.println("2. A2");
        System.out.println("3. A3");
        System.out.println("4. B1");
        System.out.println("5. B2");
        System.out.println("6. B3");
        System.out.println("7. C1");
        System.out.println("8. C2");
        System.out.println("9. C3");
        Scanner in = new Scanner(System.in);
        while (true) {
            int selectMenu = in.nextInt();
            switch (selectMenu) {
                case 1: {
                    System.out.println("Du är bokad på yoga! A1");
                    new Menyer().inloggMeny();
                    break;
                }
                case 2: {
                    System.out.println("Du är bokad på yoga! A2");
                    new Menyer().inloggMeny();
                    break;
                }
                case 3: {
                    System.out.println("Du är bokad på yoga! A3");
                    new Menyer().inloggMeny();
                    break;
                }
                case 4: {
                    System.out.println("Du är bokad på yoga! B1");
                    new Menyer().inloggMeny();
                    break;
                }
                case 5: {
                    System.out.println("Du är bokad på yoga! B2");
                    new Menyer().inloggMeny();
                    break;
                }
                case 6: {
                    System.out.println("Du är bokad på yoga! B3");
                    new Menyer().inloggMeny();
                    break;
                }
                case 7: {
                    System.out.println("Du är bokad på yoga! C1");
                    new Menyer().inloggMeny();
                    break;
                }
                case 8: {
                    System.out.println("Du är bokad på yoga! C2");
                    new Menyer().inloggMeny();
                    break;
                }
                case 9: {
                    System.out.println("Du är bokad på yoga! C3");
                    new Menyer().inloggMeny();
                    break;
                }
                case 10: {
                    System.exit(0);
                    break;
                }
                default: {
                    System.out.println("ogiltigt menyval");
                    new Menyer().inloggMeny();
                    break;
                }
            }
        }
    }
    private void Aerobics () {
        System.out.println("Vilken plats vill du bli bokad på?");
        System.out.println("1. A1");
        System.out.println("2. A2");
        System.out.println("3. A3");
        System.out.println("4. B1");
        System.out.println("5. B2");
        System.out.println("6. B3");
        System.out.println("7. C1");
        System.out.println("8. C2");
        System.out.println("9. C3");
        Scanner in = new Scanner(System.in);
        while (true) {
            int selectMenu = in.nextInt();
            switch (selectMenu) {
                case 1: {
                    System.out.println("Du är bokad på Aerobics! A1");
                    new Menyer().inloggMeny();
                    break;
                }
                case 2: {
                    System.out.println("Du är bokad på Aerobics! A2");
                    new Menyer().inloggMeny();
                    break;
                }
                case 3: {
                    System.out.println("Du är bokad på Aerobics! A3");
                    new Menyer().inloggMeny();
                    break;
                }
                case 4: {
                    System.out.println("Du är bokad på Aerobics! B1");
                    new Menyer().inloggMeny();
                    break;
                }
                case 5: {
                    System.out.println("Du är bokad på Aerobics! B2");
                    new Menyer().inloggMeny();
                    break;
                }
                case 6: {
                    System.out.println("Du är bokad på Aerobics! B3");
                    new Menyer().inloggMeny();
                    break;
                }
                case 7: {
                    System.out.println("Du är bokad på Aerobics! C1");
                    new Menyer().inloggMeny();
                    break;
                }
                case 8: {
                    System.out.println("Du är bokad på Aerobics! C2");
                    new Menyer().inloggMeny();
                    break;
                }
                case 9: {
                    System.out.println("Du är bokad på Aerobics! C3");
                    new Menyer().inloggMeny();
                    break;
                }
                case 10: {
                    System.exit(0);
                    break;
                }
                default: {
                    System.out.println("ogiltigt menyval");
                    new Menyer().inloggMeny();
                    break;
                }
            }
        }
    }
}