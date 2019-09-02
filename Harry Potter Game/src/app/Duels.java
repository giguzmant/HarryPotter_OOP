package app;

import java.util.ArrayList;
import java.util.List;

import app.artefactos.Artefacto;
import app.artefactos.CapaInvisibilidad;
import app.artefactos.Horrocrux;
import app.artefactos.PiedraResurreccion;
import app.artefactos.VaritaDeSauco;
import app.hechizos.Accio;
import app.hechizos.AvedaKedavra;
import app.hechizos.CaveInimicum;
import app.hechizos.Crucio;
import app.hechizos.Ferula;
import app.hechizos.Hechizo;
import app.hechizos.Imperio;
import app.hechizos.PetrificusTotalus;
import app.hechizos.ProtegoMaxima;
import app.hechizos.Sectumsempra;
import app.hechizos.VulneraSanentur;
import app.hechizos.WingardiumLeviosa;
import app.personajes.Elfo;
import app.personajes.Muggle;
import app.personajes.Personaje;
import app.personajes.Wizard;
import app.poderes.Invisibilidad;
import app.poderes.Metamorfosis;
import app.poderes.ParselTongue;
import app.poderes.Poder;

/**
 * Duels
 */
public class Duels {

    public static List<Personaje> personajes = new ArrayList<Personaje>();

    public static List<Artefacto> artefactos = new ArrayList<Artefacto>();
    public static List<Hechizo> hechizos = new ArrayList<Hechizo>();

    public static List<Wizard> wizards = new ArrayList<Wizard>();

    public static void inicioDuelo() {
        Duels.agregarPersonajes();
        Duels.agregarArtefactos();
        Duels.agregarHechizos();
    }

    private static void agregarHechizos() {

        Hechizo leviosa = new WingardiumLeviosa("Wingardium Leviosa", false, 0, 0, 10);
        Duels.hechizos.add(leviosa);

        Hechizo cave = new CaveInimicum("Cave Inimicum", false, 30, 0, 50);
        Duels.hechizos.add(cave);

        Hechizo vulnera = new VulneraSanentur("Vulnera Sanentur", false, 30, 100, 30);
        Duels.hechizos.add(vulnera);

        Hechizo sectum = new Sectumsempra("Sectum Sempra", true, 90, 0, 30);
        Duels.hechizos.add(sectum);

        Hechizo petrificus = new PetrificusTotalus("Petrificus Totalus", false, 50, 0, 35);
        Duels.hechizos.add(petrificus);

        Hechizo crucio = new Crucio("Crucio", true, 70, 0, 20);
        Duels.hechizos.add(crucio);

        Hechizo aveda = new AvedaKedavra("Aveda Kedavra", true, 85, 0, 12);
        Duels.hechizos.add(aveda);

        Hechizo accio = new Accio("Accio", false, 50, 0, 30);
        Duels.hechizos.add(accio);

        Hechizo protego = new ProtegoMaxima("Protego Maxima", false, 0, 70, 40);
        Duels.hechizos.add(protego);

        Hechizo imperio = new Imperio("Imperio", true, 60, 20, 32);
        Duels.hechizos.add(imperio);

        Hechizo ferula = new Ferula("Ferula", false, 40, 70, 20);
        Duels.hechizos.add(ferula);

    }

    private static void agregarArtefactos() {

        Artefacto capa = new CapaInvisibilidad("Capa Invisibilidad", 10, 5);
        Duels.artefactos.add(capa);

        Artefacto piedra = new PiedraResurreccion("Piedra de la Resurrección", 5, 100);
        Duels.artefactos.add(piedra);

        Artefacto horrocrux = new Horrocrux("Horrocrux", 10, 60);
        Duels.artefactos.add(horrocrux);

        Artefacto varitasauco = new VaritaDeSauco("Varita de Sauco", 80, 30);
        Duels.artefactos.add(varitasauco);

    }

    public static void agregarPersonajes() {

        Wizard harry = new Wizard("Harry Potter", true, 100, 17);
        Poder invisibilidad = new Invisibilidad("Invisibilidad", 1, false, 20, 10, 20);
        harry.setPoderInicial(invisibilidad);

        Duels.personajes.add(harry);

        Wizard hermione = new Wizard("Hermione Granger", true, 100, 17);
        Poder metamorfosis = new Metamorfosis("Metamorfosis", 2, false, 40, 100, 60);
        hermione.setPoderInicial(metamorfosis);

        Duels.personajes.add(hermione);

        Wizard snape = new Wizard("Severus Snape", true, 100, 55);
        Poder invisbilidad2 = new Invisibilidad("Invisibilidad", 3, false, 20, 10, 100);
        snape.setPoderInicial(invisbilidad2);

        Duels.personajes.add(snape);

        Elfo dobby = new Elfo("Dobby", true, 100, 100);
        Poder parsel = new ParselTongue("Parsel Tongue", 3, true, 50, 70, 87);
        dobby.setPoderInicial(parsel);

        Duels.personajes.add(dobby);

        Elfo kreacher = new Elfo("Kreacher", true, 100, 100);
        Metamorfosis metamorfosis2 = new Metamorfosis("Metamorfosis", 4, false, 40, 100, 54); // NIVEL ENERGIA DISMINUYE
        kreacher.setPoderInicial(metamorfosis2);

        Duels.personajes.add(kreacher);

        Muggle dudley = new Muggle("Dudley Dursley", true, 100, 17);
        Duels.personajes.add(dudley);

        Muggle petunia = new Muggle("Petunia Potter", true, 100, 50);
        Duels.personajes.add(petunia);

    }

    public static Personaje verPersonaje(String nombre) {
        for (Personaje per : Duels.personajes) {
            if (per.nombre.equals(per.nombre))
                return per;
        }
        return null;
    }

    public static Artefacto verArtefacto(String nombreDeArtefacto){

        for (Artefacto art : Duels.artefactos) {
            if (art.nombreDeArtefacto.equals(art.nombreDeArtefacto))
                return art;
        }
        return null;
    }

    public static Hechizo verHechizo(String nombreDeHechizo) {
        
        for (Hechizo hech : Duels.hechizos) {
            if (hech.nombreDeHechizo.equals(hech.nombreDeHechizo))
                return hech;
        }
        return null;
    }

    public static void listadoPersonajes(){
        for(int i = 0; i < Duels.personajes.size(); i++) {
            Personaje per = Duels.personajes.get(i);
            System.out.println(per.nombre);
        }
    }

    public static void listadoArtefactos(){
        for (int i = 0; i < Duels.artefactos.size(); i++) {
            Artefacto art = Duels.artefactos.get(i);
            System.out.println(art.nombreDeArtefacto);
        }

    }

    public static void listadoHechizos(){
        for(int i = 0; i<Duels.hechizos.size(); i++) { 
            Hechizo hech = Duels.hechizos.get(i);
            System.out.println(hech.nombreDeHechizo);
        }
    }
}