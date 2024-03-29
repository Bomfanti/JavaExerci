

/*
Write a function that takes in a string of one or more words, and returns the same string,
but with all five or more letter words reversed (like the name of this kata).

Strings passed in will consist of only letters and spaces.
Spaces will be included only when more than one word is present.
Examples:

spinWords("Hey fellow warriors") => "Hey wollef sroirraw"
spinWords("This is a test") => "This is a test"
spinWords("This is another test") => "This is rehtona test"
 */

public class SpinWords {
        public static String spinWords(String sentence) {
            String[] arr = sentence.split(" ");
            for(int i=0;i<arr.length;i++){
                if(arr[i].length() >= 5)
                    arr[i] = new StringBuffer(arr[i]).reverse().toString();
            }
            return String.join(" ",arr);
        }
        public static void main(String[] Args){
            System.out.println("Args = " + spinWords("hellow Fello Warriors"));
        }
    }
