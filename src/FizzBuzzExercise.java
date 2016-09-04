/**
 * Created by sarveshjain on 9/4/16.
 */
public class FizzBuzzExercise {

    public static void printFizzBuzz(int num){
        for(int i =1; i <=num; i++){
            System.out.println((i % 3 ==0 && i % 5 ==0)? "FizzBuzz": (i %3 ==0?"Fizz":(i%5 ==0? "Buzz":""+i)));
        }
    }
    public static void main(String[] args) {
        FizzBuzzExercise.printFizzBuzz(100);
    }
}
