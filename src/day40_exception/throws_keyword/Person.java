package day40_exception.throws_keyword;

public class Person {

    private String name; // empty will give you => null
    private int age;


    public String getName() {
        return name;
    }

    public void setName(String name) throws Exception {
        if (name.isEmpty() || name == null){
            throw  new Exception("You cant do that sorry");
        }
        this.name = name;
    }

    public int getAge() throws IllegalAccessException {
        if (age < 0 || age >120){
            throw new IllegalAccessException("Give positive value");
        }
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
