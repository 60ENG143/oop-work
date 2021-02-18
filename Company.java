import java.util.ArrayList;

public class Company{
    private String title;
    private double totalExpense;
    private ArrayList<Employee> employees;

    public Company(String title){
        this.title = title;
        totalExpense = 0.0;
        employees = new ArrayList<>();

    }

    public String getTitle(){
        return title;
    }

    public void addEmployee(Employee e){
        employees.add(e);
    }

    public double getTotalExpense(){
        for(Employee e : employees){
            totalExpense += e.getExpense();
        }
        return (int)totalExpense;
    }

    public void print(){
        for(Employee e : employees){
            System.out.println(e.toString());
        }
        System.out.println("CoE = "+ (int)getTotalExpense());
    }
}