package Strings;

public class Client {
    public static void main(String[] args) {
        String s1=new String("Abhishek");
        System.out.println(s1);

        String s2=new String("Abhishek");
        System.out.println(s2);

        // false means they do not have the same reference
        System.out.println(s1==s2);

        String s3="Abc";
        String s4="Abc";

        //true means that they have the same reference
        System.out.println(s3==s4);

        //we are changing it to char array bcoz string is immutable
        char[] c2 = s2.toCharArray();
        int i=0,j=s2.length()-1;
        while(i<j){
            char temp=c2[i];
            c2[i]=c2[j];
            c2[j]=temp;
            i++;
            j--;
        }

        for(int k=0;k< c2.length;k++){
            System.out.println(c2[k]);
        }


    }
}
