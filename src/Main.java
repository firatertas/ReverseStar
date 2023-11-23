public class Main {
    public static void main(String[] args) {
        int num =10;
        for (int i =num; i>0; i--){
            for (int j =num-i; j>0; j--){
                System.out.print(" ");
            }
            for (int k= 2*i-1; k>0;k--){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}