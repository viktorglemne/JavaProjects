package Tenta;

public class Heltal {
    int value;
    Heltal(int val){
        this.value = val;
    }
    public static void enMetod(Heltal x, Heltal y, Heltal z) {
        int temp = x.value;
        x.value = 5;
        y.value = temp;
    }
    public static int[] arr = new int[3];
    public static void main(String[] args) {
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
//        enMetod(arr[0], arr[1], arr[2]);
        System.out.println(arr[0] + arr[1] + arr[2]);
    }
}
