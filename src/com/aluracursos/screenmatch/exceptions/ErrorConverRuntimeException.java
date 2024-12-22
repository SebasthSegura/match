package com.aluracursos.screenmatch.exceptions;

public class ErrorConverRuntimeException extends RuntimeException{
    private String mensaje;

    public ErrorConverRuntimeException(String mensaje){
        this.mensaje = mensaje;
    }

    @Override
    public String getMessage() {
            return this.mensaje;
    }
}
