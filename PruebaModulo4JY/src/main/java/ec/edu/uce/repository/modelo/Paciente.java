package ec.edu.uce.repository.modelo;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "paciente")
public class Paciente {

	@Id
	@Column(name = "paci_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_pacinte")
	@SequenceGenerator(name = "seq_pacinte", sequenceName = "seq_pacinte", allocationSize = 1)
	private Integer id;
	

	@Column(name = "paci_apellido")
	private String apellido;
	
	@Column(name = "paci_nombre")
	private String nombre;
	
	@Column(name = "paci_cedula")
	private String cedula;

	@Column(name = "paci_fecha_nacimiento", columnDefinition = "TIMESTAMP")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate fechaNacimiento;
	
	@Column(name = "paci_codigo_iess")
	private String codigoIess;
	
	@Column(name = "paci_estatura")
	private BigDecimal estatura;
	
	@Column(name = "paci_peso")
	private BigDecimal peso;
	
	@Column(name = "paci_edad")
	private Integer edad;
	
	@OneToMany(mappedBy = "paciente")
	private List<CitaMedica> citas;

	
	//GET Y SET
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getCodigoIess() {
		return codigoIess;
	}

	public void setCodigoIess(String codigoIess) {
		this.codigoIess = codigoIess;
	}

	public BigDecimal getEstatura() {
		return estatura;
	}

	public void setEstatura(BigDecimal estatura) {
		this.estatura = estatura;
	}

	public BigDecimal getPeso() {
		return peso;
	}

	public void setPeso(BigDecimal peso) {
		this.peso = peso;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public List<CitaMedica> getCitas() {
		return citas;
	}

	public void setCitas(List<CitaMedica> citas) {
		this.citas = citas;
	}

	@Override
	public String toString() {
		return "Paciente [id=" + id + ", apellido=" + apellido + ", nombre=" + nombre + ", cedula=" + cedula
				+ ", fechaNacimiento=" + fechaNacimiento + ", codigoIess=" + codigoIess + ", estatura=" + estatura
				+ ", peso=" + peso + ", edad=" + edad + "]";
	}
	
	
}
