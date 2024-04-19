package Test;

public class BosiCat extends cat{
    public BosiCat() {
    }

    public BosiCat(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("一只叫做" + getName() + "的" + getAge() + "岁的波斯猫正在吃小饼干");
    }
}
