package api.igdb.apicalypse;

public enum Sort{
    ASCENDING("asc"), DESCENDING("desc");

    private final String name;
    private Sort(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
}
