package cn.edu.xjtlu.cpt105.week7.HW;

public class Lecturer extends Staff {

    private final String dept;
    private final double housingAllowance;


    public Lecturer(String ID, String name, String gender, double baseSalary, String dept, double housingAllowance) {
        super(ID, name, gender, baseSalary);
        this.dept = dept;
        this.housingAllowance = housingAllowance;
    }


    @Override
    public String toString() {
        return "Lecturer{" +
                "ID='" + getID() + '\'' +
                ", name='" + getName() + '\'' +
                ", gender='" + getGender() + '\'' +
                ", baseSalary=" + getSalary() + '\'' +
                ", dept='" + dept + '\'' +
                ", housingAllowance=" + housingAllowance +
                '}';
    }

    public String getDept() {
        return dept;
    }

    public double getHousingAllowance() {
        return housingAllowance;
    }
}
