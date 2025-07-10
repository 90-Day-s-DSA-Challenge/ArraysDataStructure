package org.example;

//1832. Check if the Sentence Is Pangram
//https://leetcode.com/problems/check-if-the-sentence-is-pangram/description/

public class CheckIfTheSentenceIsPangram {
    public static void main(String[] args) {
        String sentence = "thequickbrownfoxjumpsoverthelazydog";
        System.out.println(sentence.toCharArray());
        System.out.println(checkIfPangram(sentence));

    }

    public static boolean checkIfPangram(String sentence){
        boolean[] seen = new boolean[26];
        int count = 0;


        for(char c: sentence.toCharArray()){

//            this will find the index by ASCII values
//            index = 'b' - 'a'  // → 98 - 97 = 1
//            [0 to 25] => a(97-97=0), b(98-97=1), c(99-97=2)... so on.

            int index = c - 'a';
            System.out.println(index);

            if(!seen[index]){
                seen[index] = true;
                count++;
            }
        }
        return count == 26;

    }
}
