package main.Java.Q002;

public class Q002 {
    public static void main(String[] args) {
        int i = 10;
        int j = 20;
        int k = (j +=i) / 5;
        System.out.print(i + " : " + j + " : " + k);
    }
}
