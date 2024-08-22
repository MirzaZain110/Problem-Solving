import java.util.*;

public class FolderFileOrganizer {

    public static void main(String[] args) {
        // Example input
        String[] input = {"goto folder1", "create file1", "file2", "goto folder2", "file1"};

        // Map to store folder names and their associated file count
        Map<String, List<String>> folderMap = new HashMap<>();
        String currentFolder = "";

        for (String command : input) {
            if (command.startsWith("goto")) {
                currentFolder = command.split(" ")[1];
                folderMap.putIfAbsent(currentFolder, new ArrayList<>());
            } else if (command.startsWith("create") || !command.startsWith("goto")) {
                folderMap.get(currentFolder).add(command);
            }
        }

        // Determine the folder with the most files
        String largestFolder = "";
        int maxFiles = 0;

        for (Map.Entry<String, List<String>> entry : folderMap.entrySet()) {
            String folder = entry.getKey();
            int fileCount = entry.getValue().size();

            System.out.println(folder);
            System.out.println("---------------------------------");

            if (fileCount > maxFiles) {
                maxFiles = fileCount;
                largestFolder = folder;
            }
        }

        System.out.println("Largest folder: " + largestFolder);
    }
}
