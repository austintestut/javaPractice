public class Employee {

    private String name;
    private int id;
    private String department;
    private String position;

    public Employee(String nm, int i, String dept, String pos) {
        name = nm;
        id = i;
        department = dept;
        position = pos;
    }

    public Employee(String nm, int i) {
        name = nm;
        id = i;
        department = "";
        position = "";
    }

    public Employee() {
        name = "";
        id = 0;
        department = "";
        position = "";
    }

    public void setName(String nm) {
        name = nm;
    }
    public void setId(int i) {
        id = i;
    }
    public void setDepartment(String dept) {
        department = dept;
    }
    public void setPosition(String pos) {
        position = pos;
    }

    public String getName() {
        return name;
    }
    public int getId() {
        return id;
    }
    public String getDepartment() {
        return department;
    }
    public String getPosition() {
        return position;
    }
}
