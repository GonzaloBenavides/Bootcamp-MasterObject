package cl.gonzalobenavides.masterobject.human;

public class Wizard extends Humano{
	public Wizard() {
		super();
		this.health = 50;
		this.intelligence = 8;
		this.clase = "Wizard";
	}
	
	public void fireBall(Humano persona) {
		if(!isAlive()) {
			if(this.getNombre() == null || this.getNombre().isBlank())
				System.out.println("Un " + this.clase.toLowerCase() + " no puede realizar acciones ya que ha muerto!");
			else
				System.out.println(this.nombre + " no puede realizar acciones ya que ha muerto!");
			return;
		}
		
		
		if(this.nombre == null || this.nombre.isBlank()) {
			if(persona.getNombre() == null || persona.getNombre().isBlank())
				System.out.println("Un " + this.clase.toLowerCase() + " lanzó una Bola de Fuego a un "+ persona.clase.toLowerCase() + "!");
			else
				System.out.println("Un " + this.clase.toLowerCase() + " lanzó una Bola de Fuego a "+ persona.getNombre() + "!");
		}
		else {
			if(persona.getNombre() == null || persona.getNombre().isBlank())
				System.out.println(this.nombre + " lanzó una Bola de Fuego a un "+ persona.clase.toLowerCase() + "!");
			else
				System.out.println(this.nombre + " lanzó una Bola de Fuego a "+ persona.getNombre() + "!");
		}
		
		persona.health -= this.intelligence*3;
	}
	
	public void heal(Humano persona) {
		if(!isAlive()) {
			if(this.getNombre() == null || this.getNombre().isBlank())
				System.out.println("Un " + this.clase.toLowerCase() + " no puede realizar acciones ya que ha muerto!");
			else
				System.out.println(this.nombre + " no puede realizar acciones ya que ha muerto!");
			return;
		}
		
		
		if(this.nombre == null || this.nombre.isBlank()) {
			if(persona.getNombre() == null || persona.getNombre().isBlank())
				System.out.println("Un " + this.clase.toLowerCase() + " sanó a un "+ persona.clase.toLowerCase() + "!");
			else
				System.out.println("Un " + this.clase.toLowerCase() + " sanó a "+ persona.getNombre() + "!");
		}
		else {
			if(persona.getNombre() == null || persona.getNombre().isBlank())
				System.out.println(this.nombre + " sanó a un "+ persona.clase.toLowerCase() + "!");
			else
				System.out.println(this.nombre + " sanó a "+ persona.getNombre() + "!");
		}
		
		persona.health += this.intelligence;
	}
	
}
