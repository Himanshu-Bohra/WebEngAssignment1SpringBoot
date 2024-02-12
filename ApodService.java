package com.example.assignment1springnasaapod.apodHandling;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.boot.web.client.RestTemplateBuilder;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Service
public class ApodService
{

    // API key from https://api.nasa.gov/
    private static final String API_KEY = "Eshc6SGaERpVafvFE71XDMWAVTzecUzPLjgY9IGG";
    private static final String BASE_URL = "https://api.nasa.gov/planetary/apod";
    private static final DateTimeFormatter DATE_FORMAT = DateTimeFormatter.ofPattern("yyyy-MM-dd");

    private final RestTemplate restTemplate;

    public ApodService(RestTemplateBuilder builder)
    {
        this.restTemplate = builder.build();
    }

    public Apod getApod(LocalDate date)
    {
        String url = BASE_URL + "?api_key=" + API_KEY + "&date=" + date.format(DATE_FORMAT);
        return restTemplate.getForObject(url, Apod.class);
    }
}
