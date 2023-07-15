package a.b.c.entity;

public class Master {
    public void feed(Pet pet) {
        pet.eat(); // 运行期，依据实际传输进来的对象来确认
    }

    public Pet adopt(String typeId) {
        Pet pet = null;
        switch (typeId) {
            case "1":
                pet = new Dog();
                break;
            case "2":
                pet = new Penguin();
                break;
        }
        return pet;
    }

    public void play(Pet pet) {
        if (pet instanceof Dog) {
            Dog dog = (Dog) pet;
            dog.catchingFlyDisc();
        } else if (pet instanceof Penguin) {
            Penguin penguin = (Penguin) pet;
            penguin.swimming();
        }
    }
}
