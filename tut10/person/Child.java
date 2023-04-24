package tut10.person;

//child - derived class
public class Child extends Person{
    public Child(String name, int age) {
        super(name, age);
    }

    @Override
    public void setAge(int age) throws IllegalArgumentException {
        if (age > 15) {
            throw new IllegalArgumentException("Age could not be greater than 15");
        }
        super.setAge(age);
    }
}
