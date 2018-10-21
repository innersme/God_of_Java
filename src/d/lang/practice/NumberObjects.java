package d.lang.practice;

public class NumberObjects {
    public static void main(String[] args){
        NumberObjects sample = new NumberObjects();
        System.out.println(sample.parseLong("r1024"));
        sample.printOtherBase(1024);
    }

    public long parseLong(String data){
        long returnValue = 0;
        try{
            returnValue = Long.parseLong(data);
        } catch (NumberFormatException e){
            System.out.println(data + " is not a number.");
            returnValue = -1;
        }
        return returnValue;
    }

    public void printOtherBase(long value){
        String Binary = Long.toBinaryString(value);
        String Hex = Long.toHexString(value);
        String Octal = Long.toOctalString(value);
        System.out.println("Original:"+value);
        System.out.println("Binary  :"+Binary);
        System.out.println("Hex     :"+Hex);
        System.out.println("Octal   :"+Octal);

    }
}
