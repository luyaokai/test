package test;

public class test5 {
    public static void main(String[] args) {
        //字符串“1,2,3,4,5,6,7”，根据“，”分开，将其转化为字符串数组，并在控制台打印。
        String str = "1,2,3,4,5,6,7";
        char[] a = str.toCharArray();
        char[] b=new char [7];
        int flag=0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != ',') {
                b[flag]=a[i];
                System.out.print(b[flag] + " ");
                flag++;
            }
        }
    }
}
