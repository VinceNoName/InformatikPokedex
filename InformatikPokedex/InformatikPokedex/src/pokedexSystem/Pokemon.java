package pokedexSystem;
public class Pokemon {
    private int ID;
    private String Name;
    private int[] Stats;
    private boolean SecType;
    private int Type1;
    private int Type2;
    public Pokemon (int i, String n, int hp, int a, int d, int sa, int sd, int s, int t1, int t2, boolean st){
        ID = i;
        Name = n;
        Stats = new int[] {hp, a, d, sa, sd, s}; // HP, Attack, Defense, Special Defense, Speed
        Type1 = t1; //First Type
        Type2 = t2; //Second Type
        SecType = st;   //boolean to check for a second type
    }
    public int giveID(){	
        return ID;
    }

    public String giveName(){
        return Name;
    }
    
    public boolean hasTwoTypes(){
        return SecType;
    }

    public int giveType1(){
        return Type1;
    }
    
    public int giveType2(){
        return Type2;
    }

    public int giveStat(int st){
        return Stats[st];
    }

    public int giveBaseStatTotal(){
            return Stats[0]+Stats[1]+Stats[2]+Stats[3]+Stats[4]+Stats[5];
    }

}