public class Zoo {

      Animal [] animals
    string name;
    string city;
    int nbrCages;
Zoo (string name,string city,int nbrCages)
{
this.animals =new Animal[nbrCages]; // trajaana lel fou9aniya  pointina ala tableau mtaana waamlna intanciation haseb nbre de cages eli bch ndakhlouh
this .name=name;
this.city=city;
this.nbrCages=nbrCages;

}
 void displayZoo()
 {
    System.out.printLn(this.animals,this.city,this.nbrCages);
 }
}
@java.lang.Override
public String toString()
       return "Zoo{" +
               "tring='" + tring + '\'' +
        ", name='" + name + '\'' +
        ", city=" + city+
        ", nbrCages=" +nbrCages +
        '}';
        }







