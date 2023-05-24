package cl.gonzalobenavides.masterobject.human;

import java.util.Random;

public class Humano {
	protected String nombre;
	protected String clase;
	
	protected int strength;
	protected int stealth;
	protected int intelligence;
	protected int health;
	
	protected boolean alive;
	
	protected String[] ataques = {"una patada", "un puñetazo", "un ataque de cosquillas","un gancho derecho", "un gancho izquierdo", "un cabezazo"};
	
	public Humano() {
		this.strength = 3;
		this.stealth = 3;
		this.intelligence = 3;
		this.health = 100;
		this.clase = "Humano";
	}
	
	public boolean isAlive() {
		if(this.health <= 0) { 
			return false;
		}
		else{
			return true;
		}
	}
	
	public void atacar(Humano persona) {
		Random rand = new Random(); 
		
		if(!isAlive()) {
			if(this.getNombre() == null || this.getNombre().isBlank())
				System.out.println("Un "+ this.clase.toLowerCase() + " no puede realizar acciones ya que ha muerto!");
			else
				System.out.println(this.nombre + " no puede realizar acciones ya que ha muerto!");
			return;
		}
		
		if(this.nombre == null || this.nombre.isBlank()) {
			if(persona.getNombre() == null || persona.getNombre().isBlank())
				System.out.println("Un "+ this.clase.toLowerCase() + " da " + ataques[rand.nextInt(0,ataques.length-1)] + " a un "+ persona.clase.toLowerCase() + "!");
			else
				System.out.println("Un "+ this.clase.toLowerCase() + " da " + ataques[rand.nextInt(0,ataques.length-1)] + " a "+ persona.getNombre() + "!");
		}
		else {
			if(persona.getNombre() == null || persona.getNombre().isBlank())
				System.out.println(this.nombre + " da " + ataques[rand.nextInt(0,ataques.length-1)] + " a un "+ persona.clase.toLowerCase() + "!");
			else
				System.out.println(this.nombre + " da " + ataques[rand.nextInt(0,ataques.length-1)] + " a "+ persona.getNombre() + "!");
		}
		
		persona.health -= this.strength;
	}
	
	public void displayHumano(){
		if(this.nombre == null || this.nombre.isBlank())
			System.out.println("El nivel del "+this.clase.toLowerCase()+" es: (HLT: "+this.health+", STR: "+this.strength+", STL: "+this.stealth+", INT: "+this.intelligence+")");
		else
			System.out.println("El nivel de " + this.nombre + "("+clase+") es: (HLT: "+this.health+", STR: "+this.strength+", STL: "+this.stealth+", INT: "+this.intelligence+")");
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
}
