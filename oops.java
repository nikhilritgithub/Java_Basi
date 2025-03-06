public class oops{
    public static void main(String args[]){
        Pen p1 = new Pen();
        p1.setColor("Red");
        p1.setTip(10);
        System.out.println(p1.color);
        p1.color = "Yellow";
         System.out.println(p1.tip);
         System.out.println(p1.color);
         
         Bankaccount myacc = new Bankaccount();
         myacc.username = "Nikhilxys";
         myacc.setPassword("9fdjn");
         System.out.println(myacc.username);
           //System.out.println(myacc.password);

        Vehicle v1 = new Vehicle();
        v1.Setcompany("Hero");
        v1.model = 2012;
        System.out.println(v1.company);
    }
}

class Bankaccount{
    public String username;
    private String password;
    public void setPassword(String pwd){
        password = pwd;
    }
}

class Pen{
    String color;
    int tip;
    
    void setColor(String newcolor){
        color = newcolor;
    }
    void setTip(int newtip){
        tip = newtip;
    }
}

//getters setters...
class Vehicle{
    String company;
    int model;

    String Setcompany(String company){
        return this.company = company;
    }

    int Setmodel(int model){
        return this.model= model;
    }

    String getcompany(){
        return this.company;
    }

    int getmodel(){
       return this.model;
    }
}