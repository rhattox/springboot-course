package com.luv2code.springcoredemo;

import org.springframework.stereotype.Component;

@Component
public class CrincketCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "Practice fas bowling for 15 minutes";
    }
}
