package d.string.practice;

public class UseStringMethods {
    public static void main(String[] args){
        String str = "The String class represents character strings.";
        UseStringMethods returnStr = new UseStringMethods();
        returnStr.printWords(str);
    }

    public void printWords(String str){
        String[] returnValues = str.split(" ");
        for (String StringValue : returnValues)
            System.out.println(StringValue);

    }
}
