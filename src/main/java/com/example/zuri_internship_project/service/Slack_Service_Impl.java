package com.example.zuri_internship_project.service;



import com.example.zuri_internship_project.data.model.Slack;
import org.springframework.stereotype.Service;

import static com.example.zuri_internship_project.utils.Mapper.map;
@Service
public class Slack_Service_Impl {
    public Slack getSlackInformation(String slack_name, String track) {
        return map(slack_name,track);
    }
}
