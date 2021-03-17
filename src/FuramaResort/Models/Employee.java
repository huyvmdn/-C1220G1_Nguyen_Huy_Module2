package FuramaResort.Models;

public class Employee {
    private String nameEmployee;
    private int age;
    private String adressEmployee;

    public Employee(String nameEmployee, int age, String adressEmployee) {
        this.nameEmployee = nameEmployee;
        this.age = age;
        this.adressEmployee = adressEmployee;
    }

    public Employee(String[] arrString) {
        this.nameEmployee = arrString[0];
        this.age = Integer.parseInt(arrString[1]);
        this.adressEmployee = arrString[2];
    }

    public String getNameEmployee() {
        return nameEmployee;
    }

    public void setNameEmployee(String nameEmployee) {
        this.nameEmployee = nameEmployee;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAdressEmployee() {
        return adressEmployee;
    }

    public void setAdressEmployee(String adressEmployee) {
        this.adressEmployee = adressEmployee;
    }

    @Override
    public String toString() {
        return  nameEmployee + ',' +
                 age +',' +
                adressEmployee ;
    }

    @Override
    public int hashCode() {
        return nameEmployee.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Employee) {
            Employee another = (Employee) obj;
            if (this.nameEmployee.equals(another.nameEmployee)) {
                return true;
            }
        }
        return false;
    }

    public String showInfo() {
        return "Employee{" +
                "nameEmployee='" + nameEmployee + '\'' +
                ", age=" + age +
                ", adressEmployee='" + adressEmployee + '\'' +
                '}';
    }
}
