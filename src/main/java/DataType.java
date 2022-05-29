import java.sql.SQLOutput;
import java.util.Arrays;

public class DataType {
//From here, primitive type datatypes
    public static void main(String[] args){
        //short	2 bytes	Stores whole numbers from -32,768 to 32,767
        short s = 1;
        //int	4 bytes	Stores whole numbers from -2,147,483,648 to 2,147,483,647
        int i = 3;
        //long	8 bytes	Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
        long lo = 4;

        float f = 5.5F;

        double d = 5.5;

        System.out.println(Short.MAX_VALUE);
        System.out.println(Short.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Long.MIN_VALUE);
        System.out.println(Float.MIN_VALUE);
        System.out.println(Double.MIN_VALUE);

    //from here, it's character.

        char a = 'A';

        boolean b = false;
        //아스키 코드에서 d 가 100 이기 떄문에 출력시에 100 이 나옴.
        //https://www.ascii-code.com/
        byte data = 'd';
        System.out.println(data);

//From here, reference type = every type that are not primitive.
//when we use a data type that is defined by a class, we are using a reference type

        String sparta = "hello sparta!";
        //making a array with 5 elements initialized
        int[] intArray = new int[] {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(intArray));
        //indexing
        System.out.println(intArray[0]);
        //a new integer array with 5 spaces
        int[] emptyArray = new int[5];
        System.out.println(Arrays.toString(emptyArray));
        //when an empty array return, it returns the default values.
        // string --> null || int --> 0
        String[] stringEmptyArray = new String[4];
        System.out.println(Arrays.toString(stringEmptyArray));
        //when not using Arrays.toString
        System.out.println(stringEmptyArray);

        String[] season = {"Spring", "Summer", "Fall", "Winter"};
        System.out.println(Arrays.toString(season));
        //printing out the last index
        // last index = array[array.length - 1]
        System.out.println(season[season.length - 1]);

        //how to shift a line when printing
        //by putting "\n" in between (balckslash n, not forslash)
        System.out.println(s + "\n" + f);

        //Quiz 1
        /*
        public class Main {
            public static void main(String[] args) {
		        char c = 's';
		        int num = 10;
                System.out.println(c);
                System.out.println(num);
            }
         }


         public class Main {
            public static void main(String[] args) {
		        // write your code here
		        int[] intArray = new int[] {10, 20, 30};
		        lastElement = intArray[intArray.length - 1];
		        System.out.println(lastElement);
                }
            }
         */
    }
}
