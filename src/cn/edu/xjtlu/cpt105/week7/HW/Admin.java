package cn.edu.xjtlu.cpt105.week7.HW;

public class Admin extends Staff {

    private final String dept;
    private final String jobTitle;
    private final double allowance;

    public Admin(String ID, String name, String gender, double baseSalary, String dept, String jobTitle, double allowance) {
        super(ID, name, gender, baseSalary);
        this.dept = dept;
        this.jobTitle = jobTitle;
        this.allowance = allowance;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "ID='" + getID() + '\'' +
                ", name='" + getName() + '\'' +
                ", gender='" + getGender() + '\'' +
                ", baseSalary=" + getSalary() + '\'' +
                ", dept='" + dept + '\'' +
                ", allowance =" + allowance +
                '}';
    }

    @Override
    public double getTax() {
        if (allowance < 1000) return super.getTax();
        else return (getSalary()+allowance) * ((getSalary()+allowance) < 10000 ? 0.1 : 0.25);
    }

    public String getDept() {
        return dept;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public double getAllowance() {
        return allowance;
    }
}
