import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.*;

public class WorldCupTeamFormations {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner kb = new Scanner(System.in);
        
        Integer[] programInput = new Integer[10];
        
        for(int i = 0; i < 10; ++i){
            programInput[i] = Integer.parseInt(kb.nextLine());
        }
        Arrays.sort(programInput, Collections.reverseOrder());

        int i = 0, j = 1, sum1 = 0, sum2 = 0;
        while(i < 5 && j < 6){
        	sum1 += programInput[i];
        	sum2 += programInput[j];
        	i += 2;
        	j += 2;
        }
        System.out.println(Math.max(sum1, sum2));
        
    }
}