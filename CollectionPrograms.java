import java.util.*;

public class CollectionPrograms {
    public static void main(String[] args) {
        listMethod();
        setMethod();
        mapMethod();
    }
    public static void listMethod(){
        ArrayList bag1=new ArrayList();
        bag1.add("Books");
        bag1.add("Purse having money"+300);
        bag1.add(2+" Face wash");
        bag1.add(45);
        bag1.add(null);
        bag1.add("Books");

        ListIterator bag1Check=bag1.listIterator();
        while (bag1Check.hasNext()){
            System.out.println("I found from bag1 : "+bag1Check.next());
        }

        LinkedList combineBag1=new LinkedList();
        combineBag1.addAll(bag1);
        combineBag1.add("Nothing new in combined bag");
        for (Object find:combineBag1) {
            System.out.println("I found from combined Bag : "+find);
        }
        System.out.println("The Size of an "+combineBag1.size());
       combineBag1.remove(1);
        System.out.println("Getting Value of index 1: "+combineBag1.get(1));
    }
    public static void setMethod(){
        HashSet set1=new HashSet<>();
        set1.add("Hari");
        set1.add("jack");
        set1.add("Hari");
        set1.add("Kani");
        set1.add("kani");
        //set1.add(24); Can't use Heterogeneous values in Treeset but applicable for Hashmap
       // set1.add(null); Can't use null in Treeset but applicable for Hashmap once
        for (Object setPrint:set1) {
            System.out.println(setPrint);
        }
        System.out.println("*****************");
        TreeSet set2=new TreeSet<>();
        set2.add("Tamil");
        set2.addAll(set1);
        //set2.add(null);
     //   set2.add(22);
        for (Object setPrint:set2) {
            System.out.println(setPrint);
        }

    }
    public static void mapMethod(){
        HashMap map1=new HashMap();
        map1.put(12,"Happy Man");
        map1.put(21,"Lost Creature");
      //  map1.put(21,"Soul Alone");   Key cannot be same
       // map1.put(null,"Nothing Free");  key can be null once in HashMap but not in TreeMap
        map1.put(25,null);
        map1.put(32,"Happy Man");
        Set hashMapPrint=map1.entrySet();

        for (Object mapPrint:hashMapPrint) {
            System.out.println(mapPrint);
        }

        TreeMap map2=new TreeMap();
        map2.put(29,"Dream Now");
        map2.putAll(map1);
        System.out.println(map2);
        Set keyPrint=map2.keySet();
        System.out.println("Total keys in map2 : "+keyPrint);
    }

}
