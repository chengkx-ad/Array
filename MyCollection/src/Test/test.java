package Test;

import java.util.ArrayList;

public class test {
    public static void main(String[] args) {

        BosiCat b = new BosiCat("猫猫1号",2);

        LihuaCat l = new LihuaCat("猫猫2号",3);

        Hashiqi h = new Hashiqi("哈士奇1号",4);

        Taidi t = new Taidi("泰迪1号",5);


        ArrayList<BosiCat> list1 = new ArrayList<>();
        ArrayList<LihuaCat> list2 = new ArrayList<>();
        ArrayList<Hashiqi> list3 = new ArrayList<>();
        ArrayList<Taidi> list4 = new ArrayList<>();

        ArrayList<Animal> list = new ArrayList<>();
        list.add(b);
        list.add(l);
        list.add(h);
        list.add(t);

        KeepPet(list);
    }
    public static void KeepPet(ArrayList<? extends Animal> list){
        for (Animal animal : list) {
            animal.eat();
        }
    }
}
