public class ReferenceTypes {
    public static void main(String[] args){
        System.out.println("Creating block1");
        StaticBlock block1 = new StaticBlock();
        System.out.println("Created block1");
        System.out.println("Creating block2");
        StaticBlock block2 = new StaticBlock();
        System.out.println("Created block2");
    }

    public void makeStaticBlockObject(){
        System.out.println("Creating block1");
        StaticBlock block1 = new StaticBlock();
        System.out.println("Created block1");
        System.out.println("Creating block2");
        StaticBlock block2 = new StaticBlock();
        System.out.println("Created block2");
    }

    public void callPassByValue(){
        int a = 10;
        String b = "b";
    }
}
