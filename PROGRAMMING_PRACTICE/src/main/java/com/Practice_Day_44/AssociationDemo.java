package com.Practice_Day_44;

class TeacherAssociation {

    void teach() {
        System.out.println("Teacher teaches students");
    }
}

class StudentAssociation {

    void learn(TeacherAssociation teacher) {
        teacher.teach();
        System.out.println("Student learns");
    }
}

public class AssociationDemo {
    public static void main(String[] args) {

        TeacherAssociation teacher =
                new TeacherAssociation();

        StudentAssociation student =
                new StudentAssociation();

        student.learn(teacher);
    }
}
