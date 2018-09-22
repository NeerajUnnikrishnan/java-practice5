package com.company;
import java.util.*;
import java.io.*;


class Maintest {

    public static void main(String[] args){

        Student stud1 = new  Student();
        stud1.setId(1);
        stud1.setAge(10);
        stud1.setName("Raj");

        Student stud2 = new Student();
        stud1.setId(2);
        stud1.setAge(12);
        stud1.setName("Rivash");

        Student stud3 = new Student();
        stud1.setId(3);
        stud1.setAge(11);
        stud1.setName("Rajiv");

        Student stud4 = new Student();
        stud1.setId(4);
        stud1.setAge(14);
        stud1.setName("Anand");

        Student stud5 = new Student();
        stud1.setId(5);
        stud1.setAge(10);
        stud1.setName("Gopal");

        List<Student> list = new ArrayList<>();
        list.add(stud1);
        list.add(stud2);
        list.add(stud3);
        list.add(stud4);
        list.add(stud5);

        Collections.sort(list,new AgeComparator());
        Collections.sort(list,new NameComparator());
        Collections.sort(list,new IdComparator());

        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }


    }

    static class NameComparator implements Comparator{
        public int compare(Object o1,Object o2){
            Student s1=(Student)o1;
            Student s2=(Student)o2;

            return s1.name.compareTo(s2.name);
        }
    }

    static class AgeComparator implements Comparator{
        public int compare(Object o1,Object o2){
            Student s1=(Student)o1;
            Student s2=(Student)o2;

            if(s1.age==s2.age)
                return 0;
            else if(s1.age>s2.age)
                return 1;
            else
                return -1;
        }
    }


    static class IdComparator implements Comparator{
        public int compare(Object o1,Object o2){
            Student s1=(Student)o1;
            Student s2=(Student)o2;

            if(s1.id==s2.id)
                return 0;
            else if(s1.id>s2.id)
                return 1;
            else
                return -1;
        }
    }

    static class Student {
        public int id;
        public int age;
        public String name;

        public void setId(int id) {
            this.id = id;
        }

        public int getId() {
            return this.id;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public int getAge() {
            return this.age;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getName() {
            return this.name;
        }

    }

}