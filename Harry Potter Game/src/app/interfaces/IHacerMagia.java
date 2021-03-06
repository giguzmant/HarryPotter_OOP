package app.interfaces;

import java.util.List;

import app.artefactos.Artefacto;
import app.hechizos.Hechizo;
import app.personajes.Personaje;
import app.poderes.Poder;


public interface IHacerMagia {

    public void atacar(Personaje enemigo, Hechizo hechizo);
    public void atacar(Personaje p, String nombreHechizo);
    public List <Artefacto> getArtefactos(); 
    public Poder getPoderInicial();
    public void setPoderInicial(Poder poderInicial);
    public void aprenderHechizo(Hechizo h);
	

}