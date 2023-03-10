package com.work.calculo.service;

import com.work.calculo.entidad.Servicio;
import com.work.calculo.reporsitorio.ServicioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicioService {
    @Autowired
    ServicioRepository servicioRepository;
    public Servicio crearServicio(Servicio nuevoServicio) {
        return servicioRepository.save(nuevoServicio);
    }
    public List<Servicio> listarServicio(){
        return servicioRepository.findAll();
    }

    public Servicio consultarServicio(String id){
        return servicioRepository.findById(id).orElse(null);
    }



}
