package def.salary;

public class Salary {
    long income;

    Salary(long income) {
        this.income = income;
    }

    @Override
    public String toString() {
        return "Salary{" +
                "income=" + income +
                '}';
    }
}
