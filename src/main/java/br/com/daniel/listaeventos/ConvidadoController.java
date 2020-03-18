package br.com.daniel.listaeventos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

//import br.com.daniel.enviadorEmail.enviadorEmail.EmailService;
import br.com.daniel.listaeventos.model.Convidado;
import br.com.daniel.listaeventos.repository.ConvidadoRepository;

@Controller
public class ConvidadoController {

	@Autowired
	private ConvidadoRepository repository;
	
	@RequestMapping("/")
	public String index() {
		return "index";
	}
	
	@RequestMapping("listaconvidados")
	public String listaConvidados(Model model){
	    Iterable<Convidado> convidados = repository.findAll();
	    model.addAttribute("convidados", convidados);
	    return "listaconvidados";
	}
	

	@SuppressWarnings("unlikely-arg-type")
	@RequestMapping(value= "salvar", method = RequestMethod.POST)
	public String salvar(@RequestParam("nome") String nome, @RequestParam("email") String email, @RequestParam("telefone") String telefone, Model model) {

		Convidado novoConvidado = new Convidado(nome, email, telefone);
		Iterable<Convidado> convidadosCheck = repository.findAll();
		if (!convidadosCheck.equals(novoConvidado))
			repository.save(novoConvidado);
		
//		String emailOrigem = "daniel.andradesantos88@gmail.com";
//		String titulo = "Você foi convidado pelo Lista Eventos";
//		String mensagem = "Olá " + nome + ". Você acaba de ser convidado pelo Lista Eventos.";		
//		new EmailService().enviar(emailOrigem, email, titulo, mensagem);

		Iterable<Convidado> convidados = repository.findAll();
		model.addAttribute("convidados", convidados);
		return "listaconvidados";
	}
	
	@RequestMapping("remover")
	public String remover(@RequestParam("id") Long id, Model model) {		
		repository.deleteById(id);		
		Iterable<Convidado> convidados = repository.findAll();
		model.addAttribute("convidados", convidados);
		return "listaconvidados";
	}
}
