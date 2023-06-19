package pokedexSystem;

import java.io.*;

public class saving {
    public static POKEDEX Dex;
    public static Pokemon POk;
    public static NODE node;


    public static void main(String[] args) {
        Dex = new POKEDEX(null);
        read();
    }
   
     public void save (int c){
        String fileName = "Databank.txt";
        for (int i = 0;i<Dex.countPok();i++){
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
                 writer.write(" "); // need to add the pokemon data
             } catch (IOException e) {
                 System.err.println("Error writing to file: " + e.getMessage());
             }
         }
     }

    public static void read (){
        String fileName = "DATABANK.txt";
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String Line;
            for  (int i = 0; (Line = reader.readLine()) != null;i++) {
                String name = givename(Line );
                int HP = giveHP(Line);
                int attack = giveattack(Line);
                int defense = givedefense(Line);
                int sattack = givesattack(Line);
                int sdefense = givesdfense (Line);
                int speed = givespeed(Line);
                int Type1 = giveType1(Line);
                int Type2 = giveType2(Line);
                boolean SecondType = true;
                if (Type1 == Type2){
                    SecondType = false;
                }
                //System.out.println(name+" "+HP+" "+attack+" "+defense+ " "+ sattack+ " "+ sdefense+ " "+speed);
                Dex.AddPokemon(i, name, HP, attack, defense, sattack, sdefense, speed, Type1, Type2, SecondType);
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }
    private static String givename(String Line){
        for (int i = 0;i<Line.length();i++){
            if (Line.charAt(i) == ','){
                return (Line.substring(0,i));
            }
            
        }
        return null;
    }

    private static int giveHP(String Line){
        int hp = 0;
        for (int i = 13; i<Line.length();i++){
            if (Line.charAt(i) == ','){
                hp = StoI(Line.substring(14, i));
                break;
            }
           
        }
        return hp;
    }

    private static int giveattack (String Line){
        int attack = 0;
        int j = 0;
        for (int i = 13; i<Line.length();i++){
            if (Line.charAt(i) == ',' && j == 0){
               j = i+2;
            }
            else if (Line.charAt(i) == ',' ){
                attack = StoI(Line.substring(j, i));
                break;
            }
        }
        return attack;
    }

    private static int givedefense (String Line){
        int defense = 0;
        int j = 0;
        int count = 0;
        for (int i = 13; i<Line.length();i++){
            if (Line.charAt(i) == ',' && count != 2){
               j = i+2;
               count++;
            }
            else if (Line.charAt(i) == ',' && count == 2){
                defense = StoI(Line.substring(j, i));
                break;
            }
        }
        return defense;
    }

    private static int givesattack (String Line){
        int sattack = 0;
        int j = 0;
        int count = 0;
        for (int i = 13; i<Line.length();i++){
            if (Line.charAt(i) == ',' && count != 3){
               j = i+2;
               count++;
            }
            else if (Line.charAt(i) == ',' && count == 3){
                sattack = StoI(Line.substring(j, i));
                break;
            }
        }
        return sattack;
    }

    private static int givesdfense (String Line){
        int sdefsense = 0;
        int j = 0;
        int count = 0;
        for (int i = 13; i<Line.length();i++){
            if (Line.charAt(i) == ',' && count != 4){
               j = i+2;
               count++;
            }
            else if (Line.charAt(i) == ',' && count == 4){
                sdefsense = StoI(Line.substring(j, i));
                break;
            }
        }
        return sdefsense;
    }

    private static int givespeed (String Line){
        int speed = 0;
        int j = 0;
        int count = 0;
        for (int i = 13; i<Line.length();i++){
            if (Line.charAt(i) == ',' && count != 5){
               j = i+2;
               count++;
            }
            else if (Line.charAt(i) == ',' && count == 5){
                speed = StoI(Line.substring(j, i));
                break;
            }
        }
        return speed;
    }

    private static int StoI (String x){
        return Integer.parseInt(x);
    }

    private static int giveType1 (String Line){
        int sattack = 0;
        int j = 0;
        int count = 0;
        for (int i = 13; i<Line.length();i++){
            if (Line.charAt(i) == ',' && count != 6){
               j = i+2;
               count++;
            }
            else if (Line.charAt(i) == ',' && count == 6){
                sattack = StoI(Line.substring(j, i));
                break;
            }
        }
        return sattack;
    }

    private static int giveType2 (String Line){
        int sattack = 0;
        int j = 0;
        int count = 0;
        for (int i = 13; i<Line.length();i++){
            if (Line.charAt(i) == ',' && count != 7){
               j = i+2;
               count++;
            }
            else if (Line.charAt(i) == ',' && count == 7){
                sattack = StoI(Line.substring(j, i));
                break;
            }
        }
        return sattack;
    }
    
}