package com.work.calculo.reporsitorio;

import com.work.calculo.entidad.Servicio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServicioRepository extends JpaRepository<Servicio, String> {
}
