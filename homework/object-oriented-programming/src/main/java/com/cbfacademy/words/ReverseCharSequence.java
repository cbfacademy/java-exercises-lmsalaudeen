package com.cbfacademy.words;

public class ReverseCharSequence implements CharSequence{
    public String string;

    //constructor
    public ReverseCharSequence (String string) {
        this.string = string;
    }

    public static String reverseChar(String string) {
        String wordReverse ="";
        for (int i = string.length()-1; i >=0; i--) {
            wordReverse = wordReverse + string.charAt(i);
        }
        return wordReverse;
    }
        
    @Override
    public int length() {
     // TODO Auto-generated method stub
        return string.length();
    }
    @Override
    public char charAt(int index) {
        String newString = reverseChar(string);
        return newString.charAt(index);
    }
    @Override
    public CharSequence subSequence(int start, int end) {
        String newString = reverseChar(string);
        return newString.substring(start,end);
    }
}
