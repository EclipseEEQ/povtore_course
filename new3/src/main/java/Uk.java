public class Uk {
    public String[] col = new String[3];
    public Uk(){
        col[0] = "блакитний";
        col[1] = "червоний";
        col[2] = "зелений";
    }
    public boolean setCol(String col){
        return (col == this.col[0])||(col == this.col[1])||(col == this.col[2]);
    }
}
