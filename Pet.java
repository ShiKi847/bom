package a.b.c.entity;

public abstract class Pet extends Object {
    private String name;
    private int health;
    private int love;

    public Pet() {
    }

    public Pet(String name, int health, int love) {
        this.name = name;
        this.health = health;
        this.love = love;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getLove() {
        return love;
    }

    public void setLove(int love) {
        this.love = love;
    }

    public void print() {
        System.out.println("我的名字叫" + name + "，健康值是" + health + "，和主人的亲密度是" + love + "。");
    }

    // 定义抽象方法
    public abstract void eat();
}