package ar.edu.utn.softek.springdeployheroku;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "${FRONTORIGIN:http://localhost:3000}")
public class HolaMundoController {

    @Autowired
    AlgoRepo repo;

    @GetMapping("/hola")
    public String hola(){
        return "hola";
    }

    @GetMapping("/algo")
    public List<Algo> algo(){
        return repo.findAll();
    }

}
