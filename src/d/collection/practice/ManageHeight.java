package d.collection.practice;

import java.util.ArrayList;

public class ManageHeight {
    private ArrayList<ArrayList<Integer>> gradeHeights;

    public static void main(String[] args){
        ManageHeight manageHeight = new ManageHeight();
        manageHeight.setData();
        for (int i = 1; i <= 5; i++){
            //manageHeight.printHeight(i);
            manageHeight.printAverage(i);
        }

    }

    public void setData(){
        gradeHeights = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> class1 = new ArrayList<Integer>();
        class1.add(170);
        class1.add(180);
        class1.add(173);
        class1.add(175);
        class1.add(177);

        ArrayList<Integer> class2 = new ArrayList<Integer>();
        class2.add(160);
        class2.add(165);
        class2.add(167);
        class2.add(186);

        ArrayList<Integer> class3 = new ArrayList<Integer>();
        class3.add(158);
        class3.add(177);
        class3.add(187);
        class3.add(176);

        ArrayList<Integer> class4 = new ArrayList<Integer>();
        class4.add(173);
        class4.add(182);
        class4.add(181);

        ArrayList<Integer> class5 = new ArrayList<Integer>();
        class5.add(170);
        class5.add(180);
        class5.add(165);
        class5.add(177);
        class5.add(172);


        gradeHeights.add(class1);
        gradeHeights.add(class2);
        gradeHeights.add(class3);
        gradeHeights.add(class4);
        gradeHeights.add(class5);
    }

    public void printHeight(int classNo){
        ArrayList<Integer> templist = new ArrayList<Integer>(gradeHeights.get(classNo-1));
        System.out.println("Class No.:" + (classNo));
        for (int temp : templist){
            System.out.println(temp);
        }
    }

    public void printAverage(int classNo){
        double sum = 0.0;
        ArrayList<Integer> templist = new ArrayList<Integer>(gradeHeights.get(classNo-1));
        for (int temp : templist){
            sum += (double)temp;
        }
        System.out.println("Class No.:" + (classNo));
        System.out.println("Height average:"+sum/gradeHeights.get(classNo-1).size());
    }
}
