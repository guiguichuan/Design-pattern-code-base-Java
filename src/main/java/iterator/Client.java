package iterator;

public class Client {
    public static void main(String[] args) {
        StudentClass studentClass = new StudentClass(4);
        studentClass.appendStudent(new Student("李华"));
        studentClass.appendStudent(new Student("张鹏"));
        studentClass.appendStudent(new Student("刘秀"));
        studentClass.appendStudent(new Student("小红"));
        Iterator iterator = studentClass.iterator();
        while (iterator.hasNext()) {
            Student student = (Student) iterator.next();
            System.out.println(student.getName());
        }
    }
}
