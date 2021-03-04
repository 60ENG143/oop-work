public class Main{
    public static void main(String[] args){
        Company c = new Company("CoE");
        c.addEmployee(new Fulltime("Jane", 30000));
        c.addEmployee(new Salesman("John", 10000, 150000));
        c.addEmployee(new Fulltime("Randy", 18000));
        c.addEmployee(new Parttime("Josh", 150, 80));
        c.addEmployee(new Parttime("Marry", 100, 60));
        c.print();        
    }
}