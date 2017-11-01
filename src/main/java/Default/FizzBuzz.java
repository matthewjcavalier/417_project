package Default;

public class FizzBuzz {
    public static String result(int x) {
        String ret;
        if(x % 3 == 0 && x % 5 == 0)
            ret = "FizzBuzz";
        else if(x % 3 == 0)
            ret ="Fizz";
        else if(x % 5 == 0)
            ret = "Buzz";
        else
            ret = String.valueOf(x);
        return ret;
    }
}
