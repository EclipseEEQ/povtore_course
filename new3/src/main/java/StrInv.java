import java.lang.reflect.Array;
import java.util.ArrayList;

public class StrInv {
    public String st; //строка, з якою треба провести зміни

    public int p; // kilkist sliv
    public String words2[];

    public StrInv(){

    }

    public void setSt(String st) {
        this.st = st;
    }
    public String getString(){
        String[] words = st.split("\\s");
        words = firstUpperCase(words);
        words2 = new String[words.length];
        int j = 0;
        for (int i = words.length-1; i >= 0; i--) {

            words2[j] = words[i];
            j++;
        }
        p = words.length;
        String sn = "";
        for (int i = 0; i < words2.length; i++) {
            if (i<words.length-1) {
                sn = sn + words2[i] + "_";
            }else {
                sn = sn + words2[i];
            }
        }

        return sn; //nova stroka
    }
    public String[] firstUpperCase(String words[]){
        for (int i = 0; i < words.length; i++) {
           words[i] = words[i].substring(0, 1).toUpperCase() + words[i].substring(1);
        }
        return words;
    }
    public int kGl(String str){

        return str.replaceAll("(?i)[^aeiouyаіеоуи]", "").length();
    }
}
