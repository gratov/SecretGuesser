package com.cegekaschool.secretguessinggame.model.pineapples;

/**
 * Created by stijnli on 17/02/2017.
 */
public class Pineapple {
    private String name;
    private int points;
    private Secret secret;

    public Pineapple(String name){
        this.name = name;
        this.points = 0;
        this.secret = null;
    }

    public String getName(){
        return  name;
    }

    public Secret getSecret(){
        return secret;
    }
    public  int getPoints(){
        return  points;
    }

    public void setPoints(int points){
        this.points = points;
    }
    public void setSecret(Secret secret){
        this.secret = secret;
    }
}
