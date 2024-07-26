package com.ubicuosoft.dashboardservice.model.service;

import com.ubicuosoft.dashboardservice.model.dto.response.DashboardResponse.ComparisonConsumption;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompareConsumptionLastTwoYearsService {
    public List<ComparisonConsumption> execute() {
//------------------------------------------------------------------------------------------------------------------------
//        6.    compareConsumptionLastTwoYears()
//                      Obtiene la compracion del consumo de agua/electricidad/gas de cada mediddor de los dos ultimos años. (MONGODB)

//                      select year(timestamp) as year, getYearColor(timestamp) as yearColor, sum(payload.decode(x).value) month_consuption as
//                      from message_collection_mongodb
//                      where message.event='LEER_LECTURA_CONSUMO_MEDIDOR' and message.payload.decode(x).key='LECTURA'

//    private Integer year;
//    private String yearColor;
//    private List<Integer> month;
        throw new UnsupportedOperationException();
    }
}
