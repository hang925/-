package test;

public class Rating {
    public static int rating(int num){

        if(num > 2000)
            return 1;
        else if(num > 1300)
            return 2;
        else if (num > 800)
            return 3;
        else if (num > 500)
            return  4;
        else if (num > 200)
            return 5;
        else if (num > 50)
            return 6;
        else
            return 7;
    }
}
