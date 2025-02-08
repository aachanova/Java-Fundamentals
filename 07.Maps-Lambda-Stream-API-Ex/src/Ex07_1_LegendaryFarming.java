import java.util.*;
import java.util.stream.Collectors;

public class Ex07_1_LegendaryFarming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> keyMaterials = new LinkedHashMap<>();
        keyMaterials.put("shards", 0);
        keyMaterials.put("fragments", 0);
        keyMaterials.put("motes", 0);

        Map<String, Integer> junks = new LinkedHashMap<>();

        String input = scanner.nextLine();
        boolean isObtained = false;
        String legendaryItem = "";

        while (!isObtained) {
            String[] info = input.toLowerCase().split("\\s+");

            for (int i = 0; i < info.length; i += 2) {
                int quantity = Integer.parseInt(info[i]);
                String material = info[i + 1];

                if (keyMaterials.containsKey(material)) {
                    keyMaterials.put(material, keyMaterials.get(material) + quantity);
                    if (keyMaterials.get(material) >= 250) {
                        isObtained = true;

                        switch (material) {
                            case "shards" -> legendaryItem = "Shadowmourne";
                            case "fragments" -> legendaryItem = "Valanyr";
                            case "motes" -> legendaryItem = "Dragonwrath";
                        }

                        keyMaterials.put(material, keyMaterials.get(material) - 250);
                        break;
                    }
                } else {
                    junks.putIfAbsent(material, 0);
                    junks.put(material, junks.get(material) + quantity);
                }
            }

            if (isObtained) {
                printOutput(legendaryItem, keyMaterials, junks);
                return;
            }

            input = scanner.nextLine();
        }
    }

    private static void printOutput(String legendaryItem, Map<String, Integer> keyMaterials,
                                    Map<String, Integer> junks) {
        System.out.printf("%s obtained!%n", legendaryItem);

        keyMaterials.entrySet().stream()
//                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed().thenComparing(Map.Entry.comparingByKey()))
                .forEach(e -> System.out.printf("%s: %d%n", e.getKey(), e.getValue()));

        junks.entrySet().stream()
//                .sorted((Map.Entry.comparingByKey()))
                .forEach(e -> System.out.printf("%s: %d%n", e.getKey(), e.getValue()));
    }
}
