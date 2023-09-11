package com.example.zuri_internship_project.utils;

import com.example.zuri_internship_project.data.model.Slack;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;

public class Mapper {
    public static Slack map(String slack_name, String track){
        Slack slack_Response = new Slack();
        slack_Response.setSlack_name(slack_name);
        slack_Response.setCurrent_Day(get_current_day());
        slack_Response.setCurrent_utc(get_Actual_Time());
        slack_Response.setTrack(track);
        slack_Response.setGitHub_file_url("https://github.com/Adio03/Zuri_Internship_Programme_Stage_One");
        slack_Response.setGitHub_repo_url("https://github.com/Adio03/Zuri_Internship_Programme_stage_one/tree/main/src/main/java/com/example/zuri_internship_project/controller");
        slack_Response.setStatus_code(200);
        return slack_Response;
    }
    private static String  get_current_day(){
        DayOfWeek current_Day= LocalDateTime.now().getDayOfWeek();
        return current_Day.getDisplayName(TextStyle.FULL, Locale.forLanguageTag("en-Ng"));
    }
    private static String get_Actual_Time(){
        LocalDateTime current_utc_Time = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        return current_utc_Time.format(formatter);

    }
}

