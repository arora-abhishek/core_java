import java.io.*;
public class StringBuilder_readfile {
    public static void main(String[] args)throws IOException{

        try {

              BufferedReader br = new BufferedReader(new FileReader("/home/abhishek/IdeaProjects/Core_Java_Assignment/src/question9.txt"));

              StringBuilder sb = new StringBuilder();
               String str = "";

              while ((str = br.readLine()) != null) {
                  sb.append(str).append("\n");
              }

              System.out.println(sb);

            }
        catch(FileNotFoundException e) {
            System.err.println("File not found");
        }


    }
}
