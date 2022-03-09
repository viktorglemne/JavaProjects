package ovningLinus;

public class Gubbar {

        //Klassvariabler
        public String fName;
        public String eName;
        public int age;

        //Konstruktor. Tar in klassvariabler.
        public Gubbar(String fName, String eName, int age){
            this.fName = fName;
            this.eName = eName;
            this.age = age;
        }
        //En metod som hämtar gubbens hela namn.
        public String getFullName () {
            String fullname = "Förnamn: " + fName + "\n" + "Efternamn: " + eName + "\n" + "Ålder: " + age;
            return fullname;
        }
}


