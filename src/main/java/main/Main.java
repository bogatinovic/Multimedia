package main;

import media.Television;
import media.Radio;

public class Main {

    public static void main(String[] args) {
        
        Television lg = new Television();
        lg.setTurnOn(true);
        lg.setCurrentProgram(4);
        lg.setVolume(50);
        
        System.out.println("Trenutni program je: " + lg.getCurrentProgram());
        
        Radio myRadio = new Radio();
        
           myRadio.setAmFrequency(444);
           myRadio.setBand('B');
           myRadio.setFmFrequency(88);
          
           myRadio.info();
           
        Radio newRadio = new Radio(88.8, 444, 'L');
        newRadio.printAttributes();
               
    }
    
}
