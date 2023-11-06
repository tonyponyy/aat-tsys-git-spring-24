package com.example.demo.dto;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Empleado")
public class Empleado {

	public enum Trabajo {
		PROGRAMADOR, DISEÑADOR, ASISTENCIA
	}

	// Atributos de la clase
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "nombre") // no es del todo necesario
	private String nombre;
	private String apellido;
	private String direccion;
	private int dni;
	private Trabajo trabajo;
	private int sueldo;
	private Date fecha;

	public int devolver_salario(Trabajo trabajo) {
		int sueldo = 0;
		switch (trabajo) {
		case PROGRAMADOR: {
			sueldo = 1900;
			break;
		}
		case DISEÑADOR: {
			sueldo = 800;
			break;
		}
		case ASISTENCIA: {
			sueldo = 600;
			break;
		}
		default:
			sueldo = 1200;
			break;
		}
		return sueldo;
	}

	// Constructores de clase
	public Empleado() {

	}

	public Empleado(int id, String nombre, Trabajo trabajo, String apellido, String direccion, int dni, Date fecha) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
		this.dni = dni;
		this.trabajo = trabajo;
		this.sueldo = devolver_salario(trabajo);
		this.fecha = fecha;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public int getSueldo() {
		return sueldo;
	}

	public void setSueldo(int sueldo) {
		this.sueldo = sueldo;
	}

	public Trabajo getTrabajo() {
		return trabajo;
	}

	public void setTrabajo(Trabajo trabajo) {
		this.trabajo = trabajo;
	}

	@Override
	public String toString() {
		return "Empleado [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", direccion=" + direccion
				+ ", dni=" + dni + ", trabajo=" + trabajo + ", sueldo=" + sueldo + ", fecha=" + fecha + "]";
	}

}
