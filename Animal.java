public class Animal {


    String family;
    String name;
    int age;
    boolean isMammal;
    //constructeur parametré
    Animal (string family,string name ,int age ,boolean isMammal)
    {
        this.family=family ;
       this.name =name;
       this.age=age;
       this.isMammal=isMammal;
    }

    @java.lang.Override
    public String toString() {
        return "Animal{" +
                "tring='" + tring + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", isMammal=" + isMammal +
                '}';
    }

}