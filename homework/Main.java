

public class Main {
    public static void main(String[] args){
    User user = new User("Bob");
    
    Persister persister=new Persister(user);
    persister.save();
    persister.report();
        
    
  
    
    }

}
