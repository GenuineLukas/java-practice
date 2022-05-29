package pkg;

// access modifier : 접근 제어자
/*
 * The access modifier is used in front of the member variable/method.
 * private: accessible only in the same "class."
 * default (nothing): accessible in the same "package."
 * protected: accessible in "the same package" and in "the child class in another package."
 * public: There is no limitation in accessibility.
 * (narrow)********************************(wide)
 *  private --> default --> protected --> public
 */

public class ModifierTest {
    private void messageInside() {
        System.out.println("This is private modifier");
    }

    public void messageOutside() {
        System.out.println("This is public modifier");
        messageInside();
    }

    protected void messageProtected() {
        System.out.println("This is protected modifier");
    }
}