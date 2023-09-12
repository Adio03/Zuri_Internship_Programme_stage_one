package com.example.zuri_internship_project.data.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Slack {
    private String slack_name;
    private String current_Day;
    private String current_utc;
    private String track;
    private String gitHub_file_url;
    private String gitHub_repo_url;
    private int status_code;

}

