package Exception;


public class TryCatch {
    public static void main(String[] args) {
        int number = 10;
        int result;

        for (int i = 10; i >= 0; i--) {
            try {
                result = number / i;
                System.out.println(result);
            } catch (Exception e) {
                System.out.println("Exception occured: " + e.getMessage());
            } finally {
                System.out.println("this line is always printed because it is in finally.");
            }
        }
    }
}

