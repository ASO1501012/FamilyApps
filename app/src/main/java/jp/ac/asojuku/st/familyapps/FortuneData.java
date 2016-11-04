package jp.ac.asojuku.st.familyapps;

/**
 * Created by Garudo24 on 2016/11/02.
 */
public class FortuneData {

    private String number;
    private int addition;
    private String comment;
    //Constructor
    public FortuneData(String number,int addition,String comment){
        this.number = number;
        this.addition = addition;
        this.comment = comment;
    }

    public String getNumber(){
        return number;
    }

    public int getAddition(){
        return addition;
    }

    public String getComment(){
        return comment;
    }
}
