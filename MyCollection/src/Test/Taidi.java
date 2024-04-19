package Test;

public class Taidi extends dog{
    public Taidi() {
    }

    public Taidi(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("一只叫做" + getName() + "的,"  + getAge() + "岁的泰迪正在吃骨头，边吃边曾");
    }
}
