package Branch;

public class simple_branch_first {
    String name, id;
    float cgpa;

    simple_branch_first(String a, String b, float c)
    {
        this.name = a;
        this.id = b;
        this.cgpa = c;
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
