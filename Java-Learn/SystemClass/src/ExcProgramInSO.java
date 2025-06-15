public class ExcProgramInSO {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        Process process;

            try {
                if(System.getProperty("os.name").toLowerCase().contains("win")) {
                process = runtime.exec("notepad");
                }else{
                process = runtime.exec("gedit");
                }
                process.waitFor();
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println("Process completed successfully.");
            System.exit(0);

    }
}
