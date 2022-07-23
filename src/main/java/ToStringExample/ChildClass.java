package ToStringExample;

public class ChildClass extends ParentClass {

    public ChildClass(int classNum, String name, int testScore) {
        super(classNum, name, testScore);
    }

    static ChildClass child = new ChildClass(12, "Jason", 100);

    public static void main(String[] args) {
        // the println below returns.. ToStringExample.ChildClass@251a69d7 when toString() is not defined.
        // the println below returns.. class number: 12 name: Jason testScore: 100 after overriding toString() in the parent class.
        System.out.println(child);
    }

}
