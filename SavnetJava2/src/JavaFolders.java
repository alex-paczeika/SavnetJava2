import java.io.*;

public class JavaFolders {

    static int numberOfLines = 0;
    static int numberOfFolders = 0;
    static int numberOfFiles = 0;
	static int accessSpecifiersCount=0;
    public static void main(String[] args) throws IOException {


        search(new File("/Users/paczeikadan/Desktop/test1"));
        System.out.println(numberOfFolders + "folders");
        System.out.println(numberOfLines + "lines of code");
        System.out.println(numberOfFiles + "files");
    }

    private static void search(File folder) throws IOException {
        File[] files = folder.listFiles();

        for (File file : files) {



            if (file.isDirectory()) {
                numberOfFolders++;
                search(file);
            }
            String numele = file.getName();
            if (file.isFile() && numele.substring(numele.length() - 4).equals("java")) {
                numberOfFiles++;
                read(file);
            }

        }

    }


    private static void read(File file) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
        while (true) {
            String s = br.readLine();
            
            if (s == null) {
                break;
            }
            if (s.contains("//")) {
                numberOfLines--;
            }
            if (s.trim().isEmpty()) {
                numberOfLines--;
            }
            if (s.contains("public") || s.contains("private") || s.contains("protected")) {
				accessSpecifiersCount++;
			}
            numberOfLines++;


        }
    }
}

