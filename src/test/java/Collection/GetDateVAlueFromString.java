package Collection;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import net.rationalminds.LocalDateModel;
import net.rationalminds.Parser;

public class GetDateVAlueFromString {
    public static void main(String[] args) throws ParseException {
        ArrayList<Integer> year=new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();
        System.out.println(num);
//        String[] str = num.split(" ");
//        ArrayList<String> list = new ArrayList<>();
//        for (String d : str) {
//            if (d.contains("-")) {
//                list.add(d);
//            }
//        }
//        String [] fg= {};
//        for(int i=0;i<list.size();i++) {
//            list.get(i).replace("-", " ").replace(".", "");
//            System.out.println(list);
//            fg=list.get(i).split("-");
//        }
//
//        for(String n:fg)
//        {
//            System.out.println(n);
//            if (n.length()==4)
//            {
//                year.add(Integer.valueOf(n));
//            }
//        }
//
//        System.out.println(year);
        try {
            Date sdf = new SimpleDateFormat("yyyy-MM-dd").parse(num);
            String date = new SimpleDateFormat("dd-MM-yyyy").format(sdf);
            System.out.println(date);
        }catch (Exception e) {
            System.out.println("Exception occured "+e);
        }

    }
}
