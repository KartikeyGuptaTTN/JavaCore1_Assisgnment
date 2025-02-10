import java.util.*;
public class SolutionQ5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        try {
            int num = sc.nextInt();
            int x = 100/num;
        } catch (ArithmeticException e) {
            System.out.println("Number is divided by 0");
        }
        catch(java.util.InputMismatchException e) {
            System.out.println("Error Invalid input. Enter a integer number");
        }
        finally{        
            sc.close();
    }
}
}
