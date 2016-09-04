/**
 * Created by sarveshjain on 9/4/16.
 */
public class TriangleExercises {

    public static void printOneAsterisk(){
        System.out.print("*");
    }
    public static void printHorizontalLine(int num){
        for(int i=0; i<num; i++)
            System.out.print("*");

    }
    public static void printVerticalLine(int num){
        for(int i=0; i<num; i++)
            System.out.println("*");
    }
    public static void printRightTriangle(int num){
        for(int i=0; i<num; i++) {
            for (int j = 0; j <= i; j++)
                System.out.print("*");
            System.out.println();
        }
    }

    public static void printIsoscelesTriangle(int num){
        for(int i=0; i<num; i++) {
            for(int j=0;j<num-i;j++)
                System.out.print(' ');
            for(int j =0; j< 2*i +1; j++)
                System.out.print('*');
            System.out.println();
        }
    }
    public static void printReverseIsoscelesTriangle(int num){
        for(int i=0;i<num; i++){
            for(int j=0; j<=i ; j++)
                System.out.print(' ');
            for(int j=0; j<num + 1  - 2 * i ; j++)
                System.out.print('*');
            System.out.println();
        }
    }
    public static void printDiamond(int num){
        printIsoscelesTriangle(num -1);
        printHorizontalLine( 2 *num -1);
        System.out.println();
        printReverseIsoscelesTriangle(num -1);
    }
    public static void printDiamondWithName(int num, String name){
        printIsoscelesTriangle(num-1);
        System.out.println(name);
        printReverseIsoscelesTriangle(num -1);
    }




    public static void main(String[] args) {
        TriangleExercises.printOneAsterisk();
        System.out.println("\n" + "#######");
        TriangleExercises.printHorizontalLine(3);
        System.out.println("#######");
        TriangleExercises.printVerticalLine(3);
        System.out.println("#######");
        TriangleExercises.printRightTriangle(3);
        System.out.println("#######");
        TriangleExercises.printIsoscelesTriangle(3);
        System.out.println("#######");
        TriangleExercises.printDiamond(3);
        System.out.println("#######");
        TriangleExercises.printDiamondWithName(3, "Bill");

    }
}
