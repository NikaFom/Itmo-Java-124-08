package itmo.java.basics.lab3;

class Study {
    public String course;

    public Study(String course) {
        this.course = course;
    }

    public String printCourse() {
        return this.course;
    }

    @Override
    public String toString() {
        return "Study{" +
                "course='" + course + '\'' +
                '}';
    }
}
