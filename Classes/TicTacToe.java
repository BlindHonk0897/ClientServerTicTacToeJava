/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import static java.util.Collections.list;
import java.util.stream.IntStream;

/**
 *
 * @author alingasada_sd2021
 */
public class TicTacToe {
    
    private ArrayList<Object> oneTwoThree;
    private ArrayList<Object> oneFourSeven;
    private ArrayList<Object> oneFiveNine;
    private ArrayList<Object> twoFiveEight;
    private ArrayList<Object> threeSixNine;
    private ArrayList<Object> threeFiveSeven;
    private ArrayList<Object> fourFiveSix;
    private ArrayList<Object> sevenEightNine;
    
    public TicTacToe() {
        this.oneTwoThree = new ArrayList();
            oneTwoThree.add(1);
            oneTwoThree.add(2);
            oneTwoThree.add(3);
        this.oneFourSeven = new ArrayList();
            oneFourSeven.add(1);
            oneFourSeven.add(4);
            oneFourSeven.add(7);
        this.oneFiveNine = new ArrayList();
            oneFiveNine.add(1);
            oneFiveNine.add(5);
            oneFiveNine.add(9);
        this.twoFiveEight = new ArrayList();
            twoFiveEight.add(2);
            twoFiveEight.add(5);
            twoFiveEight.add(8);
        this.threeSixNine = new ArrayList();
            threeSixNine.add(3);
            threeSixNine.add(6);
            threeSixNine.add(9);
        this.threeFiveSeven = new ArrayList();
            threeFiveSeven.add(3);
            threeFiveSeven.add(5);
            threeFiveSeven.add(7);
        this.fourFiveSix = new ArrayList();
            fourFiveSix.add(4);
            fourFiveSix.add(5);
            fourFiveSix.add(6);
        this.sevenEightNine = new ArrayList();
            sevenEightNine.add(7);
            sevenEightNine.add(8);
            sevenEightNine.add(9);
    }

    public ArrayList<Object> getOneTwoThree() {
        return oneTwoThree;
    }

    public ArrayList<Object> getOneFourSeven() {
        return oneFourSeven;
    }

    public ArrayList<Object> getOneFiveNine() {
        return oneFiveNine;
    }

    public ArrayList<Object> getTwoFiveEight() {
        return twoFiveEight;
    }

    public ArrayList<Object> getThreeSixNine() {
        return threeSixNine;
    }

    public ArrayList<Object> getThreeFiveSeven() {
        return threeFiveSeven;
    }

    public ArrayList<Object> getFourFiveSix() {
        return fourFiveSix;
    }

    public ArrayList<Object> getSevenEightNine() {
        return sevenEightNine;
    }
    
   public Object[] checkWin(){
       boolean thereIsWinner = false;
       String player ="";
       Object[] toReturn = new Object[2];
       if(!thereIsWinner){
           thereIsWinner = oneTwoThree.stream().allMatch(oneTwoThree.get(0)::equals);
           if(thereIsWinner){
               player = (String)oneTwoThree.get(0);
           }
       }
       if(!thereIsWinner){
           thereIsWinner = oneFourSeven.stream().allMatch(oneFourSeven.get(0)::equals);
           if(thereIsWinner){
               player = (String)oneFourSeven.get(0);
           }
       }
       if(!thereIsWinner){
           thereIsWinner = oneFiveNine.stream().allMatch(oneFiveNine.get(0)::equals);
           if(thereIsWinner){
               player = (String)oneFiveNine.get(0);
           }
       }
       if(!thereIsWinner){
           thereIsWinner = twoFiveEight.stream().allMatch(twoFiveEight.get(0)::equals);
           if(thereIsWinner){
               player = (String)twoFiveEight.get(0);
           }
       }
       if(!thereIsWinner){
           thereIsWinner = threeSixNine.stream().allMatch(threeSixNine.get(0)::equals);
           if(thereIsWinner){
               player = (String)threeSixNine.get(0);
           }
       }
       if(!thereIsWinner){
           thereIsWinner = threeFiveSeven.stream().allMatch(threeFiveSeven.get(0)::equals);
           if(thereIsWinner){
               player = (String)threeFiveSeven.get(0);
           }
       }
       if(!thereIsWinner){
           thereIsWinner = fourFiveSix.stream().allMatch(fourFiveSix.get(0)::equals);
           if(thereIsWinner){
               player = (String)fourFiveSix.get(0);
           }
       }
       if(!thereIsWinner){
           thereIsWinner = sevenEightNine.stream().allMatch(fourFiveSix.get(0)::equals);
           if(thereIsWinner){
               player = (String)fourFiveSix.get(0);
           }
       }
       toReturn[0] = thereIsWinner;
       toReturn[1] = player;
       return toReturn;
   }

   public void replace(int elem,String player){
       if(oneTwoThree.contains(elem)){
        System.out.println("oneTwoThree  contains "+ elem);
        this.oneTwoThree.set(oneTwoThree.indexOf(elem), player.toUpperCase());
       }
       
       if(oneFourSeven.contains(elem)){
           System.out.println("oneFourSeven contains "+elem);
       this.oneFourSeven.set(oneFourSeven.indexOf(elem), player.toUpperCase());
       }
       
       if(oneFiveNine.contains(elem)){
           System.out.println("oneFiveNine contains "+elem);
       this.oneFiveNine.set(oneFiveNine.indexOf(elem), player.toUpperCase());
       }
       
       if(twoFiveEight.contains(elem)){
           System.out.println("twoFiveEight contains "+elem);
       this.twoFiveEight.set(twoFiveEight.indexOf(elem), player.toUpperCase());
       }
       
       if(threeSixNine.contains(elem)){
           System.out.println("It contains 1");
        this.threeSixNine.set(threeSixNine.indexOf(elem), player.toUpperCase());
       }
       
      if(threeFiveSeven.contains(elem)){
          System.out.println("threeFiveSeven contains "+elem);
       this.threeFiveSeven.set(threeFiveSeven.indexOf(elem), player.toUpperCase());
      }
      
      if(fourFiveSix.contains(elem)){
        System.out.println("fourFiveSix contains "+elem);
       this.fourFiveSix.set(fourFiveSix.indexOf(elem), player.toUpperCase());
      }
      
      if(sevenEightNine.contains(elem)){
          System.out.println("sevenEightNine contains "+elem);
        this.sevenEightNine.set(sevenEightNine.indexOf(elem), player.toUpperCase());
      }
   }
}
