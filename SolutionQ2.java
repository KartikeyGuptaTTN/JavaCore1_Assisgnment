abstract class Bank {
    abstract void getDetails(); 
}

class SBI extends Bank {
    @Override
    void getDetails() {
        System.out.println("Bank Name: SBI");
        System.out.println("Rate of Interest: 6.7% per annum\n");
        System.out.println("Branch : Prayagraj");
    }
}


class BOI extends Bank {
    @Override
    void getDetails() {
        System.out.println("Bank Name: BOI (Bank of India)");
        System.out.println("Rate of Interest: 6.5% per annum\n");
        System.out.println("Bank Branch: Noida");
    }
}

class ICICI extends Bank {
    @Override
    void getDetails() {
        System.out.println("Bank Name: ICICI Bank");
        System.out.println("Rate of Interest: 9.6% per annum\n");
        System.out.println("Bank Branch: Greater Noida");
    }
}

// Main
public class SolutionQ2{
    public static void main(String[] args) {
        Bank sbi = new SBI();
        Bank boi = new BOI();
        Bank icici = new ICICI();

        sbi.getDetails();
        boi.getDetails();
        icici.getDetails();
    }
}
