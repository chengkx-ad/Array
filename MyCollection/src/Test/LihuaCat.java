package Test;

public class LihuaCat extends cat{
    public LihuaCat() {
    }

    public LihuaCat(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("一只叫做" + getName() + "的," + getAge() + "岁的狸花猫正在吃鱼");
    }
}
