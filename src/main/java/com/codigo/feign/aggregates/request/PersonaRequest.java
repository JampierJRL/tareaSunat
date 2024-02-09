package com.codigo.feign.aggregates.request;


//personarequest nos sirve para ver que datos nos va enviar el body

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PersonaRequest {

    private String tipoDoc;
    private String numDoc;

}
