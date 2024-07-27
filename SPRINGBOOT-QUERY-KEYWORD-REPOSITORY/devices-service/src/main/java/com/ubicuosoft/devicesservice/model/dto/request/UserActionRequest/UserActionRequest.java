
package com.ubicuosoft.devicesservice.model.dto.request.UserActionRequest;

import lombok.Data;

@Data
public class UserActionRequest {
    //Datos necesarios para enviar al endpoint: PUT /history del servicio: shared-service obtener el historial de cambios del registro.
    private User user;
    private Action action;
}
