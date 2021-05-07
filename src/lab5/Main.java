/*
sort text ascending number of vowels

test example:
Hello, world! Sort me, please! I really want it!
 */
package lab5;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String text = "Hello, world. Sort me, please... I really want it!";
        Text inputText = new Text(text);
        System.out.println(Arrays.toString(inputText.sortText()));
    }
}
