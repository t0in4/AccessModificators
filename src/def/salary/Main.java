package def.salary;

public class Main {
    public static void main(String[] args) {
        Salary salary = new Salary(1500);
        Promotion promotion = new Promotion(salary);
        promotion.promote();
        System.out.println(salary);
        System.out.println(promotion);
    }
}
