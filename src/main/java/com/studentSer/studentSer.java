package com.studentSer;

import com.Student.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class studentSer {

    public List<Student> students = new ArrayList<Student>();

    public void addStudent(Student student) {
        if(student == null) {
            throw new IllegalArgumentException("khong duoc de chong Student ");
        }
        students.add(student);
    }

    public Optional<Student> getStudentByID(int id) {
        return students.stream().filter(student -> student.getId() == id).findFirst();
    }


    public  void updateStudent(Student student){
        if(student == null) {
            throw new IllegalArgumentException("khong duoc de chong Student ");
        }
        Optional<Student>  exStudent = getStudentByID(student.getId());
        if (exStudent.isPresent()) {students.set(students.indexOf(exStudent.get()), student);
        }else {
            throw new IllegalArgumentException("Student with id " + student.getId() + " does not exist");
        }
    }
        public Boolean deleteStudent(int id) {
         return students.removeIf(student -> student.getId() == id);
        }

        public List<Student> getStudents() {

        return new ArrayList<>(students);
        }
}
