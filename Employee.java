import java.sql.SQLOutput;

public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax() {
        if (salary >= 1000) {
            return salary * 0.03;
        }
        return 0.0;
    }

    public double bonus() {
        int extraHours = this.workHours - 40;
        if (extraHours > 0) {
            return extraHours * 30;
        }
        return 0.0;
    }

    public double raiseSalary() {
        if (2021 - this.hireYear < 10) {
            return salary * 0.05;
        }
        if (2021 - this.hireYear >= 10 && 2021 - this.hireYear < 20) {
            return salary * 0.10;
        } else {
            return this.salary * 0.15;
        }
    }
    public void toString(Employee emp1){
        System.out.println("Adı: \t"+emp1.name);
        System.out.println("Çıplak Maaşı: \t"+emp1.salary);
        System.out.println("Çalışma saati:  \t"+emp1.workHours);
        System.out.println("İşe başladığı yıl: \t"+emp1.hireYear);
        System.out.println("Maaştan alınacak vergi: \t"+emp1.tax());
        System.out.println("Çalışma bonusu: \t"+emp1.bonus());
        System.out.println("Maaş artışı: \t"+emp1.raiseSalary());
        System.out.println("Vergi ve bonuslar ile maaş: \t"+(emp1.salary+emp1.bonus()-emp1.tax()));
        System.out.println("Toplam maaşı: \t"+(emp1.salary+emp1.bonus()-emp1.tax()+emp1.workHours+emp1.raiseSalary()));
    }
}
