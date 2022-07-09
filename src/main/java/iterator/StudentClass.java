package iterator;

public class StudentClass implements Aggregate{

    private Student[] students;
    private int last = 0;

    public StudentClass(int maxsize) {
        this.students = new Student[maxsize];
    }

    public Student getStudentAt(int index) {
        return students[index];
    }

    public void appendStudent(Student student) {
        this.students[last] = student;
        last++;
    }

    public int getLength() {
        return last;
    }

    @Override
    public Iterator iterator() {
        return new StudentClassIterator(this);
    }
}
