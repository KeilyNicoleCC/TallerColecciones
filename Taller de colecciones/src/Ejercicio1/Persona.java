package Ejercicio1;

import java.util.Objects;

public class Persona implements Comparable<Persona> {
	private String nombre;
    private int edad;
    private String genero;

    public Persona(String nombre, int edad, String genero) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getGenero() {
        return genero;
    }

    @Override
    public int compareTo(Persona otraPersona) {
        // Ordenar por edad
        // return this.edad - o.getEdad();

        // Ordenar por nombre
        return this.nombre.compareTo(otraPersona.getNombre());
    }

    @Override
    public String toString() {
        return "Persona{" +
               "nombre='" + nombre + '\'' +
               ", edad=" + edad +
               ", genero='" + genero + '\'' +
               '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persona persona = (Persona) o;
        return edad == persona.edad && Objects.equals(nombre, persona.nombre) && Objects.equals(genero, persona.genero);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, edad, genero);
    }
   
}



