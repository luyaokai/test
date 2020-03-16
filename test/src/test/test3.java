package test;

public class test3 {
    public static void main(String[] args) {
        //数字 a{1,3,5,7,9}  b{2,4,6,8,10},将两个数组合并，并按照从小到大的顺序排序，生成新数组
        int[] a = {1, 3, 5, 7, 9};
        int[] b = {2, 4, 6, 8, 10};
        int le = a.length;
        int le1 = b.length;
        int le2 = le + le1;
        int flag = 0, temp;
        int[] c = new int[le2];
        for (int i = 0; i < le; i++) {
            c[flag] = a[i];
            flag++;
        }
        for (int i = 0; i < le1; i++) {
            c[flag] = b[i];
            flag++;
        }
        for (int i = 0; i < le2; i++) {
            for (int j = i + 1; j < le2; j++) {
                if (c[i] > c[j]) {
                    temp = c[i];
                    c[i] = c[j];
                    c[j] = temp;
                }
            }
        }
        for (int i = 0; i < le2; i++) {
            System.out.print(c[i] + " ");
        }
    }
}
