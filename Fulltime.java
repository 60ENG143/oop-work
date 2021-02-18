public class Fulltime extends Employee{
    double salary;

    public Fulltime(String name, double salary){
        super(name);
        this.salary = salary;
    }

    public double getExpense(){
        return salary;
    }

    public String toString(){
        return getName() + " " + (int)getExpense();
    }
}