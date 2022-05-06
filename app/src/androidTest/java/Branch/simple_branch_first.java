package Branch;

public class simple_branch_first {
    String name, id;
    float cgpa;
    double height;

    public simple_branch_first(String name, String id, float cgpa, double height) {
        this.name = name;
        this.id = id;
        this.cgpa = cgpa;
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
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
