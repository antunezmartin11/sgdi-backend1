package com.senamhi.sgdibackend.util;
import io.sentry.Sentry;
public class responseService {

    public String mensajeError;
    public Boolean estado;
    public Object content;

    public responseService()
    {
        estado = true;
    }

    public responseService(String mensajeError, Boolean estado, Object content)
    {
        this.mensajeError = mensajeError;
        this.estado = estado;
        this.content = content;
    }

    public String GetMensajeDeError(Exception ex)
    {
        return "\nMensaje:" + ex.getMessage();
    }

    public void SetException(Exception ex)
    {
        this.estado = false;
        this.mensajeError = GetMensajeDeError(ex);
        Sentry.captureException(ex);
    }
    public void SetMensajeError(String mensaje)
    {
        this.estado = false;
        this.mensajeError = mensaje;
    }
}