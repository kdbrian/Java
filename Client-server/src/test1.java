import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.*;

public class test1 {

    public static void main(String[] args) {

//        System.out.println("Helo world");
//
//        String one="one";
//        String two="one";
//
//        System.out.println(one.equals(two));
//
//        Integer _10=10;
//
//        System.out.println(Integer.toBinaryString(_10));

        Date today=new Date();
        System.out.println(today);

        //  formatting a date
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("dd-MM-yyyy");
        System.out.println(simpleDateFormat.format(today));

        //        Local date time
        /*
            LocalDateTime localDateTime=LocalDateTime.now();
            System.out.println(localDateTime.getHour());
            System.out.println(localDateTime.getMinute());
            System.out.println(localDateTime.getSecond());
            System.out.println(localDateTime.getMonth());
            System.out.println(localDateTime.getDayOfWeek());
            System.out.println(localDateTime.getYear());

         */
//        List myList= new ArrayList();
//
//        myList.add("Hello");
//
//        myList.add(10);
//        myList.add('B');
//        myList.add(false);
//        myList.add(20.13);
//        myList.add(20.13231F);
//
////        for(Object o:myList)
//
//        myList.forEach(o-> {
//            System.out.println(o);
//        });


//        Map<Character,String> names=new HashMap<>();
//
//        names.put('B',"Brian");
//        names.put('B',"Brian");
//        names.put('B',"Brian");
//        names.put('K',"Kidiga");
//        names.put('b',"Ben");//no repitition of key
//
//        for(char k:names.keySet()){
//            System.out.printf("%c\t%s\n",k,names.get(k));
//        }
    }
}
