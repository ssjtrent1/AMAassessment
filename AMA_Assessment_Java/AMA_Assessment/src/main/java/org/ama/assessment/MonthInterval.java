package org.ama.assessment;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class MonthInterval {
    public static void main(String args[]) 
    {
        LocalDate january2017 = LocalDate.parse("2017-01-01");
	    LocalDate january2018 = LocalDate.parse("2017-10-01");
        
        System.out.println("Sum of x+y = " + january2017.getMonthValue());
        
        //Period p = Period.between(january2017, january2018);

        System.out.println("the function is "+generateMonthsInInterval( january2017,  january2018)[0]);
    
        //System.out.println("Sum of x+y = " + p.getMonths());
    }
    
    public static String[] generateMonthsInInterval(LocalDate startDate, LocalDate endDate) 
    {
        ArrayList<String> an=new ArrayList<>();
        //define each month
        String[] monthNames = {"January", "February", "March", "April", "May", "June",
        "July", "August", "September", "October", "November", "December"};
        //get the neccessary values
        int startmonthval=startDate.getMonthValue();
        int endmonthval=endDate.getMonthValue();
        Month startmonth=startDate.getMonth();

        Month endmonth=endDate.getMonth();
        String smon=startmonth.toString();
        String emon=endmonth.toString();
        int startyear=startDate.getYear();
        int endyear= endDate.getYear();
        //print out to see what we are getting
        System.out.println(startyear);
        System.out.println(endyear);
        System.out.println(startmonth);
        System.out.println(endmonth);
        //calculate the months used
        int yeardiff= endyear-startyear;
        int monthdiff=endmonthval-startmonthval;
        System.out.println("monthis"+monthdiff);
        int result = yeardiff*12+monthdiff;
        //define the list
        System.out.println("resut"+result);

//        ArrayList< String[]> answer=new ArrayList<>();

            if( result >=12)
            {
                //answer=monthNames;
                for(int i=0;i<monthNames.length;i++)
                {
                    //answer.add(monthNames[i]);
                    System.out.println("answer insert "+monthNames[i]);
                    an.add(monthNames[i]);

                }
            }
            else{
                int placeholder=startmonthval-1;

                int monthscount=result+1;
                int count=0;
                for(int k=placeholder;k<monthNames.length;k++)
                {
                    if(count==monthscount)
                    {
                        break;
                    }
                    if(monthNames[k]==emon)
                    {
                        System.out.println("hello"+monthNames[k].toString());
                        an.add(monthNames[k]);
                        count++;
                        break;
                    }
                    else
                    {
                        count++;
                        System.out.println("hello"+monthNames[k].toString());
                        an.add(monthNames[k]);

                    }
                }
                if(count!=monthscount)
                {
                    for(int k=0;k<monthNames.length;k++)
                    {
                     count++;
                     System.out.println("hello"+monthNames[k].toString());
                     an.add(monthNames[k]);

                    if(count==monthscount)
                    {
                        break;
                    }
                    }
                }

            }
    String[] answer= new String[an.size()];
    ArrayList<String> monthan=new ArrayList<>();
    for(int i =0;i<monthNames.length;i++)
    {
        monthan.add(monthNames[i]);
    }
    for(int i =0;i<monthan.size();i++)
    {
        boolean flag = false;
        for(int j =0;j<an.size();j++)
        {
            if(monthan.get(i).equals(an.get(j)))
            {
                flag=true;
            }
        }
        if(!flag)
        {
            monthan.set(i,"");
        }    
    }
    for(int i = 0;i<monthan.size();i++)
    {
        if(monthan.get(i).equals(""))
        {
            monthan.remove(i);
            i=i-1;
        }
    }
    System.out.println(monthan.size());
    for(int i =0;i<monthan.size();i++)
    {
        answer[i]=monthan.get(i);
    }
    for(int i=0;i<monthan.size();i++)
    {
        System.out.println("the answer i "+answer[i]);
    }
    System.out.println(monthan.size());

		return answer;
	 }
}
