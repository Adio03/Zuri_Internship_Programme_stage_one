package com.example.zuri_internship_project.data.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Slack {
    private String slack_name;
    private String current_day;
    private String current_utc;
    private String track;
    private String github_file_url;
    private String github_repo_url;
    private int status_code;

}

