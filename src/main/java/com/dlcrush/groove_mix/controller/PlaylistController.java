package com.dlcrush.groove_mix.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api/v1/playlist")
public class PlaylistController {
    @GetMapping("/")
    public String list() {
        return "Hello, World!";
    }
}
