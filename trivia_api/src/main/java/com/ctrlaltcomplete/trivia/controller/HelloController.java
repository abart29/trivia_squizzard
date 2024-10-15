package com.ctrlaltcomplete.trivia.controller;

import jakarta.servlet.http.HttpSession;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloController {

    @GetMapping("/")
    public String sayHello(HttpSession session) {
        return "<html>" +
                "<body>" +
                "<h1>Welcome young Quizzard!</h1>" +
                "<p>Session ID: " + session.getId() + "</p>" +
                "<p><strong>Welcome to Quiznados!</strong></p>" +
                "<p>Well done on logging in and creating your profile.</p>" +
                "<p>When ready, click <strong>begin</strong> to start your journey to become a quizzard.</p>" +
                "<p>Alternatively, see your score on the <strong>leaderboard</strong>.</p>" +
                "<p>Stay tuned for new changes soon!</p>" +
                "<button>Begin</button>" +
                "<button>Leaderboard</button>" +
                "</body>" +
                "</html>";
    }

    @GetMapping("/game-on")
    public String begin() {
        return "game-on";
    }


 @GetMapping("/leaderboard")
    public String leaderboard() {
        return "leaderboard";
    }

}
