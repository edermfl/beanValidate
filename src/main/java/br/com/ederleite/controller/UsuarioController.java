package br.com.ederleite.controller;

import br.com.ederleite.model.Sexo;
import br.com.ederleite.model.Usuario;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;
import java.util.Arrays;

/**
 * Created by eml on 16/11/16.
 */
@Controller
@RequestMapping("/usuarios")
public class UsuarioController {

    @RequestMapping(value = "/novo", method = RequestMethod.GET)
    public ModelAndView novo(Usuario pUsuario) {
	ModelAndView mv = new ModelAndView("CadastroUsuario");
	mv.addObject("sexos", Arrays.asList(Sexo.values()));
	return mv;
    }

    @RequestMapping(value = "/novo", method = RequestMethod.POST)
    public ModelAndView salvar(@Valid Usuario cliente, BindingResult result
		    , RedirectAttributes attributes) {
	if (result.hasErrors()) {
	    return novo(cliente);
	}

	ModelAndView mv = new ModelAndView("redirect:/usuarios/novo");
	attributes.addFlashAttribute("mensagem", "Cliente salvo com sucesso.");
	return mv;
    }
}
