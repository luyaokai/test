package test;

public class NineNineTable {
    public static void main(String[] args) {
        for(int i = 1;i < 10;i++){
            for(int j = i;j < 10;j++){
                System.out.print(i+"x"+j+"="+i*j+" ");
                if(i*j < 10){
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
