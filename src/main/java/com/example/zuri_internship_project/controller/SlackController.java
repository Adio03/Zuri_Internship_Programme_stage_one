package com.example.zuri_internship_project.controller;



import com.example.zuri_internship_project.data.model.Slack;
import com.example.zuri_internship_project.service.Slack_Service_Impl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;



@RestController
public class SlackController {

    private final Slack_Service_Impl slackService;
    public SlackController(Slack_Service_Impl slackService){
        this.slackService = slackService;
    }
    @RequestMapping(value = "/api", method = RequestMethod.GET)
    public ResponseEntity<Slack> getParam(@RequestParam String slack_name, @RequestParam String track){
        Slack response= slackService.getSlackInformation(slack_name,track);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
