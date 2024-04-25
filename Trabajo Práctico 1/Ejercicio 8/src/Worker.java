public class Worker extends Employee {

    private String area;

    public Worker (String name, int age, double salary, String area){
        super(name, age, salary);
        this.area = area;
    }

    public String getArea(){
        return area;
    }

    public String produce(){
        String workerMessage = " producing in the "+ area;
        return workerMessage;
    }
}
