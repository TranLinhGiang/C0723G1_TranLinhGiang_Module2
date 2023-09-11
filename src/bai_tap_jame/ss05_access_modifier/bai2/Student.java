package bai_tap_jame.ss05_access_modifier.bai2;

public class Student {
    private String name;
    private String classes;

    public Student() {
    }

    public Student(String name, String classes) {
        this.name = name;
        this.classes = classes;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", classes='" + classes + '\'' +
                '}';
    }

    public static class TestStudent {
        public static void main(String[] args) {
            Student student= new Student("Giang","C07");
            System.out.println(student);
        }
    }
}
