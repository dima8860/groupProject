package Switch;

public class Was {
    public static void main(String[] args) {
        int a = 10;
        int b = 10;
        System.out.print( a % b );
    }
    public int caughtSpeeding(int speed, boolean isBirthday) {
        if (isBirthday)  {
            if (speed <=65) {
                return 0;
            }
            else if (speed >= 66 && speed <= 85) {
                return 1;
            }
            else if (speed >= 86) {
                return 2;
            }
        }
        else if (!isBirthday) {
            if (speed <=60) {
                return 0;
            }
            else if (speed >= 61 && speed <= 80) {
                return 1;
            }
            else if (speed >= 81) {
                return 2;
            }

        }
        else {
            return 0;
        }
        return speed;
    }

}
