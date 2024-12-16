import java.io.*;
import java.util.*;

public class practice {
    public static void main(String[] args) throws IOException {
//
        int[] array={10,34,31,9,32};

        ArrayList<Integer> arlist=new ArrayList<>();
         for(int i=0;i<array.length;i++)
         {
             arlist.add(array[i]);
         }
        System.out.println(arlist);

        Set<Integer> s1=new TreeSet<>(arlist);
        System.out.println(s1);


            }
        }

