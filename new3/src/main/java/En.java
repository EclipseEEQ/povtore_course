public class En {
    public String[] col = new String[3];
    public En(){
        col[0] = "blu";
        col[1] = "red";
        col[2] = "green";
    }
    public boolean setCol(String col){
        return (col == this.col[0])||(col == this.col[1])||(col == this.col[2]);
    }

}
