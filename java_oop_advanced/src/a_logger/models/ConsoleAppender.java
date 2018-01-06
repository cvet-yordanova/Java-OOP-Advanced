package a_logger.models;


import a_logger.enums.ReportLevel;
import a_logger.interfaces.Layout;

public class ConsoleAppender extends AbstractAppender{

    public ConsoleAppender(Layout layout) {
        super(layout);
    }

    @Override
    public void append(String dateAndTime, String message) {
        ReportLevel reportLevel = this.getMessageReportLevel();
        if (super.reportLevelIsAboveOrEqual(reportLevel)) {
            System.out.println(this.getLayout().stringFormat(dateAndTime, message, reportLevel));
            this.setMessagesAppended(this.getMessagesAppended() + 1);
        }
    }
}
