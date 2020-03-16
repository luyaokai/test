package test;

public class SuNumber {
    public static void main(String[] args) {
        int sum=0;
        for (int i = 101; i < 200; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    break;
                }
                if (j + 1 == i) {
                    sum=sum+i;
                    System.out.print(i + " ");
                }
            }
        }
        System.out.println(sum);
    }
}
