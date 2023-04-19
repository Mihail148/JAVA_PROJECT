import java.io.IOException;
import java.nio.file.Files;
import java.io.File;

package JAVAHomework;

public class Task_06 {
    public String identifyFileTypeUsingFilesProbeContentType(final String fileName)
    {
       String fileType = "Undetermined";
       final File file = new File(fileName);
       try
       {
          fileType = Files.probeContentType(file.toPath());
       }
       catch (IOException ioException)
       {
          System.out.println(
               "ERROR: Unable to determine file type for " + fileName
                  + " due to exception " + ioException);
       }
       return fileType;
    }
}
