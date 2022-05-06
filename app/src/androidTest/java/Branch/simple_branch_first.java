package Branch;

public class simple_branch_first {
    String name, id;
    float cgpa;

    int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public simple_branch_first(String name, String id, float cgpa, int age) {
        this.name = name;
        this.id = id;
        this.cgpa = cgpa;
        this.age = age;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public float getCgpa() {
        return cgpa;
    }

    public void setCgpa(float cgpa) {
        this.cgpa = cgpa;
    }
}
