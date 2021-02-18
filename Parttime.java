public class Parttime extends Employee {
    double pay;
    double hrs;

    public Parttime(String name, double pay, double hrs){
        super(name);
        this.pay = pay;
        this.hrs = hrs;
    }

    public double getExpense(){
        return pay * hrs;
    }

    public String toString(){
        return getName() + " " + (int)pay +"x"+ (int)hrs + " = " + (int)getExpense();
    }
}
