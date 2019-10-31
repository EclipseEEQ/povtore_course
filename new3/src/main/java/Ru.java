public class Ru {

    public String[] col = new String[3];
    public Ru(){
        col[0] = "синий";
        col[1] = "красный";
        col[2] = "зелёный";
    }
    public boolean setCol(String col){
        return (col == this.col[0])||(col == this.col[1])||(col == this.col[2]);
    }
}
