package pokedexSystem;

public class POKEDEX {
    private Sorter sort;
    private NODE first;
    private int count;
    private String [] Type = {"Normal", "Fire", "Water", "Grass", "Electric", "Ice", "Fighting", "Poison", "Ground", "Flying", "Psychic", "Bug", "Rock", "Ghost", "Dragon", "Dark", "Seel", "Fairy"};
    private int [] [] TypeChart = {{2,2,2,2,2,2,2,2,2,2,2,2,1,0,2,2,1,2},  //Normal
                                  {2,1,1,2,4,4,2,2,2,2,2,4,1,2,1,2,4,2},  //Fire
                                  {2,4,1,2,1,2,2,2,4,2,2,2,4,2,1,2,2,2},  //Water
                                  {2,2,4,1,1,2,2,2,0,4,2,2,2,2,1,2,2,2},  //Electric
                                  {2,1,4,2,1,2,2,1,4,1,2,1,4,2,1,2,1,2},  //Grass
                                  {2,1,1,2,4,1,2,2,4,4,2,2,2,2,4,2,1,2},  //Ice
                                  {4,2,2,2,2,4,2,1,2,1,1,1,4,0,2,1,4,2},  //Fight
                                  {2,2,2,2,4,2,2,1,1,2,2,2,1,1,2,2,0,4},  //Poison
                                  {2,1,2,2,4,2,1,1,2,1,4,2,2,1,2,4,1,1},  //Ground
                                  {2,2,2,1,4,2,4,2,2,2,2,4,1,2,2,2,1,2},  //Flying
                                  {2,2,2,2,2,2,4,4,2,2,1,2,2,2,2,0,1,2},  //Psychic
                                  {2,1,2,2,4,2,1,1,2,1,4,2,2,1,2,4,1,1},  //Bug
                                  {2,4,2,2,2,4,1,2,1,4,2,4,2,2,2,2,1,2},  //Rock
                                  {0,2,2,2,2,2,2,2,2,2,4,2,2,4,2,1,2,2},  //Ghost
                                  {2,2,2,2,2,2,2,2,2,2,2,2,2,2,4,2,1,0},  //Dragon
                                  {2,1,1,1,2,4,2,2,2,2,2,2,4,2,2,2,1,4},  //Steel
                                  {2,1,2,2,2,2,4,1,2,2,2,2,2,2,4,4,1,2}};   //Fairy
                                  
    public POKEDEX(NODE n){
        first = n;
        count = 1;
        sort = new Sorter();
    }
                                  
    public void AddPokemon (int i, String n, int hp, int a, int d, int sa, int sd, int s, int t1, int t2, boolean st) { 
        first.AddPokemon (i, n, hp, a, d, sa, sd, s, t1, t2, st);
        count++;
    }
    
        
    public String giveTypeName(int t){
        return Type[t];
    }

    public int countPok (){
        return count;
    }

    public Pokemon findPokemon(int id){
        return first.findPoke(id);
    }

	public int [] [] getTypeChart() {
		return TypeChart;
	}

	public Sorter getSort() {
		return sort;
	}
}