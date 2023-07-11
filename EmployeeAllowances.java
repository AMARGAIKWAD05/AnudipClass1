public class EmployeeAllowances {
    
     public static void main(String[] args) {
        double salary = 50000; 

        
        double daAllowance = 0.12 * salary; // 12% of the salary
        double hraAllowance = 0.13 * salary; // 13% of the salary
        double pfDeduction = 0.15 * salary; // 15% of the salary deducted as PF

       
        double grossSalary = salary + daAllowance + hraAllowance - pfDeduction;

       
        System.out.println("DA Allowance: " + daAllowance);
        System.out.println("HRA Allowance: " + hraAllowance);
        System.out.println("PF Deduction: " + pfDeduction);
        System.out.println("Gross Salary: " + grossSalary);
    }
    
}