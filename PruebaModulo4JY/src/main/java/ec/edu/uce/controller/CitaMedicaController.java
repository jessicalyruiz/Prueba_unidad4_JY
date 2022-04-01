package ec.edu.uce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

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

		
		//primer metodo para actualizar
		
		@GetMapping("citaActualiza/{numCita}")
		public String  obtenerPaginaActualizarCita(@PathVariable("numCita") String numCita, CitaMedica cita, Model modelo) {
			CitaMedica citaMedica=this.citaService.buscarNumero(numCita);
			modelo.addAttribute("cita", citaMedica);
			return "citaActualiza";
			
		}
		
		@PutMapping("actualizar/{numCita}")
		public String actalizarCita(@PathVariable("numCita") String numCita, CitaMedica citaMedica, BindingResult result, Model modelo, RedirectAttributes redirectAttributes) {
			citaMedica.setNumero(numCita);
			this.citaService.update(citaMedica);
			return "actualizaMsj";
		}
		
		
	
}
