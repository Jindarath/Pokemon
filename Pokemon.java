import java.io.*;
import java.util.Scanner;

public  class Pokemon {
    public String name;
    public int maxHp;
    public int currHp;
    public int maxPp;
    public int currPp;
    public int level;
    public int exp;
    public int maxExp;

    public Pokemon(){
        this.exp = 0;
        this.maxExp = 30;
        this.maxHp = 25;
        this.level = 1;
        this.currHp = 25;
    }

    public int currentLevel(){
        level = level;
        return level;
    }

    public int levelUp(){
        level = level+1;
        this.currentLevel();
        return level;
    }

    public int killMonter(){
        exp = exp+30;
         if(exp >= maxExp){
            this.levelUp();   
        }
        exp = exp % maxExp;
        return level;
    }
    

        

    
}