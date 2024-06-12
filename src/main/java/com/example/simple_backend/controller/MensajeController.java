package com.example.simple_backend.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

public class MensajeController {

    private static final Logger logger = LoggerFactory.getLogger(MensajeController.class);

    @PostMapping("/mensaje")
    public void recibirMensaje(@RequestBody String mensaje) {
        logger.info("Mensaje recibido: " + mensaje);
    }

}
