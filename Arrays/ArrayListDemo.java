package Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
public class ArrayListDemo {
    public static void main(String[] args){

        ArrayList<Integer> list = new ArrayList<Integer>(5);
        //you can use toString with Array Lists as opposed to primitive arrays
        System.out.println(list);
        System.out.println(list.size());

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);
        System.out.println(list.size());
        list.add(1, 5);

        System.out.println(list.get(5));

        list.remove(3);
        System.out.println(list);


     list.add(1, 5);
     list.add(2, 5);

     list.remove(Integer.valueOf(5));
     System.out.println(list);



     System.out.println("Contains 5: " + list.contains(5));



     Collections.sort(list);
     Integer value = Collections.binarySearch(list, 4);
    System.out.println(value);
     System.out.println(list);


    Integer[] arr = list.toArray(new Integer[0]);
    for (int val : arr) {
        System.out.println(val + " ");
    }
    System.out.println();


    ArrayList<Integer> splitList = new ArrayList<Integer>(list.subList(3,list.size()-1));
    System.out.println(splitList);
    
    list.clear();
    System.err.println(list);
    System.out.println(list.size());

   // ArrayList<Integer> list = new ArrayList<Integer>(5);


    ArrayList<Integer> newlist = new ArrayList<Integer>(0);
    //challenge 1
    

    for (int i = 0; i < 10; i++){
        int a = (int) ((Math.random()*10)+1);
        if (a != 1 && a!= 3 && a != 5 && a != 7 && a != 9)
        newlist.add(a);
        }
    System.out.println(newlist);
   
    ArrayList<String> guestList = new ArrayList<>();
    Scanner input = new Scanner(System.in);
    System.out.println("Who is invited?");
    String line = input.nextLine();
    While (!line.equalsIgnoreCase("exit")){
        guestList.add(line);
        line = input.nextLine();
    }
    System.out.println("who do you want to check for in the guest list?");
    line = input.nextLine();
    while (!line.equalsIgnoreCase("exit")){
        if (guestList.contains(line))
            System.out.println("they are invited");
    }

    }

    public static void lucasolution(){

        ArrayList<String> guestList = new ArrayList<String>();

        String name = "";

        Scanner input = new Scanner(System.in);
        
    }
}

