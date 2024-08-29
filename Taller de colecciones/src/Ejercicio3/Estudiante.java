package Ejercicio3;

import Ejercicio1.Persona;

public class Estudiante extends Persona  {
	 private String matricula;

	    public Estudiante(String nombre, int edad, String genero, String matricula) {
	        super(nombre, edad, genero);
	        this.matricula = matricula;
	    }

	    public String getMatricula() {
	        return matricula;
	    }

	    @Override
	    public String toString() {
	        return "Estudiante{" +
	                "nombre='" + getNombre() + '\'' +
	                ", edad=" + getEdad() +
	                ", genero='" + getGenero() + '\'' +
	                ", matricula='" + matricula + '\'' +
	                '}';
	    }
	}

