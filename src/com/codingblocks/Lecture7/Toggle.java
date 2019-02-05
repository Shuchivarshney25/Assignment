package com.codingblocks.Lecture7;

public class Toggle {
    public static void main(String[] args) {
        String s="shuchi";
        System.out.println(tooglefun(s));
    }
    public static  String tooglefun(String str){
        StringBuilder builder= new StringBuilder();
        for (int i = 0; i <str.length() ; i++) {
            char ch= str.charAt(i);
            if(ch>='a' && ch<='z'){
                ch=(char)(ch-'a'+'A');
            }else if(ch>='A' && ch<='Z'){
                ch=(char)(ch-'A'+'a');

            }
            builder.append(ch);
        }
        return builder.toString();
    }
}
