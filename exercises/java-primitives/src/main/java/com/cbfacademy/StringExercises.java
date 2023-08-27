package com.cbfacademy;

public class StringExercises {
    
    public String fromCharacters(char[] characters) {
        // TODO - Write code that creates a String from the input array of characters
        // String joined = "";
        // for (int i = 0; i < characters.length; i++) {
        //     joined = joined + characters[i];
        // }
        String joined = new String(characters);
        return joined;
        // throw new RuntimeException("Not implemented");
    }

    public Long howMany(String text, Character character) {
        // TODO - Write code to determine how many of the input ${character} are contained in the input ${text}
        // how many character is in text
        // for i in text, if i contains character, counter + 1
        long characterCount = 0L;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == character) {
                characterCount = characterCount + 1;
            }       
        }
        return characterCount;
        //throw new RuntimeException("Not implemented");
    }

    public Boolean isPalindrome(String word) {
        // TODO - Write code to determine whether the input ${word} is a palindrome
        boolean palindrome = false;
        // if (word == word.substring(word.length(), 0)) {
        //     palindrome = true;
        // }
        String wordReverse = "";
        for (int i = word.length()-1; i >=0; i--) {
            wordReverse = wordReverse + word.charAt(i);
        }
        if (wordReverse.contentEquals(word)) {
            palindrome = true;
        }
        return palindrome;
        //throw new RuntimeException("Not implemented");
    }

    public String getName() {
        return "String Exercises";
    }

    // // some tests
    // public String someTests() {
    //     StringExercises palindromeTest = new StringExercises();
    //     Boolean palindrome = palindromeTest.isPalindrome("anna");
    //     System.out.println(String.valueOf(palindrome));
    //     return String.valueOf(palindrome);
    
    // }
    
}

