public class SalaryManager {
    final double WORKING_TAX = 0.125;
    final double PENSION = 0.081;
    final double HEALTH_INSURANCE = 0.135;
    public static void main(String[] args){

    }

    public double getMonthlySalary(int yearlySalary){
        double monthlySalary = (double)yearlySalary / 12.0;
        System.out.println(calculateTax(monthlySalary));

        return monthlySalary;
    }

    public double calculateTax(double monthlySalary){
        double AllTax = monthlySalary * ( WORKING_TAX + PENSION + HEALTH_INSURANCE );
        return AllTax;
    }

}
