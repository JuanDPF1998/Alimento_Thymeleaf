package com.thymeleaft.Controlador;

import com.thymeleaft.Servicio.IAlimentosServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class AlimentosControlador {
    
    @Autowired
    private IAlimentosServicio alimentosServicio;
    
    @GetMapping("/lista")
    public String listarTodosAlimentos(Model model){
        model.addAttribute("alimentos", alimentosServicio.findAll());
        return "Alimentos";
    }
}
