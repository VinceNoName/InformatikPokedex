package pokedexSystem;
public class Sorter {
    
    private Pokemon[] SortedList;
    private int j;
    private int k;
    private boolean jb;
    private boolean kb;
    private Pokemon[] TempList;
    private Pokemon[] TempList2;

    public Sorter(){
        SortedList = new Pokemon[150];
        TempList = new Pokemon[150];
        TempList2 = new Pokemon[150];
        j = 0;
        k = 0;
        jb = false;
        kb = false;
    }

    public Pokemon[] quicksort(POKEDEX dex, int st) {
        return sort(dex, 0, 150, st);
    }
    public Pokemon[] sort(POKEDEX dex, int start, int end, int stat) {
        Pokemon compare = dex.findPokemon((end-start)/2);
        int compareStat = compare.giveStat(stat);
        SortedList[j] = compare;
        for(int i=0;i<(end-start);i++) {
            if(i != (end-start)/2) {    
                if(dex.findPokemon(i).giveStat(stat) < compareStat) {
                    TempList[j] = dex.findPokemon(i);
                    j+=1;
                    TempList[j] = compare;
                }
                else{
                    TempList2[k] = dex.findPokemon(i);
                    k+=1;
                }
            }    
        }
        System.arraycopy(TempList2, 0, TempList, (j+1), TempList2.length);
        System.arraycopy(TempList, 0, SortedList, start, TempList.length);
        java.util.Arrays.fill(TempList, null);
        k = 0;
        j = 0;
        if(((end-start)/2)-start > 1) {
            jb = false;
            sort(dex, start, (end-start)/2-1, stat);
        } else {jb = true;}
        
        if(end-((end-start)/2) > 1) {
            kb = false;
            sort(dex, (end-start)/2+1, end, stat);
        } else {kb = true;}

        return SortedList;
    }
}