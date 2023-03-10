package com.work.calculo.controler;

import com.work.calculo.entidad.Servicio;
import com.work.calculo.service.ServicioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/servicio")
public class servicioController {

    @Autowired
    ServicioService servicioService;

    @PostMapping("/crear")
    public Servicio crearServicio(@RequestBody Servicio servicio){
        return servicioService.crearServicio(servicio);
    }
    @GetMapping("/listar")
    public List<Servicio> listarServicio(){
        return servicioService.listarServicio();
    }

    @GetMapping("/servicio/{id}")
    public ResponseEntity<Servicio> consultar(@PathVariable String id){
        try {
            Servicio servicio= servicioService.consultarServicio(id);
            return new ResponseEntity<Servicio>(servicio, HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<Servicio>(HttpStatus.NOT_FOUND);
        }
    }

}
