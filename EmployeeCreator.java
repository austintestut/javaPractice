public class EmployeeCreator {
    public static void main(String[] args) {

        Employee susan = new Employee("Susan Meyers", 47899, "Accounting", "Vice President");
        System.out.println("Employee 1 name: " + susan.getName());
        System.out.println("Employee 1 id: " + susan.getId());
        System.out.println("Employee 1 department: " + susan.getDepartment());
        System.out.println("Employee 1 position: " + susan.getPosition());

        Employee mark = new Employee("Mark", 39119);
        System.out.println("Employee 2 name: " + mark.getName());
        System.out.println("Employee 2 id: " + mark.getId());
        System.out.println("Employee 2 department: " + mark.getDepartment());
        System.out.println("Employee 2 position: " + mark.getPosition());

        Employee joy = new Employee();
        System.out.println("Employee 3 name: " + joy.getName());
        System.out.println("Employee 3 id: " + joy.getId());
        System.out.println("Employee 3 department: " + joy.getDepartment());
        System.out.println("Employee 3 position: " + joy.getPosition());

        joy.setName("Joy Rogers");
        joy.setId(10092);
        joy.setDepartment("Manufacturing");
        joy.setPosition("CEO");

        System.out.println("Employee 3 name: " + joy.getName());
        System.out.println("Employee 3 id: " + joy.getId());
        System.out.println("Employee 3 department: " + joy.getDepartment());
        System.out.println("Employee 3 position: " + joy.getPosition());

    }
}
