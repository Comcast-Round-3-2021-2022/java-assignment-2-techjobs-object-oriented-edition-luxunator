package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.
    public Job() {
        id = nextId;
        nextId++;
    }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency){
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }

    @Override
    public String toString() {
        String defaultEmpty = "Data not available";
        String job = "\n";

        job += "ID: " + this.getId();
        job += "\nName: " + this.getName();

        String employerString = this.getEmployer().toString() != "" ? this.getEmployer().toString() : defaultEmpty;
        job += "\nEmployer: " + employerString;

        String locationString = this.getLocation().toString() != "" ? this.getLocation().toString() : defaultEmpty;
        job += "\nLocation: " + locationString;

        String positionTypeString = this.getPositionType().toString() != "" ? this.getPositionType().toString() : defaultEmpty;
        job += "\nPosition Type: " + positionTypeString;

        String coreCompetencyString = this.getCoreCompetency().toString() != "" ? this.getCoreCompetency().toString() : defaultEmpty;
        job += "\nCore Competency: " + coreCompetencyString;

        job += "\n";

        return job;
//        return "Job{" +
//                "id=" + id +
//                ", name='" + name + '\'' +
//                ", employer=" + employer +
//                ", location=" + location +
//                ", positionType=" + positionType +
//                ", coreCompetency=" + coreCompetency +
//                '}';
    }

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return id == job.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public Location getLocation() {
        return location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }
}
