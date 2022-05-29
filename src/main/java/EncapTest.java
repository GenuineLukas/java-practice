import pkg.ModifierTest;

import java.lang.reflect.Modifier;

class Child extends ModifierTest {
    void callProtectedParent() {
        System.out.println("call my parent's protected method");
        super.messageProtected();
    }
}

public class EncapTest {
    public static void main(String[] args) {
        ModifierTest modifierTest = new ModifierTest();
        // messageOutside is a "public" method defined
        // in the ModifierTest class in another package.
        modifierTest.messageOutside();
        // messageInside is a "private" method defined
        // in the ModifierTest class in another package.
        // Similarly, messageProtected is a protected
        // method.
//      modifierTest.messageInside(); // error occurred.
//      modifierTest.messageProtected(); // error occurred.

        // protected method is accessible in this case.
        // Because the Child class is the subclass of the imported class.
        Child child = new Child();
        child.callProtectedParent();
        /*
        Output:
        call my parent's protected method
        This is protected modifier
         */
    }
}
