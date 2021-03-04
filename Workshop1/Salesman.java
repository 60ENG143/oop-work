public class Salesman extends Employee {
    private double salary;
    private double sales;

    public Salesman(String name, double salary, double sales){
        super(name);
        this.salary = salary;
        this.sales = sales;
    }

    public double getExpense(){
        return salary + (0.01 * sales);
    }


    public String toString(){
        return getName() +" "+ (int)salary + " + " + "("+"0.01"+ "x" + (int)sales +")"+" = "+(int)getExpense();
    }


}
