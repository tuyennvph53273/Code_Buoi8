package com.Student;

public class Student {
    public Integer id;
    public String name;
    public Integer age;
    public Double mark;


    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", mark=" + mark +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("khong duoc de chong name");
        }
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
 if ( age < 18 ){
            throw new IllegalArgumentException("tuoi phai lon hon 18");
        }
        this.age = age;
    }

    public Double getMark() {
        return mark;
    }

    public void setMark(Double mark) {
    if (mark < 0  || mark > 10) {
            throw new IllegalArgumentException("diem phai nam giua 0 va 10");
        }
        this.mark = mark;
    }

    public Student( Integer id, String name, Integer age, Double mark) {
        this.id = id;
        setName(name);
        setAge(age);
        setMark(mark);
    }

}
