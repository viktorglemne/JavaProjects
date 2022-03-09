package com.glemne;

public class test1 {
//    String name = "Emil";
//    int age = 29;
//
//    test1(String name, int age) {
//        this.name = "Felix";
//        this.age = age;
//    }
//    public static void main(String[] args) {
//        test1 pl = new test1("Joakim", 25);
//        System.out.print(pl.name + ", " + pl.age);
//    }
//}
//    public static void main(String[] args) {
//        int x = 4;
//        int y = 6;
//        boolean bool = false;
//
//        if (x<y){
//            System.out.println("Monkey, ");
//        }
//        if (!bool==false) {
//            System.out.println("Elephant, ");
//        }
//        if (x+y==11) {
//            System.out.println("Lion, ");
//        } else {
//            System.out.println("Crocodile, ");
//        }
//    }
//    public static void main(String[] args) {
//        int x = 2;
//        switch (1+x*2)
//        {
//            case 2:
//                System.out.println("2");
//                break;
//            case 3:
//                System.out.println("3");
//                break;
//            case 4:
//                System.out.println("4");
//                break;
//            case 6:
//                System.out.println("6");
//                break;
//            default:
//                System.out.println("default");
//        }
//
//    }
//    public static void main(String[] args) {
//        int i = 2;
//        while (i<29) {
//            i++;
//            for(int x=1; x<5; x++) {
//                i+=x;
//            }
//        }
//        System.out.println(i + ", ");
//
//    }
//    public static void main(String[] args) {
//        int i = 2;
//        while (i<47) {
//            System.out.print(i + ", ");
//            i+=9;
//        }
//    }
//    public static void main(String[] args) {
//        int i = 2;
//        int x = 1;
//        while (i < 8) {
//            x+=i;
//            i++;
//        }
//        System.out.print(x + ", ");
//    }
//    public static void main(String[] args) {
//        String[] zoo = new String[5];
//        zoo[2] = "Elephant";
//        zoo[1] = "Monkey";
//        zoo[3] = "Lion";
//        zoo[4] = "Crocodile";
//
//        for(int i =0; i<5; i++) {
//            if(i<3) {
//                System.out.print(zoo[i] + ", ");
//            }
//        }
//
//    }
//    public static void main(String[] args) {
//        int[] arr = new int[5];
//        int j=0;
//        for (int i = 0; i < 5; i++) {
//            arr[i]=++j*2;
//        }
//        for (int i : arr) {
//            System.out.print(i);
//        }
//
//    }
//    public static void main(String[] args) {
//        String[] zoo = new String[5];
//        zoo[3] = "Elephant";
//        zoo[2] = "Monkey";
//        zoo[4] = "Lion";
//        zoo[1] = "Crocodile";
//
//        for(int i=0; i<5; i++) {
//            if (i < 3) {
//                System.out.print(zoo[i] + ",");
//            }
//        }
//    }
//    public static void main(String[] args) {
//        int[][] a = {{1, 2, 3},{4, 5, 6, 9},{7}};
//
//        for (int i = 0; 1 < a.length; ++i) {
//            for (int j = 0; j < a[i].length; ++j) {
//                if (i%2 !=0)
//                    System.out.print(a[i][j]);
//            }
//        }
//    }
//    String name = "Emil";
//    int age = 29;
//
//    test1(String name, int age) {
//        this.name = name;
//        this.age = 30;
//    }
//    public static void main(String[] args) {
//        test1 pl = new test1("Joakim", 25);
//        System.out.println(pl.name + ", " + pl.age);
//    }

    String namn;
    test1(String x) {
        namn=x;
    }
    public void skrivNamn() {
        System.out.println(namn);
    }

    public static void main(String[] args) {
        new test1("Svante").skrivNamn();
    }
}


