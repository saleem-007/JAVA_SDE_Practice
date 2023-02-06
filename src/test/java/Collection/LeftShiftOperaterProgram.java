package Collection;

public class LeftShiftOperaterProgram {
    int func (int n)
    {
        int result;
        if (n == 1)
            return 1;
        result = func (n - 1);
        return result;
    }
    public static void main(String[] args) {
//        byte x = 64;
//        int i;
//        byte y;
//        i = x << 2;
//        y = (byte) (x << 2);
//        System.out.print(i + " " + y);
//        //Since byte can have-128 to 127
//        //y has 256 value, so it will give 0 as output.
//        //x will give 256 coz left shift operator 2+2=4, so 64 value will get multiple to 4

        LeftShiftOperaterProgram obj=new LeftShiftOperaterProgram();
        System.out.print(obj.func(5));
    }
}
