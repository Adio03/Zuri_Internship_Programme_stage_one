package com.example.zuri_internship_project.utils;

import com.example.zuri_internship_project.data.model.Slack;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

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
        Date date =new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        DateFormat formatter = new SimpleDateFormat("EEEE");
        return  formatter.format(date);
    }
    private static String get_Actual_Time(){
        Date date = new Date();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss 'Z'");
        format.setTimeZone(TimeZone.getTimeZone("UTC"));
        return format.format(date);
    }
}

