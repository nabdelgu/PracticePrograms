/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practiceprograms;

/**
 *
 * @author noaha
 */
public class WordMatch2 {

    public static void main(String[] args) {
        String Search = "loop";
        String[] words = {"loop", "pool", "lopo", "book", "kobo", "polo", "Cola"};

        for (int w = 0; w < words.length; w++) {
            String currentWord = words[w];
            int[][] checkArray = createTwoDimArray(Search, currentWord);
            int counter = evalutaeTwoDQArray(checkArray);
            //System.out.println(counter);
            DetermineWordMatch(counter,currentWord);
        }

    }

    private static int[][] createTwoDimArray(String Search, String currentWord) {
        int[][] checkArray = new int[Search.length()][currentWord.length()];
        for (int i = 0; i < Search.length(); i++) {
            for (int j = 0; j < currentWord.length(); j++) {
                if (Search.charAt(i) == currentWord.charAt(j)) {
                    checkArray[i][j] = 1;
                } else {
                    checkArray[i][j] = 0;
                }
            }
        }
        return checkArray;
    }

    private static int evalutaeTwoDQArray(int[][] checkArray) {
        int counter = 0;
        for (int l = 0; l < checkArray.length; l++) {
            boolean hasMatch = false;
            for (int m = 0; m < checkArray.length; m++) {
                // System.out.print(checkArray[l][m] + "\t");
                if ((checkArray[l][m] == 1) && (hasMatch == false)) {
                    counter++;
                    hasMatch = true;
                }

            }
            // System.out.println("\n");

        }
        return counter;
    }
    
    private static void DetermineWordMatch(int counter,String currentWord){
            if (currentWord.length() == counter) {
                System.out.println("Match:" + currentWord);
            } else {
                System.out.println("Not Matched:" + currentWord);
            }
    }

}
