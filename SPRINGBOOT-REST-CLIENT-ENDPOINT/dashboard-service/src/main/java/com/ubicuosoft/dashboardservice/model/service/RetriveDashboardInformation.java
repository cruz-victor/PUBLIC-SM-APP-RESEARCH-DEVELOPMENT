package com.ubicuosoft.dashboardservice.model.service;

import com.ubicuosoft.dashboardservice.model.dto.request.TutorialRequest.Tutorial;
import com.ubicuosoft.dashboardservice.model.dto.request.TutorialRequest.TutorialRequest;
import com.ubicuosoft.dashboardservice.model.dto.request.UserActionRequest.UserActionRequest;
import com.ubicuosoft.dashboardservice.model.dto.response.DashboardResponse.DashboardResponse;
import com.ubicuosoft.dashboardservice.model.dto.response.TutorialResponse.TutorialResponse;
import com.ubicuosoft.dashboardservice.model.service.client.WebClientService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class RetriveDashboardInformation {
    private final WebClientService webClientService;

    @Value("${webclient.help-center-service}")
    private String serverHelpCenter;

    public DashboardResponse execute() {
        System.out.println("-------SERVER HELP-CENTER-------");
        System.out.println(serverHelpCenter);

        System.out.println("-------GET------");
        Object response= webClientService.execute((serverHelpCenter+"/help-center/api/v2/tutorial"), HttpMethod.GET, "9096",Object.class, Object.class);

        System.out.println("-------Object------");
        System.out.println(response.toString());

        TutorialResponse tutorialResponse= webClientService.execute((serverHelpCenter+"/help-center/api/v2/tutorial"), HttpMethod.GET, "9096",Object.class, TutorialResponse.class);
        System.out.println("-------Tutorial Response------");
        System.out.println(tutorialResponse.getTutorials().get(0).getId());
        System.out.println(tutorialResponse.getTutorials().get(0).getModule());
        System.out.println(tutorialResponse.getTutorials().get(0).getDescription());

        System.out.println("-------POST------");
        Tutorial tutorial=new Tutorial();
        tutorial.setUrl("url vic");
        tutorial.setTitle("title vic");
        tutorial.setState("state vic");
        tutorial.setModule("module vic");
        tutorial.setDescription("description vic");

        UserActionRequest userActionRequest=new UserActionRequest();

        TutorialRequest tutorialRequest=new TutorialRequest();
        tutorialRequest.setTutorial(tutorial);
        tutorialRequest.setUserAction(userActionRequest);
        Object nada= webClientService.execute((serverHelpCenter+"/help-center/api/v2/tutorial"), HttpMethod.POST, "9096",tutorialRequest, Object.class);
        System.out.println(nada.toString());

        return null;
    }

}
