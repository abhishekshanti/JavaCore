package StaticKeyword;

public class StaticVariable {

    static int num=17;

    StaticVariable(){
        num++;
    }

    public void print(){
        System.out.println("print num: "+ num);
    }

}
