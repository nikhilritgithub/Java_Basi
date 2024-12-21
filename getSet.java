public class getSet {
    public static void main(String args[]){
        Bike b1 = new Bike();
        b1.setCompany("Hero");
        System.out.println(b1.getCompany());
        b1.setYear(2023);
        System.out.println(b1.getYear());
    }
}

class Bike{
    private String cmp_name;
    private int m_year;

    String setCompany(String cmp_name){
        return this.cmp_name = cmp_name;
    }

    int setYear(int m_year){
        return this.m_year = m_year;
    }

    String getCompany(){
        return this.cmp_name;
    }

    int getYear(){
        return this.m_year;
    }
}
