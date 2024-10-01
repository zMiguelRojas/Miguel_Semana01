/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Registroalum;

/**
 *
 * @author USER 17
 */
import java.util.ArrayList;

public class GestorArraylist {
    private ArrayList<Alumnos> listaAlumnos;

    public GestorArraylist() {
        listaAlumnos = new ArrayList<>();
    }

    // Método para agregar un alumno
    public void agregarAlumno(Alumnos alumno) {
        listaAlumnos.add(alumno);
    }

    // Método para obtener todos los alumnos
    public ArrayList<Alumnos> obtenerAlumnos() {
        return listaAlumnos;
    }

    // Método para actualizar un alumno
    public boolean actualizarAlumno(int index, Alumnos alumno) {
        if (index >= 0 && index < listaAlumnos.size()) {
            listaAlumnos.set(index, alumno);
            return true;
        }
        return false;
    }

    // Método para eliminar un alumno
    public boolean eliminarAlumno(int index) {
        if (index >= 0 && index < listaAlumnos.size()) {
            listaAlumnos.remove(index);
            return true;
        }
        return false;
    }

    // Método para buscar un alumno por nombre
    public Alumnos buscarAlumnoPorNombre(String nombre) {
        for (Alumnos alumno : listaAlumnos) {
            if (alumno.getNombre().equalsIgnoreCase(nombre)) {
                return alumno;
            }
        }
        return null; // Si no se encuentra el alumno
    }
}
