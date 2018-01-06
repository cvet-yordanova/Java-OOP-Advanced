package a_logger.interfaces;


import a_logger.enums.ReportLevel;

public interface Appender {

    void append(String dateAndTime, String message);

    void setReportLevel(ReportLevel reportLevel);

    Layout getLayout();
}
