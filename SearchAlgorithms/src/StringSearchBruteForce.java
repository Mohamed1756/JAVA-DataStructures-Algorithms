public class StringSearchBruteForce {

    public static void main(String[] args) {

        search("hello i am doing test and may test", "test");
    }


    public static void search (String text, String targetText) { // BRUTE FORCE


        int lengthOfText = text.length();
        int lengthOfTargetText = targetText.length();

        int i = 0, j = 0, k = 0;

        for (i = 0; i <= (lengthOfText - lengthOfTargetText); i++) {


            for (j = 0; j < lengthOfTargetText; j++) {
                if (text.charAt(i + j) != targetText.charAt(j)) {
                    break;
                }
            }
            if (j == lengthOfTargetText) {
                k++;
                System.out.println("Pattern Found at Position: " + i);
            }

        }

        if (k == 0) System.out.println("No Match Found!");
        else
            System.out.println("Total Instances Found = " + k);
    }
}
