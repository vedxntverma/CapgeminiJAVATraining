
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Qustion3 {
    public static void main(String[] args) {
        HashMap<String, Integer> hash = new HashMap<>();
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        scn.nextLine();
        for(int i=0;i<n;i++)
        {
            String name=scn.nextLine();
            int phone=scn.nextInt();
            scn.nextLine();
            hash.put(name,phone);
        }
        while(scn.hasNext())
        {
            String s=scn.nextLine();
            try
            {
                int out=hash.get(s);
                System.out.println(s+"="+out);
            }
            catch(Exception e)
            {
                System.out.println("Not found");
            }
        }

    }
}