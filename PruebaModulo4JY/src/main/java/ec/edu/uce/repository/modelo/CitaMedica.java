package ec.edu.uce.repository.modelo;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "cita_medica")
public class CitaMedica {

	@Id
	@Column(name = "cime_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_cimente")
	@SequenceGenerator(name = "seq_cimente", sequenceName = "seq_cimente", allocationSize = 1)
	private Integer id;
	

	@Column(name = "cime_numero")
	private String numero;
	
	
	@Column(name = "cime_fecha_cita", columnDefinition = "TIMESTAMP")
	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
	private LocalDateTime fechaCita;
	
	@Column(name = "cime_valor_cita")
	private BigDecimal valor;
	
	@Column(name = "cime_lugar_cita")
	private String lugar;
	
	@Column(name = "cime_diagnostico")
	private String diagnostico;
	
	@Column(name = "cime_receta")
	private String receta;
	
	@Column(name = "cime_fecha_control", columnDefinition = "TIMESTAMP")
	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
	private LocalDateTime fechaControl;
	
	
	@ManyToOne( cascade = CascadeType.ALL)
	@JoinColumn(name="cime_fk_doctor")
	private Doctor doctor;
	
	@ManyToOne( cascade = CascadeType.ALL)
	@JoinColumn(name="cime_fk_paciente")
	private Paciente paciente;

	//GET Y SET
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}



	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public String getLugar() {
		return lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	public String getDiagnostico() {
		return diagnostico;
	}

	public void setDiagnostico(String diagnostico) {
		this.diagnostico = diagnostico;
	}

	public String getReceta() {
		return receta;
	}

	public void setReceta(String receta) {
		this.receta = receta;
	}



	public Doctor getDoctor() {
		return doctor;
	}

	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public LocalDateTime getFechaCita() {
		return fechaCita;
	}

	public void setFechaCita(LocalDateTime fechaCita) {
		this.fechaCita = fechaCita;
	}

	public LocalDateTime getFechaControl() {
		return fechaControl;
	}

	public void setFechaControl(LocalDateTime fechaControl) {
		this.fechaControl = fechaControl;
	}

	@Override
	public String toString() {
		return "CitaMedica [id=" + id + ", numero=" + numero + ", fechaCita=" + fechaCita + ", valor=" + valor
				+ ", lugar=" + lugar + ", diagnostico=" + diagnostico + ", receta=" + receta + ", fechaControl="
				+ fechaControl + "]";
	}


	
	
}
