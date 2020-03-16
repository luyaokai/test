package test;

public class test1 {
    public static void main(String[] args) {
        //数组排序：{1,23,6,74,8,19,104} 按 从小到大排序。
        int temp;
        int[] a = {1, 23, 6, 74, 8, 19, 104};
        for (int i = 0; i < 7; i++) {
            for (int j = i + 1; j < 7; j++) {
                if (a[i] > a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        for (int i = 0; i < 7; i++) {
            System.out.println(a[i]);
        }
    }
}
