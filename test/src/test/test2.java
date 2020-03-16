package test;

public class test2 {
    public static void main(String[] args) {
        //数组{1,2,3,4,5,5,5,5,5,6,7,8,9}，去掉数组中的5 生成新的数组。
        int[] a = {1, 2, 3, 4, 5, 5, 5, 5, 5, 6, 7, 8, 9};
        int[] b = new int[15];
        int flag = 0;
        for (int i = 0; i < 13; i++) {
            if (a[i] != 5) {
                b[flag] = a[i];
                flag++;
            }
        }
        for (int i = 0; i < 8; i++) {
            System.out.println(b[i]);
        }
    }
}
