package com.mfundoza.mpilomed.models;

import java.time.*;

public class Appointment {
    private int id;
    private LocalDate date;
    private LocalTime time;
    private int repeatsEveryXDays;
    private Urgency urgency;

    public Appointment() {
    }

    public Appointment(LocalDate date, LocalTime time) {
        this.date = date;
        this.time = time;
    }

    public Appointment(LocalDate date, LocalTime time, int repeatsEveryXDays, Urgency urgency) {
        this.date = date;
        this.time = time;
        this.repeatsEveryXDays = repeatsEveryXDays;
        this.urgency = urgency;
    }

    public Appointment(int id, LocalDate date, LocalTime time, int repeatsEveryXDays, Urgency urgency) {
        this.id = id;
        this.date = date;
        this.time = time;
        this.repeatsEveryXDays = repeatsEveryXDays;
        this.urgency = urgency;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    public int getRepeatsEveryXDays() {
        return repeatsEveryXDays;
    }

    public void setRepeatsEveryXDays(int repeatsEveryXDays) {
        this.repeatsEveryXDays = repeatsEveryXDays;
    }

    public Urgency getUrgency() {
        return urgency;
    }

    public void setUrgency(Urgency urgency) {
        this.urgency = urgency;
    }
}
