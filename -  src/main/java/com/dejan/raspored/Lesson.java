package com.dejan.raspored;

import ai.timefold.solver.core.api.domain.entity.PlanningEntity;
import ai.timefold.solver.core.api.domain.variable.PlanningVariable;

@PlanningEntity
public class Lesson {

    private String predmet;
    private String odeljenje;
    private Teacher nastavnik;

    @PlanningVariable(valueRangeProviderRefs = "timeslotRange")
    private Timeslot timeslot;

    public Lesson() {
    }

    public Lesson(String predmet, String odeljenje, Teacher nastavnik) {
        this.predmet = predmet;
        this.odeljenje = odeljenje;
        this.nastavnik = nastavnik;
    }

    public String getPredmet() {
        return predmet;
    }

    public void setPredmet(String predmet) {
        this.predmet = predmet;
    }

    public String getOdeljenje() {
        return odeljenje;
    }

    public void setOdeljenje(String odeljenje) {
        this.odeljenje = odeljenje;
    }

    public Teacher getNastavnik() {
        return nastavnik;
    }

    public void setNastavnik(Teacher nastavnik) {
        this.nastavnik = nastavnik;
    }

    public Timeslot getTimeslot() {
        return timeslot;
    }

    public void setTimeslot(Timeslot timeslot) {
        this.timeslot = timeslot;
    }
}
