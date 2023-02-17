package StringPrograms.InterviewPrograms;

import org.seleniumhq.jetty9.util.log.Slf4jLog;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ReturnMaximumOccuringCharacterFromString {
    public static void main(String[] args) {
        String str = "Javaaaaavvvvvvs";
        String[] c = str.split("");
        ArrayList<String> arr = new ArrayList<>();
        HashMap<String, Integer> hc = new HashMap<>();
        for (String character : c) {
            if (arr.contains(character)) {
                int count = hc.get(character);
                hc.put(character, count + 1);
            } else {
                arr.add(character);
                hc.put(character, 1);
            }
        }
        System.out.println(hc);
        System.out.println(hc.values());
        ;
//        ArrayList<Integer> am=new ArrayList<>(hc.values());
//        System.out.println(am);
        int largest = 0;
//        for(int i=0;i<am.size();i++)
//        {
//            if(am.get(i)>largest)
//            {
//                largest=am.get(i);
//            }
//        }
        System.out.println(hc.entrySet().size());
        Map.Entry<String, Integer> entry = (Map.Entry<String, Integer>) hc.entrySet();
        for (int i=0;i<entry.toString().length();i++) {

            // if give value is equal to value from entry
            // print the corresponding key
            if (entry.getValue() > largest) {
                largest = entry.getValue();
            }
        }
        System.out.println(largest);

            if(entry.getValue()==largest)
            {
                System.out.println(entry.getKey());
            }

        }
    }

