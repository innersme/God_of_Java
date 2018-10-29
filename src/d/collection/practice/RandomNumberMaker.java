package d.collection.practice;
import java.util.HashSet;
import java.util.Random;

public class RandomNumberMaker {
    public static void main(String[] args){
        RandomNumberMaker maker = new RandomNumberMaker();
        HashSet<Integer> sample = new HashSet<Integer>();
        for (int i = 0 ; i < 10 ; i++) {
            sample = maker.getSixNumber();
            System.out.println(sample);
        }

    }

    public HashSet<Integer> getSixNumber(){
        HashSet<Integer> hashset = new HashSet<Integer>();
        while( true ){
            if ( hashset.size() == 6 ) break;
            else {
                Random random = new Random();
                int tempNumber = random.nextInt(45);
                hashset.add(tempNumber);
            }
        }
        return hashset;
    }

}
