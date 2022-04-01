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
@Table(name = "doctor")
public class Doctor {

	@Id
	@Column(name = "doct_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_doctor")
	@SequenceGenerator(name = "seq_doctor", sequenceName = "seq_doctor", allocationSize = 1)
	private Integer id;
	

	@Column(name = "doct_apellido")
	private String apellido;
	
	@Column(name = "doct_nombre")
	private String nombre;
	
	@Column(name = "doct_cedula")
	private String cedula;

	@Column(name = "doct_fecha_nacimiento", columnDefinition = "TIMESTAMP")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate fechaNacimiento;
	
	@Column(name = "doct_numero_consultorio")
	private Integer numeroConsultorio;
	
	@Column(name = "doct_codigo_senescyt")
	private String codigoSenescyt;
	
	@Column(name = "doct_sueldo")
	private BigDecimal sueldo;
	
	@OneToMany(mappedBy = "doctor")
	private List<CitaMedica> citas;

	//get y set
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

	public Integer getNumeroConsultorio() {
		return numeroConsultorio;
	}

	public void setNumeroConsultorio(Integer numeroConsultorio) {
		this.numeroConsultorio = numeroConsultorio;
	}

	public String getCodigoSenescyt() {
		return codigoSenescyt;
	}

	public void setCodigoSenescyt(String codigoSenescyt) {
		this.codigoSenescyt = codigoSenescyt;
	}

	public BigDecimal getSueldo() {
		return sueldo;
	}

	public void setSueldo(BigDecimal sueldo) {
		this.sueldo = sueldo;
	}

	public List<CitaMedica> getCitas() {
		return citas;
	}

	public void setCitas(List<CitaMedica> citas) {
		this.citas = citas;
	}

	@Override
	public String toString() {
		return "Doctor [id=" + id + ", apellido=" + apellido + ", nombre=" + nombre + ", cedula=" + cedula
				+ ", fechaNacimiento=" + fechaNacimiento + ", numeroConsultorio=" + numeroConsultorio
				+ ", codigoSenescyt=" + codigoSenescyt + ", sueldo=" + sueldo + "]";
	}
	
	
	
}
