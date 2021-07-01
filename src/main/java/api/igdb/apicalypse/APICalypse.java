package api.igdb.apicalypse;

public class APICalypse {
    private String query = "";

    public APICalypse setSort(String field, Sort order){
        String _sort = "s " + field + " " + order.getName() + ";";
        query += _sort;
        return this;
    }

    public APICalypse setFields(String fields){
        String _fields = "f " + fields + ";";
        query += _fields;
        return this;
    }
    public APICalypse setExclude(String fields){
        String _exclude = "x " + fields + ";";
        query += _exclude;
        return this;
    }
    public APICalypse setLimit(int limit){
        String _limit = "l " + limit + ";";
        query += _limit;
        return this;
    }
    public APICalypse setOffset(int offset){
        String _offset = "o " + offset + ";";
        query += _offset;
        return this;
    }
    public APICalypse setSearch(String search){
        String _search = "search \"" + search + "\";";
        query += _search;
        return this;
    }
    public APICalypse setWhere(String where){
        String _where = "";
        if (where.contains("where ") || where.contains("w ")) {
            _where = where;
        } else {
            if (where.contains(";"))
                _where = "w " + where;
            else
                _where = "w " + where + ";";
        }
        query += _where;
        return this;
    }
    public String buildQuery(){
        return this.query;
    }
}
