package com.studentSer;

import com.Student.Student;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class studentSerTest {
private studentSer studentSer;
    @BeforeEach
    void setUp() {
        studentSer = new studentSer();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testAddStudent() {
        Student student = new Student(1 , "tuyen" , 20 , 3.4);
        studentSer.addStudent(student);

       assertEquals(1, studentSer.getStudents().size());

    }

    @Test
    void testAddStudentNull(){
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            studentSer.addStudent(null);
        });
        assertTrue(exception.getMessage().contains("khong duoc de chong Student"));
    }

    @Test
    void AddStudentNullName(){

        Exception exception = assertThrows(IllegalArgumentException.class, () ->
            studentSer.addStudent( new Student(1 , "" , 20 , 3.4)));
        assertEquals("khong duoc de chong name",exception.getMessage());
    }


    @Test
    void AddStudentTuoi(){

        Exception exception = assertThrows(IllegalArgumentException.class, () ->
                studentSer.addStudent( new Student(1 , "tuyen" , 17 , 3.4)));
        assertEquals("tuoi phai lon hon 18",exception.getMessage());
    }

    @Test
    void AddStudentMark(){

        Exception exception = assertThrows(IllegalArgumentException.class, () ->
                studentSer.addStudent( new Student(1 , "tuyen" , 20 , 12.2)));
        assertEquals("diem phai nam giua 0 va 10",exception.getMessage());
    }

//    sadsadsadasdasdsa
}