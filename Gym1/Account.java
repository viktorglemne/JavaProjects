package Gym1;

public class Account {
    
    
    
    private String namn;     //konton ska innehålla namn och lösenord
    private String password;
    
    public void setName(String namn) { //metod för att ge namn till objekt
        this.namn = namn;
    }
        public String getName() { //metod för att hämta namn
        return namn;
    }
    public void setPassword(String password) { 
        this.password = password;
    }
        public String getPassword() {
        return password;
    }
}

