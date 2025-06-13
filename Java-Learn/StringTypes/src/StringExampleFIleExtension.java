public class StringExampleFIleExtension {
    public static void main(String[] args) {
         String fileName = "example.txt";
            String fileExtension = getFileExtension(fileName);
        System.out.println("fileExtension = " + fileExtension);
    }

    public static  String getFileExtension(String fileName) {
        if (fileName == null || fileName.isEmpty()) {
            return "";
        }
        int lastIndexOfDot = fileName.lastIndexOf('.');
        if (lastIndexOfDot == -1 || lastIndexOfDot == fileName.length() - 1) {
            return ""; // No extension found
        }
        return fileName.substring(lastIndexOfDot + 1);
    }
}