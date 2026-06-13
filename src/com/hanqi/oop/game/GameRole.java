package com.hanqi.oop.game;

import java.util.Random;

public class GameRole {
    private String name;
    private int hp;
    private String face;

    String[] game_face={"相貌平平","相貌一般","面目丑陋"};

    public GameRole() {
    }

    public GameRole(String name, int hp) {
        this.name = name;
        this.hp = hp;

        Random random = new Random();
        int index=random.nextInt(game_face.length);
        this.face = game_face[index];
    }


    public String getFace() {
        return face;
    }

    public String getName() {
        return name;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getHp() {
        return hp;
    }




    public void attack(GameRole target){
        Random random = new Random();
        int hurt = random.nextInt(1,21);
        int remainHp = target.getHp() - hurt;
        if (remainHp < 0) {
            remainHp = 0;
        }
        target.setHp(remainHp);
        System.out.println(this.face+"的"+this.name+"攻击了"+target.face+target.name+"，" +
                "造成"+hurt+"伤害"+"剩"+remainHp+"血量");
    }
}
