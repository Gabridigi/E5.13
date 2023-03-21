public class Grade {
    private String grade;
    public Grade(String newgrade)
    {
        this.grade=newgrade;
    }
    
    public double getNumericGrade(){
       if(this.grade.equals("A")){ return 4.0;}
       else if(this.grade.equals("B")){return 3.0;}
       else if(this.grade.equals("C")){return 2.0;}
       else if(this.grade.equals("D")){return 1.0;}
       else if(this.grade.equals("F")){return 0.0;}
       else if(this.grade.equals("A+")){ return 4.3;}
       else if(this.grade.equals("B+")){return 3.3;}
       else if(this.grade.equals("C+")){return 2.3;}
       else if(this.grade.equals("D+")){return 1.3;}
       
       
       else {return -1.0;}
        /*switch(this.grade.)
        {
            case this.grade.to"A": 
            return 4.0; 
            case "B": 
            return 3.0;
            case "C":
            return 2.0;
            case "D": 
            return 1.0; 
            case "F":
            return 0;
            default: return; break;
        }*/
    }

}
