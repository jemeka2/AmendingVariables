public class AmendingVariables {
    /*
    Begin

        //Declare Variables
        Declare increase percentage
        Declare current annual income

        //Calculation(WITHOUT LOOP)
        multiply the current income by the increase percentage then add the sum back into the current income = year 1 increase
        multiply the year 1 income by the increase percentage then add the sum back into the year 1 income = year 2 income
        repeat process with each new year three more times until you reach the 5th year

        //Output
        Display 5th year results


    */
    public static void main(String[] args)
    {
        //Variables
        double incomeInc = 0.1;
        double currentInc = 62000;

        //Calculation (I don't think we have fully learned loops so I did it the long way
        double year1Inc = currentInc + (currentInc * incomeInc);
        double year2Inc = year1Inc + (year1Inc * incomeInc);
        double year3Inc = year2Inc + (year2Inc * incomeInc);
        double year4Inc = year3Inc + (year3Inc * incomeInc);
        double year5Inc = year4Inc + (year4Inc * incomeInc);

        //Output
        System.out.println("$" + year5Inc);
    }
}
