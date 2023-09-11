package com.example.zuri_internship_project.data.model;
//@Getter
//@Setter
public class Slack {
    private String Slack_name;
    private String current_Day;
    private String current_utc;
    private String track;
    private String gitHub_file_url;
    private String gitHub_repo_url;
    private int status_code;

    public String getSlack_name() {
        return Slack_name;
    }

    public void setSlack_name(String slack_name) {
        Slack_name = slack_name;
    }

    public String getCurrent_Day() {
        return current_Day;
    }

    public void setCurrent_Day(String current_Day) {
        this.current_Day = current_Day;
    }

    public String getCurrent_utc() {
        return current_utc;
    }

    public void setCurrent_utc(String current_utc) {
        this.current_utc = current_utc;
    }

    public String getTrack() {
        return track;
    }

    public void setTrack(String track) {
        this.track = track;
    }

    public String getGitHub_file_url() {
        return gitHub_file_url;
    }

    public void setGitHub_file_url(String gitHub_file_url) {
        this.gitHub_file_url = gitHub_file_url;
    }

    public String getGitHub_repo_url() {
        return gitHub_repo_url;
    }

    public void setGitHub_repo_url(String gitHub_repo_url) {
        this.gitHub_repo_url = gitHub_repo_url;
    }

    public int getStatus_code() {
        return status_code;
    }

    public void setStatus_code(int status_code) {
        this.status_code = status_code;
    }

    @Override
    public String toString() {
        return "Slack{" +
                "Slack_name='" + Slack_name + '\'' +
                ", current_Day='" + current_Day + '\'' +
                ", current_utc='" + current_utc + '\'' +
                ", track='" + track + '\'' +
                ", gitHub_file_url='" + gitHub_file_url + '\'' +
                ", gitHub_repo_url='" + gitHub_repo_url + '\'' +
                ", status_code=" + status_code +
                '}';
    }
}

