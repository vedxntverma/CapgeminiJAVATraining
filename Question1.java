import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class Question1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = Integer.parseInt(scn.nextLine());
        ArrayList<ArrayList> array_list = new ArrayList<ArrayList>();
        for(int i = 0;i<n;i++){
            int num = scn.nextInt();
            ArrayList<Integer> intArrayList =  new ArrayList<Integer>();
            for(int j=0;j<num;j++){
                intArrayList.add(scn.nextInt());
            }
            array_list.add(intArrayList);
            scn.nextLine();
        }
        int numQueries = Integer.parseInt(scn.nextLine());
        for(int i=0;i<numQueries;i++){
            int x = scn.nextInt()-1;
            int y = scn.nextInt()-1;
            scn.nextLine();
            if(x<array_list.size() && y<array_list.get(x).size()){
                System.out.println(array_list.get(x).get(y));
            }else{
                System.out.println("ERROR!");
            }
        }
    }
}
