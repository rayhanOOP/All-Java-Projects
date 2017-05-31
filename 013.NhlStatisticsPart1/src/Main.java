import java.util.Scanner;
import nhlstats.NHLStatistics;

public class Main {

    public static void main(String[] args) {
        
        //Scanner reader = new Scanner(System.in);
        
        System.out.println("Top ten by goals: ");
        NHLStatistics.sortByGoals();
        NHLStatistics.top(10);
        System.out.println("");
        System.out.println("Top ten by penalty amounts: ");
        NHLStatistics.sortByPenalties();
        NHLStatistics.top(25);
        System.out.println("");
        
        System.out.println("Statistics of Sidney Crosby: ");
        NHLStatistics.searchByPlayer("Sidney Crosby");
        
        System.out.println("");
        
        System.out.println("PHI Statistics: ");
        NHLStatistics.teamStatistics("PHI");
        NHLStatistics.sortByPoints();
        
        System.out.println("ANA Statistics: ");
        NHLStatistics.teamStatistics("ANA");
        NHLStatistics.sortByPoints();


        
        
        
        
        
    }
}
