
//Instruction 1
public class ZooManagement
{
    int nbrCages = 20;
    String zooName = "my zoo";
    public static void main(String[] args)
    {
        ZooManagement z = new ZooManagement();
        System.out.println(z.zooName +" comporte "+ z.nbrCages +" cages");
    }
}
//Instruction 2
import java.util.Scanner;
public class ZooManagement
{
    int nbrCages ;
    String zooName ;
    public static void main(String[] args)
    {
        ZooManagement z = new ZooManagement();
        Scanner sc =new Scanner(System.in);
        System.out.println("taper le nom de zoo");
        z.zooName=sc.nextLine();
        System.out.println("taper le nombre de cages");
        z.nbrCages=sc.nextInt();
        System.out.println(z.zooName +" comporte "+ z.nbrCages +" cages");
    }
}
///////////// instructions 5
public class ZooManagement
{
    int nbrCages = 20;
    String zooName = "my zoo";
    public static void main(String[] args)
    {

Animal lion=new Animal(family:"loo", "chien" , 50,"faux");
//ou bien
        /*
        Animal lion=new Animal()
        { lion.family="loo";
        lion.name="chien";
        lion.age=10;
        lion.isMammel="true";
         */
zoo myZoo =new Zoo(name:"belvedere",city ; "tunis")
System.out.println(lion);
System.out.println(lion.toString());
///1ere methode pour afficher linstance myZoo
myZoo.displayZoo();
//2eme methode pour afficher linstance myZoo
        System.out.println(myZoo);
        System.out.println(myZoo.toString());
    }