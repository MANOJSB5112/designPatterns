//package LLDAssignments;
//
//
//import java.io.FileWriter;
//import java.io.IOException;
//import java.io.PrintWriter;
//import java.time.LocalDateTime;
//import java.time.format.DateTimeFormatter;
//
//
//public class LoggerImpl implements Logger {
//
//    private FileWriter fileWriter;
//   private PrintWriter printWriter;
//   private String file;
//    private static LoggerImpl instance=null;
//    private LoggerImpl()
//    {
//
//    }
//    public LoggerImpl  getInstance()
//    {
//        if(instance==null)
//        {
//            synchronized (LoggerImpl.class)
//            {
//                if(instance==null)
//                {
//                    instance=new LoggerImpl();
//                }
//            }
//        }
//        return instance;
//    }
//    public void resetInstance()
//    {
//        instance=null;
//    }
////    @Override
////    public void log(LogLevel level, String message) {
////        if(printWriter==null)
////        {
////            throw new IllegalStateException("setLogFileNot inistiated");
////        }
////        String logmessage=getCurrentTimeStamp()+" ( " + level.name() + " )" + message;
////        printWriter.println(logmessage);
////    }
//    private String getCurrentTimeStamp() {
//        LocalDateTime currentDateTime = LocalDateTime.now();
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
//        return currentDateTime.format(formatter);
//    }
//
//    @Override
//    public void setLogFile(String filePath) throws IOException {
//         file=filePath;
//         fileWriter=new FileWriter(filePath,true);
//         printWriter=new PrintWriter(filePath);
//    }
//
//    @Override
//    public String getLogFile() {
//        return file;
//    }
//
//    @Override
//    public void flush() throws IOException {
//        if(fileWriter!=null)
//        {
//            fileWriter.flush();;
//        }
//
//    }
//
//    @Override
//    public void close() throws IOException {
//        if(fileWriter!=null)
//        {
//            fileWriter.close();;
//        }
//
//    }
//}