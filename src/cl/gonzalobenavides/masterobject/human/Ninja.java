package cl.gonzalobenavides.masterobject.human;

public class Ninja extends Humano{
	public Ninja() {
		super();
		this.stealth = 10;
		this.clase = "Ninja";
	}
	
	public void steal(Humano persona) {
		if(!isAlive()) {
			if(this.getNombre() == null || this.getNombre().isBlank())
				System.out.println("Un " + this.clase.toLowerCase() + " no puede realizar acciones ya que ha muerto!");
			else
				System.out.println(this.nombre + " no puede realizar acciones ya que ha muerto!");
			return;
		}
		
		
		if(this.nombre == null || this.nombre.isBlank()) {
			if(persona.getNombre() == null || persona.getNombre().isBlank())
				System.out.println("Un " + this.clase.toLowerCase() + " robó salud a un "+ persona.clase.toLowerCase() + "!");
			else
				System.out.println("Un " + this.clase.toLowerCase() + " robó salud a "+ persona.getNombre() + "!");
		}
		else {
			if(persona.getNombre() == null || persona.getNombre().isBlank())
				System.out.println(this.nombre + " robó salud a un "+ persona.clase.toLowerCase() + "!");
			else
				System.out.println(this.nombre + " robó salud a "+ persona.getNombre() + "!");
		}
		
		persona.health -= this.stealth;
		this.health += this.stealth;
	}
	
	public void runAway() {
		if(!isAlive()) {
			if(this.getNombre() == null || this.getNombre().isBlank())
				System.out.println("Un " + this.clase.toLowerCase() + " no puede realizar acciones ya que ha muerto!");
			else
				System.out.println(this.nombre + " no puede realizar acciones ya que ha muerto!");
			return;
		}
		
		if(this.nombre == null || this.nombre.isBlank()) {
			System.out.println("Un ninja huye!");
		}
		else
			System.out.println(this.nombre + " huye!");
		this.health -= 10;
	}
	
}
