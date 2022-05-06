package master;

public class master_class {
    int roll;
    String name;

    master_class(int a, String b)
    {
        this.roll = a;
        this.name = b;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
