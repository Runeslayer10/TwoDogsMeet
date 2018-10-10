/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package twodogsmeet;

/**
 *
 * @author blhad3491
 */
public class Dog {
    int age1, aggression1, hunger1, age2, aggression2, hunger2;
    
public Dog(){
    age1 = (int) (Math.random() * 10 + 1);
    aggression1 = (int) (Math.random() * 10 + 1);
    hunger1 = (int) (Math.random() * 10 + 1);
}

public Dog(int _age){
    
    age2 = (int) (Math.random() * 10 + 1);
    aggression2 = (int) (Math.random() * 10 + 1);
    hunger2 = (int) (Math.random() * 10 + 1);
} 

public int getAggression1() {
    return aggression1;
  }

public void setAggression1(int dogAgg1){
    aggression1 = dogAgg1;
  }

public int getAggression2() {
    return aggression2;
  }

public void setAggression2(int dogAgg2){
    aggression2 = dogAgg2;
  }
  
public int getAge1() {
    return age1;
  }

  public void setAge1(int dogAge1){
    age1 = dogAge1;
  }
  
public int getAge2() {
    return age2;
  }

public void setAge2(int dogAge2){
    age2 = dogAge2;
  }
  
  
public int getHunger1() {
    return hunger1;
  }

public void setHunger1(int dogHunger1){
    hunger1 = dogHunger1;
  }
  
public int getHunger2() {
    return hunger2;
  }

public void setHunger2(int dogHung2){
    hunger2 = dogHung2;
  }
}
