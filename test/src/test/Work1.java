package test;

import java.util.*;

/**
 * 学生信息表
 *
 * @author luyaokao
 * 2020-3-4-19：28
 */
public class Work1 {
    public static class Student {
        String name;//学生姓名
        int age;//年龄
        int number;//分数
        int cla;//班级

        public Student(String name, int age, int number, int cla) {
            this.name = name;
            this.age = age;
            this.number = number;
            this.cla = cla;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public int getNumber() {
            return number;
        }

        public int getCla() {
            return cla;
        }
    }

    public static void main(String[] args) {
        List<Student> list1 = new ArrayList<>();
        list1.add(new Student("张三", 18, 80, 1));
        list1.add(new Student("李四", 19, 100, 1));
        list1.add(new Student("王五", 17, 59, 1));
        List<Student> list2 = new ArrayList<>();
        list2.add(new Student("赵六", 18, 85, 2));
        list2.add(new Student("刘七", 19, 93, 2));
        list2.add(new Student("孙八", 17, 55, 2));
        List<Student> list3 = new ArrayList<>();
        list3.addAll(list1);
        list3.addAll(list2);
        System.out.println("新list：");
        for (int i = 0; i < list3.size(); i++) {
            System.out.println(list3.get(i).getName() + " " + list3.get(i).getAge() + "岁 " +
                    list3.get(i).getNumber() + "分 " + list3.get(i).getCla() + "班");
        }
        System.out.println("==================================");
        Collections.sort(list3, new Comparator<Student>() {
            @Override
            public int compare(Student student, Student t1) {
                int diff = student.getNumber() - t1.getNumber();
                if (diff > 0) {
                    return 1;
                } else if (diff < 0) {
                    return -1;
                }
                return 0;
            }
        });//按年龄排序
        System.out.println("分数排名");
        for (int i = 0; i < list3.size(); i++) {
            System.out.println(list3.get(i).getName() + " " + list3.get(i).getAge() + "岁 " +
                    list3.get(i).getNumber() + "分 " + list3.get(i).getCla() + "班");
        }
        System.out.println("===========================================\n不及格学生：");
        for (int i = 0; i < list3.size(); i++) {
            if (list3.get(i).getNumber() < 60) {
                System.out.println(list3.get(i).getName() + " " + list3.get(i).getAge() + "岁 " +
                        list3.get(i).getNumber() + "分 " + list3.get(i).getCla() + "班");
            }
        }
        System.out.println("===========================================\n张三信息：");
        for (int i = 0; i < list3.size(); i++) {
            if (list3.get(i).getName() == "张三") {
                System.out.println(list3.get(i).getName() + " " + list3.get(i).getAge()
                        + "岁 " + list3.get(i).getNumber() + "分 " + list3.get(i).getCla() + "班");
            }
        }
        System.out.println("===========================================\n剔除年龄大于18岁后的表：");
        for (int i = 0; i < list3.size(); i++) {
            if (list3.get(i).getAge() > 18) {
                list3.remove(i);
                i--;
            }
        }
        for (int i = 0; i < list3.size(); i++) {
            System.out.println(list3.get(i).getName() + " " + list3.get(i).getAge() +
                    "岁 " + list3.get(i).getNumber() + "分 " + list3.get(i).getCla() + "班");
        }
    }
}
