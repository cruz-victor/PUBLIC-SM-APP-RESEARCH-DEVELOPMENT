package com.ubicuosoft.dashboardservice.model.common.constant;

public class HttpStatusMessages {
    public static final String OK ="200 ACEPTADO: La solicitud se completó correctamente.";
    public static final String CREATED ="201 CREADO: El recurso se ha creado exitosamente.";
    public static final String ACCEPTED ="202 ACEPTADO PERO NO COMPLETADO: La solicitud ha sido aceptada para procesamiento, pero aún no se ha completado.";
    public static final String NO_CONTENT ="204 SIN CONTENIDO: La solicitud se procesó correctamente, pero no hay contenido para mostrar.";
    public static final String BAD_REQUEST ="400 SOLICITUD INCORRECTA: La solicitud no pudo ser procesada debido a datos incorrectos o incompletos.";
    public static final String UNAUTHORIZED ="401 NO AUTORIZADO: Acceso no autorizado. Debes iniciar sesión para acceder a este recurso.";
    public static final String FORBIDDEN ="403 PROHIBIDO: Acceso denegado. No tienes permisos para acceder a este recurso.";
    public static final String NOT_FOUND ="404 NO ENCONTRADO: El recurso solicitado no pudo ser encontrado en el servidor.";
    public static final String CONFLICT ="409 CONFLICTO. La solicitud no pudo completarse debido a un conflicto con el estado actual del recurso.";
    public static final String INTERNAL_SERVER_ERROR ="500 ERROR INTERNO DEL SERVIDOR: Ocurrió un error interno en el servidor. Por favor, inténtal.";
}
