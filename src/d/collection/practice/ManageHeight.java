package d.collection.practice;

import java.util.ArrayList;

public class ManageHeight {
    private ArrayList<ArrayList<Integer>> gradeHeights;

    public static void main(String[] args){

    }

    public void setData(){
        ArrayList<Integer> class1 = new ArrayList<Integer>();
        class1.add(170);
        class1.add(180);
        class1.add(173);
        class1.add(175);
        class1.add(177);

        ArrayList<Integer> class2 = new ArrayList<Integer>();
        class1.add(160);
        class1.add(165);
        class1.add(167);
        class1.add(186);

        ArrayList<Integer> class3 = new ArrayList<Integer>();
        class1.add(158);
        class1.add(177);
        class1.add(187);
        class1.add(176);

        ArrayList<Integer> class4 = new ArrayList<Integer>();
        class1.add(173);
        class1.add(182);
        class1.add(181);

        ArrayList<Integer> class5 = new ArrayList<Integer>();
        class1.add(170);
        class1.add(180);
        class1.add(165);
        class1.add(177);
        class1.add(172);


        gradeHeights.add(class1);
        gradeHeights.add(class2);
        gradeHeights.add(class3);
        gradeHeights.add(class4);
        gradeHeights.add(class5);
    }

}
