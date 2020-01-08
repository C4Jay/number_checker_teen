public class teennumberchecker {

    public static boolean hasTeen(int x,int y,int z) {
        if ( (x > 12 && x < 20) || (y > 12 && y < 20) || (z > 12 && z < 20)) {
            return true;
        }
        else {
            return false;
        }
    }


    public static boolean isTeen(int x) {
        if ( x > 12 && x < 20) {
            return true;
        }
        else {
            return false;
        }
    }
}
