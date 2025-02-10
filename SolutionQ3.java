// Q3. Explain the difference between method overloading and method overriding in Java. Provide code examples to illustrate both concepts.
// Method Overloading
// Method overloading in Java allows multiple methods in the same class to have the same name but different 
//parameters, method return type and different order of parameters.

// Method Overriding
// Method overriding occurs when a subclass provides a specific implementation for a method that is already 
//defined in its parent class. The overridden method in the child class must have the same name, return type, 
//and parameters as the method in the parent class.






//Example of Method Overriding
abstract class car {
    abstract void getDetails(); 
}

class BMW extends car {
    @Override
    void getDetails() {
        System.out.println("Model  : BMW X5");
        System.out.println("Engine : B58");
    }
}


class Toyota extends car {
    @Override
    void getDetails() {
        System.out.println("Model   : Fortuner");
        System.out.println("Engine  : 2.7-liter 2TR-FE");
    }
}


// Main
public class SolutionQ3{
    //Method Overloading
    public static int Sum(int a, int b){
        return a+b;
    }
    public static int Sum(int a, int b, int c){
        return a+b+c;
    }
    public static void main(String[] args) {
        car bmw = new BMW();
        car toyota = new Toyota();

        //Overriding Method Calling
        bmw.getDetails();
        toyota.getDetails();

        //Overloading Method Calling
        System.out.println(Sum(10,20));
        System.out.println(Sum(10,20,30));
    }
   
}

