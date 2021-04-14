public class Student {
    private String name;
    private String id;
    private int chinese;
    private int math;
    private int english;
    private static int studentAmount;

    public Student(String name, String id, int chinese, int math, int english,int studentAmount) {
        this.name = name;
        this.id = id;
        this.chinese = chinese;
        this.math = math;
        this.english = english;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public int getChinese() {
        return chinese;
    }

    public int getMath() {
        return math;
    }

    public int getEnglish() {
        return english;
    }

    public static int getStudentAmount() {
        return studentAmount;
    }

    public int getTotalScore() {
        int tt = getChinese()+getEnglish()+getMath();
        return tt;
    }

    public double getAverageScore() {
        double av = (getChinese()+getMath()+getEnglish())/3;
        return av;
    }

    public String toString() {
        return getName()+getId()+getChinese()+getMath()+getEnglish();
    }
}
