package com.luv2code.mycoolapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Value;

@RestController
public class FunRestController {

    @Value("${coach.name}")
    private String coachName;

    @Value("${team.name}")
    private String teamName;

    // Expose "/" that returns "Hello World"
    @GetMapping("/")
    public String sayHello() {
        return "Hello World!";
    }

    @GetMapping("/teaminfo")
    public String getTeamInfo() {
        return "Coach Name: " + coachName + " , Team Name: " + teamName;
    }

    @GetMapping("/workout")
    public String getDailyWorkout() {
        return "Run a hard 5k!";
    }
}

