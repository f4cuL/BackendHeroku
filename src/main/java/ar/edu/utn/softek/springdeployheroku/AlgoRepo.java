package ar.edu.utn.softek.springdeployheroku;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AlgoRepo extends JpaRepository<Algo,Long> {

    public List<Algo> findAlgoByNombre(String nombre);

}
