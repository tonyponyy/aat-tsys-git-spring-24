package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.Empleado;
import com.example.demo.dto.Empleado.Trabajo;
import com.example.demo.services.EmpleadoServiceImpl;

@RestController
@RequestMapping("/empleados")
public class EmpleadoController {

	@Autowired
	EmpleadoServiceImpl EmpleadoServideImpl;
	
	@GetMapping("/all")
	public List<Empleado> listarEmpleados(){
		return EmpleadoServideImpl.listarEmpleados();
	}
	
	@GetMapping("/trabajo/{trabajo}")
	public List<Empleado> listarPorTrabajo(@PathVariable(name="trabajo") String string_trabajo_trabajo) {
		Trabajo trabajo = Trabajo.valueOf(string_trabajo_trabajo);
	    return EmpleadoServideImpl.listarPorTrabajo(trabajo);
	}
	
	@PostMapping("/add")
	public Empleado salvarEmpleado(@RequestBody Empleado Empleado) {
		int sueldo = Empleado.devolver_salario(Empleado.getTrabajo());
		Empleado.setSueldo(sueldo);
		return EmpleadoServideImpl.guardarEmpleado(Empleado);
	}
	
	
	@GetMapping("/{id}")
	public Empleado EmpleadoXID(@PathVariable(name="id") Integer id) {
		
		Empleado Empleado_xid= new Empleado();
		
		Empleado_xid=EmpleadoServideImpl.empleadoXID(id);
		
		System.out.println("Empleado XID: "+Empleado_xid);
		
		return Empleado_xid;
	}
	
	@PutMapping("/{id}")
	public Empleado actualizarEmpleado(@PathVariable(name="id")Integer id,@RequestBody Empleado Empleado) {
		
		Empleado Empleado_seleccionado= new Empleado();
		Empleado Empleado_actualizado= new Empleado();
		
		Empleado_seleccionado= EmpleadoServideImpl.empleadoXID(id);
		
		Empleado_seleccionado.setNombre(Empleado.getNombre());
		Empleado_seleccionado.setApellido(Empleado.getApellido());
		Empleado_seleccionado.setDireccion(Empleado.getDireccion());
		Empleado_seleccionado.setDni(Empleado.getDni());
		Empleado_seleccionado.setFecha(Empleado.getFecha());
		
		Empleado_actualizado = EmpleadoServideImpl.actualizarEmpleado(Empleado_seleccionado);
		
		System.out.println("El Empleado actualizado es: "+ Empleado_actualizado);
		
		return Empleado_actualizado;
	}
	
	@DeleteMapping("/{id}")
	public void eliminarEmpleado(@PathVariable(name="id")Integer id) {
		EmpleadoServideImpl.eliminarEmpleado(id);
		System.out.println("Empleado eliminado");
	}
	
	
}