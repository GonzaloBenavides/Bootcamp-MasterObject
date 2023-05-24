package cl.gonzalobenavides.masterobject.human;

public class Samurai extends Humano{
	protected Integer kills;
	
	public Samurai() {
		super();
		this.health = 200;
		this.clase = "Samurai";
		kills = 0;
	}
	
	public Integer howMany() {
		return kills;
	}
	
	public void deathBlow(Humano persona) {
		if(!isAlive()) {
			if(this.getNombre() == null || this.getNombre().isBlank())
				System.out.println("Un " + this.clase.toLowerCase() + " no puede realizar acciones ya que ha muerto!");
			else
				System.out.println(this.nombre + " no puede realizar acciones ya que ha muerto!");
			return;
		}
		
		
		if(this.nombre == null || this.nombre.isBlank()) {
			if(persona.getNombre() == null || persona.getNombre().isBlank())
				System.out.println("Un " + this.clase.toLowerCase() + " acabó con la vida de un "+ persona.clase.toLowerCase() + "!");
			else
				System.out.println("Un " + this.clase.toLowerCase() + " acabó con la vida de "+ persona.getNombre() + "!");
		}
		else {
			if(persona.getNombre() == null || persona.getNombre().isBlank())
				System.out.println(this.nombre + " acabó con la vida de un "+ persona.clase.toLowerCase() + "!");
			else
				System.out.println(this.nombre + " acabó con la vida de "+ persona.getNombre() + "!");
		}
		
		persona.health = 0;
		this.health -= (this.health/2);
		this.kills++;
	}
	
	public void meditate() {
		if(!isAlive()) {
			if(this.getNombre() == null || this.getNombre().isBlank())
				System.out.println("Un " + this.clase.toLowerCase() + " no puede realizar acciones ya que ha muerto!");
			else
				System.out.println(this.nombre + " no puede realizar acciones ya que ha muerto!");
			return;
		}
		
		if(this.nombre == null || this.nombre.isBlank()) {
			System.out.println("Un samurai medita!");
		}
		else
			System.out.println(this.nombre + " medita!");
		
		this.health += (this.health/2);
	}
	
}
