
public class Main {

    public static void main(String[] args) {
        
        LyyraCard pekka = new LyyraCard(20);
        LyyraCard brian = new LyyraCard(30);
        
        pekka.payGourmet();
        System.out.print("Pekka : ");
        System.out.println(pekka);
        
        brian.payEconomical();
        System.out.print("Brian : ");
        System.out.println(brian);
        
        pekka.loadMoney(20);
        System.out.print("Pekka : ");
        System.out.println(pekka);
        
        brian.payGourmet();
        System.out.print("Brian : ");
        System.out.println(brian);
        
        pekka.payEconomical(); 
        pekka.payEconomical();
        System.out.print("Pekka : ");
        System.out.println(pekka);
        
        brian.loadMoney(50);
        System.out.print("Brian : ");
        System.out.println(brian);

    }
}
