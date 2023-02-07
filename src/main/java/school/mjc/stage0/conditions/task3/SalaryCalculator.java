package school.mjc.stage0.conditions.task3;

public class SalaryCalculator {
    public void calculateSalary(int salary) {
        float BasicSalary;
        if(salary < 0) {
            System.out.println("wrong input");
        }else if (salary <= 10000){
            BasicSalary = (float) (salary - salary * 0.15);
            System.out.println(BasicSalary);
        }else if(salary <= 20000){
            BasicSalary = (float)(salary - salary * 0.18);
            System.out.println(BasicSalary);
        }else {
            BasicSalary = (float)(salary - salary * 0.2);
            System.out.println(BasicSalary);
        }

    }
}
