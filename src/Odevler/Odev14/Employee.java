package Odevler.Odev14;

public class Employee {
    String fullName;
    double salary;
    int workHours;
    int hireYear;
    static final int TODAYS_YEAR = 2021;

    public Employee(String fullName, double salary, int workHours, int hireYear) {
        this.fullName = fullName;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax() {
        double tax;
        if (this.salary > 1000) {
            tax = salary * 0.03;
        } else
            tax = 0;
        return tax;
    }

    public int bonus() {
        int bonus;
        if (this.workHours > 40) {
            bonus = (workHours - 40) * 30;
        } else
            bonus = 0;
        return bonus;
    }

    public double raiseSalary() {
        double raiseSalary = 0;
        if ((TODAYS_YEAR - this.hireYear) < 10) {
            raiseSalary = salary * 0.05;

        } else if ((TODAYS_YEAR - this.hireYear) > 9 && (TODAYS_YEAR - this.hireYear) < 20) {

            raiseSalary = salary * 0.1;


        } else if ((TODAYS_YEAR - this.hireYear) > 19)
            raiseSalary = salary * 0.15;

        return raiseSalary;
    }

    @Override
    public String toString() {
        String employeeInfo =
                "Adı : " + fullName + "\n" +
                        "Maaşı : " + salary + "\n" +
                        "Çalışma Saati : " + workHours + "\n" +
                        "Başlangıç Yılı : " + hireYear + "\n" +
                        "Vergi : " + tax() + "\n" +
                        "Bonus : " + bonus() + "\n" +
                        "Maaş Artışı : " + raiseSalary() + "\n" +
                        "Vergi ve Bonuslar ile birlikte maaş : " + (salary - tax() + bonus()) + "\n" +
                        "Toplam Maaş : " + (salary + raiseSalary()) + "\n";
        return employeeInfo;

    }
}
