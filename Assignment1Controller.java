package com.example.assignment1springnasaapod.apodHandling;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
public class Assignment1Controller
{

    private ApodService apodService = null;

    public Assignment1Controller(ApodService apodService)
    {
        this.apodService = apodService;
    }

    @GetMapping("/apod/{date}")
    public Apod getApod(@PathVariable @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate date)
    {
        return apodService.getApod(date);
    }
}
