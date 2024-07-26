package com.ubicuosoft.dashboardservice.model.common.client.serviceStatuses;

public interface IServiceStatuses {

    Boolean getAccountsServiceStatus();

    Boolean getDevicesServiceStatus();

    Boolean getHelpCenterServiceStatus();

    Boolean getLocationsServiceStatus();

    Boolean getReportServiceStatus();

    Boolean getSettingsServiceStatus();

    Boolean getSharedServiceStatus();

    boolean getServiceStatuses();
}

