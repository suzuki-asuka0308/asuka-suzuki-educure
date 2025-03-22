public class PartTimeEmployee extends Employee {
    private int hourlyWage;
    private int hoursWorked;

    public PartTimeEmployee(String name, int hourlyWage, int hoursWorked) {
        super(name);
        this.hourlyWage = hourlyWage;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public String getRole() {
        return "パートタイム";
    }

    @Override
    public int calculateSalary() {
        return hourlyWage * hoursWorked;
        //給与を「時給 × 働いた時間」で計算して返す。
        //親クラスの calculateSalary() のルールに従って中身だけ変えてる。
    }
}