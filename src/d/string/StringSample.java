package d.string;

public class StringSample {
    public static void main(String[] args){
        StringSample sample = new StringSample();
        // sample.constructors();
        // System.out.println(sample.nullCheck(null));
        // sample.compareCheck();
        // sample.equalCheck();
        // sample.compareToCheck();
        // sample.addressCheck();
        // sample.matchCheck();
        // sample.indexOfCheck();
        // sample.lastIndexofCheck();
        // sample.substringCheck1();
        // sample.splitCheck();
        // sample.trimCheck();
        // sample.replaceCheck();
        sample.formatCheck();
    }
    public void constructors(){
        try {
            String str = "한글";

            byte[] array1 = str.getBytes();
            printByteArray(array1);
            String str1 = new String(array1);
            System.out.println(str1);

            byte[] array2 = str.getBytes();
            printByteArray(array2);
            String str2 = new String(array2, "UTF-8");
            System.out.println(str2);

            byte[] array3 = str.getBytes("UTF-16");
            printByteArray(array3);
            String str3 = new String(array3, "UTF-16");
            System.out.println(str3);
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public void printByteArray(byte[] array){
        for (byte data:array){
            System.out.print(data + " ");
        }
        System.out.println();
    }

    public boolean nullCheck(String text){
//        int textLength = text.length();
//        System.out.println(textLength);
        if (text == null) return true;
        else return false;
    }

    public void compareCheck(){
        String text = "클래스 길이 확인";
        System.out.println("text.length()="+text.length());
        System.out.println("text.isEmpty()="+text.isEmpty());
    }

    public void equalCheck(){
        String text = "Check value";
        // String text2 = "Check value";
        String text2 = new String("Check value");
        if (text == text2){
            System.out.println("text==text2 result is same.");
        } else {
          System.out.println("text==text2 result is different.");
        }
        if (text.equals("Check value")){
            System.out.println("text.equals(text2) result is same.");
        }

        String text3 = "check value";
        if (text.equalsIgnoreCase(text3)){
            System.out.println("text.equalsIgnoreCase(text3) result is same.");
        }
    }

    public void compareToCheck(){
        String text = "a";
        String text2 = "b";
        String text3 = "c";
        System.out.println(text2.compareTo(text));
        System.out.println(text2.compareTo(text3));
        System.out.println(text.compareTo(text3));
    }

    public void addressCheck(){
        String addresses[] = new String[]{
                "서울시 구로구 신도림동",
                "경기도 성남시 분당구 정자동",
                "서울시 구로구 개봉동",
        };
        int startCount = 0, endCount = 0;
        int containCount = 0;
        String startText = "서울시";
        String endText = "동";
        String containText = "구로";
        for (String address:addresses){
            if (address.startsWith(startText)){
                startCount++;
            }
            if (address.endsWith(endText)){
                endCount++;
            }
            if (address.contains(containText)){
                containCount++;
            }
        }
        System.out.println("Starts with "+startText+ " count is " + startCount);
        System.out.println("Ends with "+endText+ " count is " + endCount);
        System.out.println("Contains "+containText+ " count is " + containCount);
    }

    public void matchCheck(){
        String text = "This is a text";
        String compare1 = "is";
        String compare2 = "this";
        System.out.println(text.regionMatches(2, compare1, 0, 1));
        System.out.println(text.regionMatches(5, compare1, 0, 2));
        System.out.println(text.regionMatches(true, 0, compare2, 0, 4));
    }

    public void indexOfCheck(){
        String text =
                "Java technology is both a programming language and a platform.";
        System.out.println(text.indexOf('a'));
        System.out.println(text.indexOf("a "));
        System.out.println(text.indexOf('a', 20));
        System.out.println(text.indexOf("a ", 20));
        System.out.println(text.indexOf('z'));
    }

    public void lastIndexofCheck(){
        String text =
                "Java technology is both a programming language and a platform.";
        System.out.println(text.lastIndexOf('a'));
        System.out.println(text.lastIndexOf("a "));
        System.out.println(text.lastIndexOf('a', 20));
        System.out.println(text.lastIndexOf("a ", 20));
        System.out.println(text.lastIndexOf('z'));
    }

    public void substringCheck1(){
        String text = "Java technology";
        String technology = text.substring(5);
        System.out.println(technology);
        String tech = text.substring(5, 9);
        System.out.println(tech);
    }

    public void splitCheck(){
        String text =
                "Java technology is both a programming language and a platform.";
        String[] splitArray = text.split(" ");
        for (String temp : splitArray){
            System.out.println(temp);
        }
    }

    public void trimCheck(){
        String strings[] = new String[]{
                " a", " b ", "   c", "d   ", "e   f", "   "
        };
        for (String string:strings){
            System.out.println("["+string+"] ");
            System.out.println("Trim["+string.trim()+"] ");
        }
        String text =" a ";
        if (text!= null && text.trim().length() > 0){
            System.out.println("OK");
        }
    }

    public void replaceCheck(){
        String text = "The String class represents character strings.";
        System.out.println(text.replace('s', 'z'));
        System.out.println(text);
        System.out.println(text.replace("tring", "trike"));
        System.out.println(text.replaceAll(" ", "|"));
        System.out.println(text.replaceFirst(" ", "|"));
    }

    public void formatCheck(){
        String text = "제 이름은 %s입니다. 지금까지 %d권의 책을 썼고, "
                + "하루에 %f %%의 시간을 책을 쓰는데 할애하고 있습니다.";
        String realText = String.format(text, "이상민", 4, 10.5);
        System.out.println(realText);
    }
}
