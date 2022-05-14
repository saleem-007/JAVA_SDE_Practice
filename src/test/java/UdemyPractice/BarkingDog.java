package UdemyPractice;

public class BarkingDog {
    public static void main(String[] args) {
        boolean result=shouldWakeUp(true,2);
        System.out.println(result);
    }
    public static boolean shouldWakeUp(boolean currentlyBarking, int hourOfDay)
    {
       /* if (hourOfDay<8||hourOfDay>22||hourOfDay>0||hourOfDay<24)
        {
            if (currentlyBarking==true)
            {
                return true;
            }else
            {
                return false;
            }
        }
        else  if (hourOfDay<0||hourOfDay>24){
            return false;
        }

        return */
        if(hourOfDay<0 || hourOfDay>23)return false;
        if(currentlyBarking && (hourOfDay<8 || hourOfDay>22)) return true;
        return false;
    }
}
