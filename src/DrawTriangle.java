import java.util.Scanner;

public class DrawTriangle {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Add meg a magasságot: ");
        int height = scn.nextInt();

        for(int i = 0;i < height;i++){
            for(int j = 0;j < i+1;j++){
                System.out.print('*');
            }
            System.out.println();
        }
    }
}