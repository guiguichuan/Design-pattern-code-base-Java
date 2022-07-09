package iterator;

public class StudentClassIterator implements Iterator{

    private StudentClass studentClass;
    private int index;

    public StudentClassIterator(StudentClass studentClass) {
        this.studentClass = studentClass;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        if (index < studentClass.getLength()) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Object next() {
        Student student = studentClass.getStudentAt(index);
        index++;
        return student;
    }
}
