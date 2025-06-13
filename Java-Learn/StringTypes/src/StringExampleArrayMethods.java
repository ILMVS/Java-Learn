public class StringExampleArrayMethods {
    public static void main(String[] args) {
        String trabalenguas = "trabalenguas";
        char[] array = trabalenguas.toCharArray();
        int largo = array.length;
        for (int i=0 ; i< largo; i++) {
            System.out.println("El caracter " + i + " es: " + array[i]);
        }

        String[] array2 = trabalenguas.split("a");
        int l = array2.length;
        for (int i=0 ; i< l; i++) {
            System.out.println("El string " + i + " es: " + array2[i]);
        }

        String fileName = "example.documento.txt";
        String[] fileParts = fileName.split("[.]"); // \\ or []
        l = fileParts.length;
        for (int i=0 ; i< l; i++) {
            System.out.println("El string " + i + " es: " + fileParts[i]);
        }

    }
}