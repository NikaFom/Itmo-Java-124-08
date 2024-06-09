package itmo.java.basics.lab3;

public class JavaProgram {
    public static void main(String[] args) {
        Study study = new Study("Изучение Java-это просто!");

        study.printCourse();
        System.out.println(study.course);
    }
}
