package algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

/**
 * @author: yefeirong
 * @date: 2022/4/3 16:21
 * @describe:
 */
public class StudentCompara implements Comparator<Student> {


    @Override
    public int compare(Student o1, Student o2) {
        if (o1.age<o2.age){
            return -1;
        }
        if (o1.age>o2.age){
            return 1;
        }
        return 0;
    }
}
class Student{
    int age;
    public Student(int age){
        this.age=age;
    }

    public static void main(String[] args) {
        Student student1 = new Student(1);
        Student student2 = new Student(3);
        Student student3 = new Student(5);
        Student student4 = new Student(2);
        Student student5 = new Student(9);
//        Student[] stus ={student1,student2,student4,student3,student5};
        ArrayList<Student> arrayList = new ArrayList<>();
        arrayList.add(student1);
        arrayList.add(student2);
        arrayList.add(student3);
        arrayList.add(student4);
        arrayList.add(student5);
//        Arrays.sort(stus,new StudentCompara());
        arrayList.sort(new StudentCompara());
        for (Student stu:arrayList){
            System.out.println(stu.age);
        }



    }
}