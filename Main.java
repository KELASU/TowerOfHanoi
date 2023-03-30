public class Main {
    public static void main(String[] args) {
        int numDisks = 3;
        char srcRod = 'X', auxRod = 'Y', desRod = 'Z';
        TOHRecursion.TOH(numDisks, srcRod, auxRod, desRod);
        TOHIterative.TOH(numDisks, srcRod, auxRod, desRod);

    }
}