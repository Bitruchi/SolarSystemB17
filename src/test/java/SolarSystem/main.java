package SolarSystem;
public class main {
    public static void main(String[] args) {
        SolarSystemBasics solarsys=new  SolarSystemBasics;
        solarsys.Sun="1";
        solarsys.Moon="2";
        solarsys.Planets="2";
        solarsys.Starts="10";

        //        **Feature Sun**
        FeatureSun Sun = new FeatureSun();
        Sun.name = "panther";
        Sun.color = "black";
        Sun.temp = "-1223124kelvin";


        // Planet1
        Planet1 plato=new Planet1;
        plato.color="green";
        plato.name="abracadabra";
        plato.temp="100000000k";
        plato.radius="800000000km";
    }
}
