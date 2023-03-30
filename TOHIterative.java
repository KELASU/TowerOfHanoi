import java.util.Stack;

public class TOHIterative {
    public static void TOH(int AmountDisks, char srcRod, char auxRod, char desRod) {
        Stack<Integer> srcStack = new Stack<>();
        Stack<Integer> auxStack = new Stack<>();
        Stack<Integer> desStack = new Stack<>();

        for (int i = AmountDisks; i >= 1; i--) {
            srcStack.push(i);
        }

        int total = (int) Math.pow(2, AmountDisks) - 1;

        if (AmountDisks % 2 == 0) {
            char temp = auxRod;
            auxRod = desRod;
            desRod = temp;
        }

        for (int i = 1; i <= total; i++) {
            if (i % 3 == 1) {
                moveDisk(srcStack, desStack, srcRod, desRod);
            } else if (i % 3 == 2) {
                moveDisk(srcStack, auxStack, srcRod, auxRod);
            } else if (i % 3 == 0) {
                moveDisk(auxStack, desStack, auxRod, desRod);
            }
        }
    }

    private static void moveDisk(Stack<Integer> source, Stack<Integer> dest, char srcRod, char desRod) {
        if (source.isEmpty()) {
            source.push(dest.pop());
            System.out.println("Move disk from " + desRod + " to " + srcRod);
        } else if (dest.isEmpty()) {
            dest.push(source.pop());
            System.out.println("Move disk from " + srcRod + " to " + desRod);
        } else if (source.peek() < dest.peek()) {
            dest.push(source.pop());
            System.out.println("Move disk from " + srcRod + " to " + desRod);
        } else {
            source.push(dest.pop());
            System.out.println("Move disk from " + desRod + " to " + srcRod);
        }
    }
}
