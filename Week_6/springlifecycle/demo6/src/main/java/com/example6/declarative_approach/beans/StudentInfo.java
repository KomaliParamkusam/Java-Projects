package com.example6.declarative_approach.beans;

public class StudentInfo 
{
    private String sName;
    private String branch;
    private Integer marks;
    public String getsName() 
    {
        return sName;
    }
    public void setsName(String sName) {
        this.sName = sName;
    }
    public String getBranch() {
        return branch;
    }
    public void setBranch(String branch) {
        this.branch = branch;
    }
    public Integer getMarks() {
        return marks;
    }
    public void setMarks(Integer marks) {
        this.marks = marks;
    }
     //logic for checking that important properties are injected with correct values are not
    
    public void myInit()
    {
        System.out.println("Init Method");
        if(sName == null || branch == null || marks==null || marks<=0 ||marks>100)
        {
            throw new IllegalArgumentException("Invalid values provided");
        }
    }

    //nullifying the properties after completion bmethod

    public void myDestroy()
    {
        System.out.println("Destroy Method");
        sName=null;
        branch=null;
        marks=null;
    }
    public String generateGrade()
    {
        if(marks>=95 && marks<=100)
        {
            return "[ Student name:: "+sName+"| Branch:: "+branch+"| Marks Scored:: "+marks+"| Secured with grade:: A+ ]";
        }
        else if(marks>=90 && marks<95)
        {
            return "[ Student name:: "+sName+"| Branch:: "+branch+"| Marks Scored:: "+marks+"| Secured with grade:: A ]";

        }
         else if(marks>=75 && marks<90)
        {
            return "[ Student name:: "+sName+"| Branch:: "+branch+"| Marks Scored:: "+marks+"| Secured with grade:: B ]";

        }
         else if(marks>=55 && marks<75)
        {
            return "[ Student name:: "+sName+"| Branch:: "+branch+"| Marks Scored:: "+marks+"| Secured with grade:: C ]";

        }
      
            return "[ Student name:: "+sName+"| Branch:: "+branch+"| Marks Scored:: "+marks+"| Secured with grade:: FAILED ]";
    }
    
    
}
