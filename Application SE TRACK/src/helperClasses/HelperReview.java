package helperClasses;

public class HelperReview {

    public HelperReview(){

    }

    public boolean isValidInteger(int test)
    {
        return (test >= 0);
    }

    public static boolean isValidInteger1(int test, int low,
                                         int high) {
        return (test >= low && test <= high);
    }

}
