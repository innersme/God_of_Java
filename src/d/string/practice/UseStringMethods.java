package d.string.practice;

import d.string.StringSample;

public class UseStringMethods {
    public static void main(String[] args){
        String str = "The String class represents character strings.";
        UseStringMethods returnStr = new UseStringMethods();
        returnStr.printWords(str);
        returnStr.findString(str, "string");
        returnStr.findAnyCaseString(str, "string");
        returnStr.countChar(str, 's');
        returnStr.printContainWords(str, "ss");
    }

    public void printWords(String str){
        String[] returnValues = str.split(" ");
        for (String StringValue : returnValues)
            System.out.println(StringValue);
    }

    public void findString(String str, String findStr){
        int indexOfStr = str.indexOf(findStr);
        System.out.println(findStr + " is appeared at " + indexOfStr);
    }

    public void findAnyCaseString(String str, String findStr){
        int indexOfStr = str.toLowerCase().indexOf(findStr.toLowerCase());
        System.out.println(findStr + " is appeared at " + indexOfStr);
    }

    public void countChar(String str, char c){
        int count = 0;
//        for (int i = 0; i < str.length(); i++ ){
//            if (str.charAt(i) == c) count++;
//        }
        char[] StringtoCharArray = str.toCharArray();
        for (char newc : StringtoCharArray){
            if (newc == c) {
                count++;
            }
        }
        System.out.println("char '" + c + "' count is "+count);
    }

    public void printContainWords(String str, String findStr){
        String[] stringArr = str.split(" ");
        String returnString = null;
        for (String stringValue : stringArr ){
            if ( stringValue.contains(findStr) == true ) {
                returnString = stringValue;
            }
        }
        System.out.println(returnString + " contains " + findStr);
    }
}
