package ar.edu.unlam.pb2.practica;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Persona {
   
	
	private String nombre;
	   private Integer dni;
	   private char sexo;
	   private Double peso;
	   private Double altura;
	   private String fechaDeNacimiento;
	   private Integer PESOIDEAL=0;
	   private Integer SOBREPESO=1;
	   private Integer DEBAJODESUPESO=-1;
	
	public Persona() {
		super();
	}


	public Persona(String nombre, Integer dni, char sexo, Double peso, Double altura, String fechaDeNacimiento) {
		super();
		this.nombre = nombre;
		this.dni = dni;
		this.sexo = sexo;
		this.peso = peso;
		this.altura = altura;
		this.fechaDeNacimiento = fechaDeNacimiento;
	}
	
	
	public Persona(String nombre, char sexo, String fechaDeNacimiento) {
		super();
		this.nombre = nombre;
		this.sexo = sexo;
		this.fechaDeNacimiento = fechaDeNacimiento;
	}
	
	public Integer calcularIMC(){
		
		Double imc = peso/(altura*altura);
		
		if(imc < 20){
			return DEBAJODESUPESO;
		}
		if(imc >=20 && imc <=25){
			return PESOIDEAL;
		}
		
			return SOBREPESO;
		
		
	}
	
	public Boolean esMayorDeEdad(){
	DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	LocalDate fechaNac  =    LocalDate.parse(fechaDeNacimiento,fmt);
	LocalDate hoy = LocalDate.now();
	
	Period edad =Period.between(fechaNac, hoy);
	
	if(edad.getYears()>17){
		return true;
	}
	return false;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Integer getDni() {
		return dni;
	}
	public void setDni(Integer dni) {
		this.dni = dni;
	}
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	public Double getPeso() {
		return peso;
	}
	public void setPeso(Double peso) {
		this.peso = peso;
	}
	public Double getAltura() {
		return altura;
	}
	public void setAltura(Double altura) {
		this.altura = altura;
	}
	public String getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}
	public void setFechaDeNacimiento(String fechaDeNacimiento) {
		this.fechaDeNacimiento = fechaDeNacimiento;
	}

}
