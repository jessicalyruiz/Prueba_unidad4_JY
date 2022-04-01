package ec.edu.uce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ec.edu.uce.repository.modelo.CitaMedica;
import ec.edu.uce.service.ICitaMedicaService;

@Controller
@RequestMapping("/citas/")
public class CitaMedicaController {

	@Autowired
	private ICitaMedicaService citaService;
	
	// primer metodo para agendar cita
		@GetMapping("agendarCita")
		public String obtenerPaginaIngresoDatos(CitaMedica cita) {
			return "agendarCita";

		}

		// segundo metodo para agendar cita
		@GetMapping("mostrar/citaAgendada")
		public String mostrarCitaMedica(CitaMedica cita, Model modelom) {
			this.citaService.agendarCita(cita.getNumero(), cita.getFechaCita(), cita.getValor(), cita.getLugar(), cita.getDoctor().getCedula(), cita.getPaciente().getCedula());
			modelom.addAttribute("cita", cita);
			return "mostrarCita";

		}

	
}
