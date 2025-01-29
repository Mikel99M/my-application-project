package extra;

public class Main {
    public static void main(String[] args) {

        ZadanieDodatkowe17_3 task = new ZadanieDodatkowe17_3();
        int[] grades = {3,1,1,5,6,4};
        int[] weights = {4,6,8,4,4,109};


        try {
            System.out.println(task.calculateWeightedAverage(grades, weights));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
