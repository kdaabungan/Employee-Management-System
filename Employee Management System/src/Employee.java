public class Employee {

    private int id;
    private String name;
    private String department;

    Employee(int id, String name, String department){
        this.id = id;
        this.name = name;
        this.department = department;
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public String getDepartment(){
        return department;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setDepartment(String department){
        this.department = department;
    }

    //Display method
    void display(){
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("-------------------------");
    }
}
