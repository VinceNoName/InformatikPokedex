package pokedexSystem;
public class NODE {
    private NODE next;
    private int Number;
    private Pokemon Poke;
    
    public NODE (NODE nex, Pokemon Pok){
        next = nex;
        Poke = Pok;
        Number = Pok.giveID();
    }

    public void AddPokemon (int i, String n, int hp, int a, int d, int sa, int sd, int s, int t1, int t2, boolean st) { 
        if(Number < i && next.Number > i){
            NODE tempnext = next;
            Pokemon Pke = new Pokemon(i, n, hp, a, d, sa, sd, s, t1, t2, st);
            next = new NODE(tempnext, Pke);
        }
        else {
            next.AddPokemon(i, n, hp, a, d, sa, sd, s, t1, t2, st);
        }
    }

    public Pokemon PokemonGeben() {
        return Poke;
    }

    public NODE giveNext(){
        return next;
    }

    public int giveNr(){
        return Number;
    }

    public Pokemon findPoke(int id){
        if(Number == id) {
            return Poke;
        }
        else {
            return next.findPoke(id);
        }
    }
}