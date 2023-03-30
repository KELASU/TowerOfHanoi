public class TOHRecursion {

    public static void TOH(int AmountDisks, char srcRod, char auxRod, char desRod) {
        if (AmountDisks == 1) {
            System.out.println("Move disk by 1 from rod " + srcRod + " to rod " + desRod);
            return;
        }
        TOH(AmountDisks - 1, srcRod, desRod, auxRod);
        System.out.println("Move disk " + AmountDisks + " from rod " + srcRod + " to rod " + desRod);
        TOH(AmountDisks - 1, auxRod, srcRod, desRod);
    }

}
