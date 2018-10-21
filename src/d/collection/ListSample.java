package d.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class ListSample {

    public static void main(String[] args){
        ListSample sample = new ListSample();
        sample.checkStack();
    }

    public void checkArrayList1(){
        ArrayList<String> list1 = new ArrayList<String>();
        list1.add("ArrayListSample");
    }

    public void checkArrayList2(){
        ArrayList<String> list = new ArrayList<String>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        list.add(1, "A1");

//        for (String tempData : list){
//            System.out.println(tempData);
//        }

        ArrayList<String> list2 = list;
        list.add("0 ");
        for(String tempData : list2){
            System.out.println("List2 "+tempData);
        }
    }

    public void checkArrayList3(){
        ArrayList<String> list = new ArrayList<String>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");

        String[] tempArray = new String[7];
        String[] strList = list.toArray(tempArray);
        for (String temp:strList){
            System.out.println(temp);
        }
    }

    public void checkArrayList4(){
        ArrayList<String> list = new ArrayList<String>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        list.add("A");

        System.out.println("Removed "+list.remove(0));
        System.out.println(list.remove("A"));
        ArrayList<String> temp = new ArrayList<String>();
        temp.add("A");
        list.removeAll(temp);
        for (int loop = 0; loop < list.size(); loop++){
            System.out.println("list.get("+loop+")="+list.get(loop));
        }
    }

    public void checkStack(){
        Stack<Integer> intStack = new Stack<Integer>();
        for (int loop = 0 ; loop < 5; loop++){
            intStack.push(loop);
            System.out.println(intStack.peek());
        }
        while (!intStack.empty()){
            System.out.println(intStack.pop());
        }
    }
}
