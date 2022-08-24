package org.launchcode.techjobs.oo.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.techjobs.oo.*;

import static org.junit.Assert.*;

/**
 * Created by LaunchCode
 */
@RunWith(JUnit4.class)
public class JobTest {
    @Test
    public void testSettingJobId(){
        Job firstJob = new Job();
        Job secondJob = new Job();
        assertNotEquals(firstJob, secondJob);
    }

    @Test
    public void testJobConstructorSetsAllFields(){
        Job testJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertEquals(testJob.getName(), "Product tester");
        assertEquals(testJob.getEmployer().getValue(), "ACME");
        assertEquals(testJob.getLocation().getValue(), "Desert");
        assertEquals(testJob.getPositionType().getValue(), "Quality control");
        assertEquals(testJob.getCoreCompetency().getValue(), "Persistence");

        assertTrue(testJob instanceof Job);
        assertTrue(testJob.getEmployer() instanceof Employer);
        assertTrue(testJob.getLocation() instanceof  Location);
        assertTrue(testJob.getPositionType() instanceof PositionType);
        assertTrue(testJob.getCoreCompetency() instanceof CoreCompetency);
    }

    @Test
    public void testJobsForEquality(){
        Job firstJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job secondJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertFalse(firstJob.equals(secondJob));
    }

    @Test
    public void testToStringStartsAndEndsWithNewLine() {
        Job testJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        int testJobStringLength = testJob.toString().length();

        assertEquals(testJob.toString().charAt(0), '\n');
        assertEquals(testJob.toString().charAt(testJobStringLength - 1), '\n');
    }

    @Test
    public void testToStringContainsCorrectLabelsAndData(){
        Job testJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertEquals(testJob.toString(), "\nID: 4\nName: Product tester\nEmployer: ACME\nLocation: Desert\nPosition Type: Quality control\nCore Competency: Persistence\n");
    }

    @Test
    public void testToStringHandlesEmptyField(){
        Job testJob = new Job("Product tester", new Employer(""), new Location(""), new PositionType(""), new CoreCompetency(""));

        assertEquals(testJob.toString(), "\nID: 3\nName: Product tester\nEmployer: Data not available\nLocation: Data not available\nPosition Type: Data not available\nCore Competency: Data not available\n");
    }
}
