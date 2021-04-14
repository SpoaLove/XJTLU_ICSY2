package cn.edu.xjtlu.cpt105.week7.HW;

public class Professor extends Staff{

    private final String dept;
    private final double housingAllowance;
    private final double trafficAllowance;

    public Professor(String ID, String name, String gender, double baseSalary, String dept, double housingAllowance, double trafficAllowance) {
        super(ID, name, gender, baseSalary);
        this.dept = dept;
        this.housingAllowance = housingAllowance;
        this.trafficAllowance = trafficAllowance;
    }

    @Override
    public String toString() {
        return "Professor{" +
                "ID='" + getID() + '\'' +
                ", name='" + getName() + '\'' +
                ", gender='" + getGender() + '\'' +
                ", baseSalary=" + getSalary() + '\'' +
                ", dept='" + dept + '\'' +
                ", housingAllowance=" + housingAllowance + '\'' +
                ", trafficAllowance=" + trafficAllowance +
                '}';
    }

    public String getDept() {
        return dept;
    }

    public double getHousingAllowance() {
        return housingAllowance;
    }

    public double getTrafficAllowance() {
        return trafficAllowance;
    }
}
