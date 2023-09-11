package com.example.zuri_internship_project.service;


import com.example.zuri_internship_project.data.model.Slack;

public interface Slack_Service {
    Slack getSlackInformation(String slack_name, String track);
}
