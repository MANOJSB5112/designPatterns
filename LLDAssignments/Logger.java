package LLDAssignments;


import java.io.IOException;

public interface Logger {

//    void log(LogLevel level, String message);
//
//    void setLogFile(String filePath) throws IOException;
//
//    String getLogFile();

    // Flush the log entries to the file
    void flush() throws IOException;

    // Close the logger and release any resources
    void close() throws IOException;
}
