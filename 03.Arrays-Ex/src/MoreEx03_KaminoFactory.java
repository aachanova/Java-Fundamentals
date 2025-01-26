import java.util.Arrays;
import java.util.Scanner;

public class MoreEx03_KaminoFactory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();

        int[] bestDna = new int[length];
        int sampleCounter = 0;
        int maxSample = 0;
        int maxSumSeq = 0;
        int totalSeqOnes = 0;
        int totalStartIndex = -1;

        while (!input.equals("Clone them!")) {
            int cerrentDnaOnes = 0;
            int currentSeqOnes = 0;
            int currentStartIndex = -1;
            int maxCurrentSeqOnes = 0;
            int maxCurrentStartIndex = -1;


            int[] dna = Arrays.stream(input.split("!+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            sampleCounter++;

            for (int i = 0; i < length; i++) {
                if (dna[i] != 1) {
                    currentSeqOnes = 0;
                } else {
                    if (currentSeqOnes == 0) {
                        currentStartIndex = i;
                    }

                    currentSeqOnes++;
                    cerrentDnaOnes++;

                    if (currentSeqOnes > maxCurrentSeqOnes) {
                        maxCurrentSeqOnes = currentSeqOnes;
                        maxCurrentStartIndex = currentStartIndex;
                    }
                }

            }

            if (maxCurrentSeqOnes > totalSeqOnes) {
                totalSeqOnes = maxCurrentSeqOnes;
                totalStartIndex = maxCurrentStartIndex;
                maxSumSeq = maxCurrentSeqOnes;
                maxSample = sampleCounter;
                bestDna = dna;
            } else if (maxCurrentSeqOnes == totalSeqOnes) {
                if (maxCurrentStartIndex < totalStartIndex) {
                    totalStartIndex = maxCurrentStartIndex;
                    maxSample = sampleCounter;
                    bestDna = dna;

                } else if (maxCurrentStartIndex == totalStartIndex) {
                    if (cerrentDnaOnes > maxSumSeq) {
                        maxSumSeq = cerrentDnaOnes;
                        maxSample = sampleCounter;
                        bestDna = dna;
                    }
                }


            }

            input = scanner.nextLine();
        }


        System.out.printf("Best DNA sample %d with sum: %d.%n", maxSample, maxSumSeq);

        for (
                int num : bestDna) {
            System.out.print(num + " ");
        }
    }
}
