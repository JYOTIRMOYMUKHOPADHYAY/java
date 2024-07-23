package bank;

public class Student {
    public String name;
    public String batchName;
    public int age;
    public double psp;

    public void changeBatch(String batchName){
        this.batchName = batchName;
    }

    public void giveMockInterviews(){
        System.out.println("Giving Mock!!!");
    }
}
