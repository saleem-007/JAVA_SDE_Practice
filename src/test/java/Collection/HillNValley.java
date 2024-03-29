package Collection;

import java.io.*;


public class HillNValley {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int steps = Integer.parseInt(bufferedReader.readLine().trim());

        String path = bufferedReader.readLine();

        int result = HillNValley.countingValleys(steps, path);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }

        /*
         * Complete the 'countingValleys' function below.
         *
         * The function is expected to return an INTEGER.
         * The function accepts following parameters:
         *  1. INTEGER steps
         *  2. STRING path
         */

        public static int countingValleys(int steps, String path) {
            // Write your code here
            int sum=0;
            int previous=0;
            int valleyCount=0;
            for (int  i=0; i<path.length();i++)
            {
                sum+=path.charAt(i)=='U'?1:-1;
                if(previous==-1&&sum==0)
                {
                    valleyCount++;
                }
                previous=sum;
            }
            return valleyCount;
        }

    }
