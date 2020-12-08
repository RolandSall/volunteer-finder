package com.example.volunteerfinder.services.event;


import com.example.volunteerfinder.models.Organization;

import java.util.ArrayList;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@ToString
public class UpdateEventRequest {
    private String eventId;
    private Organization organization;
    private String title;
    private String description;
    private String location;
    private String postedDate;
    private String eventDate;
    private String image;
    private int capacity;
    private ArrayList<String> participants;
}
