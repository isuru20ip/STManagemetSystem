package com.isuru20.modal;

import java.util.HashMap;
import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperPrintManager;

public class Reporting {

    // print reports
    public boolean printReport(String reportPath, HashMap parm, JRDataSource dataSourse) throws JRException {
        JasperPrint print = JasperFillManager.fillReport(reportPath, parm, dataSourse);
        return JasperPrintManager.printReport(print, true);

    }

    // print reports
    public boolean printReport(String reportPath, HashMap parm) throws JRException {
        JasperPrint print = JasperFillManager.fillReport(reportPath, parm, new JREmptyDataSource());
        return JasperPrintManager.printReport(print, true);

    }
}
