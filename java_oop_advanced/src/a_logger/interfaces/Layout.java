package a_logger.interfaces;

import a_logger.enums.ReportLevel;

public interface Layout {
    String stringFormat(String dateTime, String message, ReportLevel reportLevel);
}
