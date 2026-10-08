public class App {
    public static void main(String[] args) throws Exception {
       int x = 6;
       int y = 3;
       int z = x + y;
       runCalculator(z);
    }

    private static void runCalculator(int z){
        for(int i = 0; i < z; i++){
            System.out.println("Calculating: " + i);
        }
    }
}
