package com.hanqi.oop.dog;

public class Dog {
    private String name;
    private int age;
    private String colour;

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setAge(int age) {
        if (age >= 0 && age <= 15) {
            this.age = age;
        } else {
            System.out.println(age + "年龄不在合理范围之内");
        }
    }
    public int getAge(){
        return age;
    }


    public void setColour(String colour) {
       this.colour = colour;
    }

    public String getColour() {
        return colour;
    }


    public void eat() {
        System.out.println(age+"岁的"+name+"正在吃骨头");
    }
}




