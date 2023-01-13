package def.salary;

public class Promotion {
    Salary salary;

    Promotion(Salary salary) {
        this.salary = salary;

    }
    public void promote() {
        salary.income += 1500;
    }

    @Override
    public String toString() {
        return "Promotion{" +
                "salary=" + salary +
                '}';
    }
}
