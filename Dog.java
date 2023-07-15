package a.b.c.entity;

public class Dog extends Pet {
    private String strain;

    public Dog() {
    }

    public Dog(String name, int health, int love, String strain) {
        super(name, health, love);
        this.strain = strain;
    }

    public String getStrain() {
        return strain;
    }

    public void setStrain(String strain) {
        this.strain = strain;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("我是" + strain);
    }

    @Override
    public void eat() {
        System.out.println("吃狗粮");
        int health = super.getHealth();
        super.setHealth(health + 3);
    }

    public void catchingFlyDisc() {
        System.out.println("接飞盘");
        int health = super.getHealth();
        super.setHealth(health - 10);
        int love = super.getLove();
        super.setLove(love + 5);
    }
}
