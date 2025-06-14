class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }
}

public class PassReferences2 {
    Person person = new Person("John", 30);
    public static void main(String[] args) {
        PassReferences2 pr = new PassReferences2();
        System.out.println("Before test method with person name = " + pr.person.getName() + ", age = " + pr.person.getAge());
        pr.test(pr.person);
        System.out.println("After test method with person name = " + pr.person.getName() + ", age = " + pr.person.getAge());
    }
    public void test(Person person) {
        System.out.println("In test method with person name = " + person.getName() + ", age = " + person.getAge());
        person.setName("Jane");
        person.setAge(25);
        System.out.println("In test method after modification with person name = " + person.getName() + ", age = " + person.getAge());
    }

}
