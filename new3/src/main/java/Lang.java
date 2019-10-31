public class Lang {
    public En en;
    public Ru ru;
    public Uk uk;
    public Lang(){
        en = new En();
        ru = new Ru();
        uk = new Uk();
    }
    public String getLeng(String col){
        String l = "";
        if (en.setCol(col)){
            l = "En";
        }else if(ru.setCol(col)){
            l = "Ru";
        }else if(uk.setCol(col)){
            l = "Uk";
        }

        return l;
    }
}
