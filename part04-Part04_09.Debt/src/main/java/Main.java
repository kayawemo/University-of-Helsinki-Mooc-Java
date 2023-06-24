
public class Main {

    public static void main(String[] args) {
        // Test your Debt class here
        Debt mortgage = new Debt(120000.0, 1.02);
        mortgage.printBalance();

        mortgage.waitOneYear();
        mortgage.printBalance();

        int years = 0;

        while (years < 20) {
            mortgage.waitOneYear();
            years = years + 1;
        }

        mortgage.printBalance();
=======
        //Debt mortgage = new Debt(120000.0, 1.01);
        //mortgage.printBalance();

        //mortgage.waitOneYear();
        //mortgage.printBalance();

        //int years = 0;

        //while (years < 20) {
        //    mortgage.waitOneYear();
        //    years = years + 1;
        //}

        //mortgage.printBalance();
>>>>>>> 498105c862e600fc03f788af25c3cea9050b6215
    }
}
