
public class Month {
    private int monthNumber;
    private String monthName;
    
    public Month() {
        this.monthNumber = 1;
    }

    public Month(int monthNumber) {
        
        if (monthNumber < 1 || monthNumber > 12)
            this.monthNumber = 1;
        else 
            this.monthNumber = monthNumber;
    }

    public Month(String monthName) {
        if (monthName.equalsIgnoreCase("january"))
            this.monthNumber = 1;
        else if (monthName.equalsIgnoreCase("february"))
            this.monthNumber = 2;
        else if (monthName.equalsIgnoreCase("march"))
            this.monthNumber = 3;
        else if (monthName.equalsIgnoreCase("april"))
            this.monthNumber = 4;
        else if (monthName.equalsIgnoreCase("may"))
            this.monthNumber = 5;
        else if (monthName.equalsIgnoreCase("june"))
            this.monthNumber = 6;
        else if (monthName.equalsIgnoreCase("july"))
            this.monthNumber = 7;
        else if (monthName.equalsIgnoreCase("august"))
            this.monthNumber = 8;
        else if (monthName.equalsIgnoreCase("september"))
            this.monthNumber = 9;
        else if (monthName.equalsIgnoreCase("october"))
            this.monthNumber = 10;
        else if (monthName.equalsIgnoreCase("november"))
            this.monthNumber = 11;
        else if (monthName.equalsIgnoreCase("december"))
            this.monthNumber = 11;
        else
            this.monthNumber = 1;
    }

    public void setMonthNumber(int monthNumber) {
        if (monthNumber < 1 || monthNumber > 12)
            this.monthNumber = 1;
        else 
            this.monthNumber = monthNumber;
    }
    
    public int getMonthNumber() {
        return monthNumber;
    }
    
    public void setMonthName(String monthName) {
        this.monthName = monthName;
    }

    public String getMonthName() {
        switch (monthNumber) {
            case 1: monthName = "January";
                break;
            case 2: monthName = "February";
                break;
            case 3: monthName = "March";
                break;
            case 4: monthName = "April";
                break;
            case 5: monthName = "May";
                break;
            case 6: monthName = "June";
                break;
            case 7: monthName = "July";
                break;
            case 8: monthName = "August";
                break;
            case 9: monthName = "September";
                break;
            case 10: monthName = "October";
                break;
            case 11: monthName = "November";
                break;
            case 12: monthName = "December";
                break; 
            default: monthName = "January";
                break;     
        }
        return monthName;
    }

    @Override
    public String toString() {
        return getMonthName();
    }
    
    public boolean equals(Month month) {
        return this.getMonthNumber() == month.getMonthNumber();
    }
    
    public boolean greaterThan(Month month) {
        if (this.getMonthNumber() > month.getMonthNumber())
            return true;
        else
            return false;
    }
    
    public boolean lessThan(Month month) {
        if (this.getMonthNumber() < month.getMonthNumber())
            return true;
        else
            return false;
    }
    
}
