package cn.edu.xjtlu.cpt105.week7.HW;

public class Staff {

    private final String ID;
    private final String name;
    private final String gender;
    private final double baseSalary;

    public Staff(String ID, String name, String gender, double baseSalary) {
        this.ID = ID;
        this.name = name;
        this.gender = gender;
        this.baseSalary = baseSalary;
    }

    public double getSalary() {
        return baseSalary;
    }

    void printInfo() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Staff{" +
                "ID='" + ID + '\'' +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", baseSalary=" + baseSalary +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Staff)) return false;

        Staff staff = (Staff) o;

        return ID.equals(staff.ID);
    }

    @Override
    public int hashCode() {
        return ID.hashCode();
    }

    public double getTax() {
        return getSalary() * (getSalary() < 10000 ? 0.1 : 0.25);
    }

    public String getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }
}
