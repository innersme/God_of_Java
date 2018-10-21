package d.string.practice;

public class UseStringMethods {
    public static void main(String[] args){
        String str = "The String class represents character strings.";
        UseStringMethods returnStr = new UseStringMethods();
        returnStr.printWords(str);
        returnStr.findString(str, "string");
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
}
