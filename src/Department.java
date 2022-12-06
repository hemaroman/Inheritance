import java.util.Arrays;

public class Department extends Faculty {

    String departmentName;

//. It is a concept by which a single operation can be performed in multiple different ways.

    public static void main(String[] args) {

        Department computerScience =  new Department();

        computerScience.viewTeachersList();
        System.out.println(Arrays.toString(computerScience.courseList));


    }


    public void viewTeachersList() {

        System.out.println(this.teachersList[0]);
        System.out.println(this.teachersList[1]);
    }

    public void viewTeachersList(String name) {

        System.out.println(this.teachersList[0]);
        System.out.println(this.teachersList[1]);
    }
}
