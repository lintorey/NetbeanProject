
package ArrayList.PastYear;

public class Doctor
{
   private String docName;
   private char docSpecialty;
   private int docYearService;
   
   public Doctor ()
   { 
      docName = "";
      docSpecialty = ' ';
      docYearService = -1;
   }
   
   public Doctor (String n, char s, int y)
   {
      docName = n;
      docSpecialty = s;
      docYearService = y;
   }
   
    public void setDoctor (String n, char s, int y)
   {
      docName = n;
      docSpecialty = s;
      docYearService = y;
   }
   
   public String getdocName()
   { return docName; }
   
   public char getdocSpecialty()
   { return docSpecialty; }
   
   public int getdocYearService()
   { return docYearService; }
   
   public String toString(){
      return "\nDoctor Name : " + docName + "\nDoctor Specialty : " + docSpecialty + "\nDoctor Year Service : " + docYearService;
   }
}


