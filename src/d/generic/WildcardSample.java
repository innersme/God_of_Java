package d.generic;

public class WildcardSample {

    public static void main(String[] args){
        WildcardSample sample = new WildcardSample();
    }

    public void callWildcardMethod(){
        WildcardGeneric<String> wildcard = new WildcardGeneric<String>();
        wildcard.setWildcard("A");
        wildcardMethod(wildcard);
    }

    public void wildcardMethod(WildcardGeneric<String> c){
        String value = c.getWildcard();
        System.out.println(value);
    }

    public void callBoundedWildcardMethod(){
        WildcardGeneric<Car> wildcard = new WildcardGeneric<Car>();
        wildcard.setWildcard(new Car("BMW"));

    }
}
