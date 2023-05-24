package cl.gonzalobenavides.masterobject.main;

import cl.gonzalobenavides.masterobject.human.Humano;
import cl.gonzalobenavides.masterobject.human.Ninja;
import cl.gonzalobenavides.masterobject.human.Samurai;
import cl.gonzalobenavides.masterobject.human.Wizard;

public class HumanTest {
	public static void main(String[] args) {
		System.out.println("========== HUMANOS =========");
		Humano humano1 = new Humano();
		humano1.setNombre("Gonzalo");
		humano1.displayHumano();
		
		Humano humano2 = new Humano();
		humano2.setNombre("Ignacio");
		humano2.displayHumano();
		
		Humano humano3 = new Humano();
		humano3.displayHumano();
		
		System.out.println("========== ACCIONES =========");
		humano1.atacar(humano2);
		humano2.atacar(humano1);
		humano1.atacar(humano2);
		humano3.atacar(humano2);
		
		humano1.displayHumano();
		humano2.displayHumano();
		humano3.displayHumano();
		
		
		System.out.println("========== CLASES =========");
		Samurai samurai1 = new Samurai();
		samurai1.setNombre("Hanzo");
		
		Ninja ninja1 = new Ninja();
		
		Wizard wiz1 = new Wizard();
		
		samurai1.displayHumano();
		ninja1.displayHumano();
		wiz1.displayHumano();
		
		System.out.println("========== ACCIONES 2 =========");
		
		humano2.atacar(samurai1);
		humano2.atacar(samurai1);
		humano2.atacar(samurai1);
		samurai1.deathBlow(humano2);
		samurai1.deathBlow(humano3);
		humano2.atacar(samurai1);
		
		ninja1.atacar(wiz1);
		ninja1.steal(wiz1);
		ninja1.steal(wiz1);
		
		wiz1.fireBall(ninja1);
		wiz1.heal(humano1);
		ninja1.runAway();
		samurai1.meditate();
		
		System.out.println("========== ESTADOS FINALES =========");
		humano1.displayHumano();
		humano2.displayHumano();
		humano3.displayHumano();
		samurai1.displayHumano();
		ninja1.displayHumano();
		wiz1.displayHumano();
		
		
		System.out.println(samurai1.getNombre() + " ha acabado con "+ samurai1.howMany() +" vidas");
	}
}
