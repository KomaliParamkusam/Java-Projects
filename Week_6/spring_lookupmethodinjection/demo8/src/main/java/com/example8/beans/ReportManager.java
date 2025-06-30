package com.example8.beans;

import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;

@Component("manager")
public abstract class ReportManager 
{
    public void generateReport()
    {
        Report report=createReport();
        report.display();
    }
    @Lookup
    public abstract Report createReport();
    
}
