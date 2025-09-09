/*
    Q2. Employee Salary Management (Advanced)
    Requirements:
        Employee class banao jisme:
        Private variables: empId, empName, baseSalary, bonus, tax.
    Rules:
        Agar baseSalary negative ho to usse 0 set kar do.
        Bonus sirf 10% tak allow ho (baseSalary ka).
        Tax hamesha 5% se 30% ke beech hona chahiye.

    Public Methods:
        setSalary(double baseSalary, double bonus, double tax) → validation ke saath values set karo.
        calculateNetSalary() → netSalary = baseSalary + bonus – (baseSalary × tax/100) return kare.

        getDetails() → employee ke details print kare.
*/

package oops.encapsulation;

class employee{
    private int empId;
    private String empName;
    private double baseSalary;
    private double bonus;
    private double tax;
}

public class Excercise_02 {
    public static void main(String[] args) {

    }
}
