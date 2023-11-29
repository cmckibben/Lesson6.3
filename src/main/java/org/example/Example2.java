package org.example;

public class Example2 {
    public static void main(String[] args) {
        //primitive type int
        int[] intArray = {0,1,2,3,4,5,6};

        for(int number: intArray)
          System.out.print(number + " ");
        System.out.println();

        //primitive type char
        String word = "";
        char[] charArray = {'w', 'o', 'r', 'd'};
        for( char character : charArray)
          word += character;

        System.out.println(word);
  }
}
