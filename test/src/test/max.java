package test;

public  class max {

     static int max (int num1,int num2){
        if(num1>num2){
            return num1;
        }
        else {
            return num2;
        }
    }
    public static void main(String[] args) {
        int a=max(2,3);
        System.out.println(a);
    }
}
