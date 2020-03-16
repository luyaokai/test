package test;

public class test6 {
    public static void main(String[] args) {
        //计算Hello World! 中出现了几次l。
        String str = "Hello World!";
        char[] a = str.toCharArray();
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 'l') {
                count++;
            }
        }
        System.out.println(count);
    }
}
