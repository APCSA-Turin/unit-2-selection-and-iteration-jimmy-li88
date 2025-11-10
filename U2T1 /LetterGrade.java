public class LetterGrade {
    public LetterGrade() { }


   public String gradeV3(int score) {
   if (score >= 90) {
       return "A";
   }
   if (score >= 80) {
       return "B";
   }
   if (score >= 70) {
       return "C";
   }
   if (score >= 60) {
       return "D";
   }
   if (score < 60) {
       return "F";
   }
   return "";
}
    public String gradeV4(int score) {
   if (score >= 90) {
       return "A";
   } else if (score >= 80) {
       return "B";
   } else if (score >= 70) {
       return "C";
   } else if (score >= 60) {
       return "D";
   } else if (score < 60) {
       return "F";
   }
   return "";
}
}
