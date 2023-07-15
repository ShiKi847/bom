package a.b.c.entity;

public class Penguin extends Pet {
    private String sex;

    public Penguin() {
    }

    public Penguin(String name, int health, int love, String sex) {
        super(name, health, love);
        this.sex = sex;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("我的性别" + sex);
    }

    @Override
    public void eat() {
        System.out.println("吃鱼");
        int health = super.getHealth();
        super.setHealth(health + 5);
    }

    public void swimming() {
        System.out.println("游泳");
        int health = super.getHealth();
        super.setHealth(health - 8);
        int love = super.getLove();
        super.setLove(love + 3);
    }
}
