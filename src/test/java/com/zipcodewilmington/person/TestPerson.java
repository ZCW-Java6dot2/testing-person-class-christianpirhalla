package com.zipcodewilmington.person;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 2/12/18.
 */
public class TestPerson {
    @Test
    public void testDefaultConstructor() {
        // Given
        String expectedName = "";
        Integer expectedAge = Integer.MAX_VALUE;

        // When
        Person person = new Person();

        // Then
        String actualName = person.getName();
        Integer actualAge = person.getAge();

        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedAge, actualAge);
    }

    @Test
    public void testConstructorWithName() {
        // Given
        String expected = "Leon";

        // When
        Person person = new Person(expected);

        // Then
        String actual = person.getName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testConstructorWithAge() {
        // Given
        Integer expected = 5;

        // When
        Person person = new Person(expected);

        // Then
        Integer actual = person.getAge();
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void testConstructorWithNameAndAge() {
        // Given
        Integer expectedAge = 5;
        String expectedName = "Leon";

        // When
        Person person = new Person(expectedName, expectedAge);

        // Then
        Integer actualAge = person.getAge();
        String actualName = person.getName();

        Assert.assertEquals(expectedAge, actualAge);
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void testConstructorWithNameAgeWeight(){
        //given
        Integer expectedAge = 5;
        String expectedName = "Fred";
        Integer expectedWeight = 50;

        //when
        Person person = new Person(expectedName, expectedAge, expectedWeight);

        //then
        Integer actualAge = person.getAge();
        String actualName = person.getName();
        Integer actualWeight = person.getWeight();
        Assert.assertEquals(expectedAge, actualAge);
        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedWeight, actualWeight);
    }

    @Test
    public void testConstructorWithNameAgeWeightHeight(){
        //given
        Integer expectedAge = 20;
        String expectedName = "Felipe";
        Integer expectedWeight = 180;
        Integer expectedHeight = 71;

        //when
        Person person = new Person(expectedName, expectedAge, expectedWeight, expectedHeight);

        //then
        Integer actualAge = person.getAge();
        String actualName = person.getName();
        Integer actualWeight = person.getWeight();
        Integer actualHeight = person.getHeight();
        Assert.assertEquals(expectedAge, actualAge);
        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedWeight, actualWeight);
        Assert.assertEquals(expectedHeight, actualHeight);
    }

    @Test
    public void testConstructorWithAgeNameWeightHeightRace(){
        //given
        String expectedName = "Jordan";
        int expectedAge = 22;
        int expectedWeight = 200;
        int expectedHeight = 77;
        String expectedRace = "white";

        //when
        Person person = new Person(expectedName, expectedAge, expectedWeight, expectedHeight, expectedRace);

        //Then
        String actualName = person.getName();
        int actualAge = person.getAge();
        int actualWeight = person.getWeight();
        int actualHeight = person.getHeight();
        String actualRace = person.getRace();
        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedAge, actualAge);
        Assert.assertEquals(expectedWeight, actualWeight);
        Assert.assertEquals(expectedHeight, actualHeight);
        Assert.assertEquals(expectedRace, actualRace);
    }

    @Test
    public void testConstructorWithNameAgeWeightHeightRaceGender(){
        //given
        String expectedName = "Dana";
        int expectedAge = 32;
        int expectedWeight = 150;
        int expectedHeight = 69;
        String expectedRace = "black";
        String expectedGender = "female";

        //when
        Person person = new Person(expectedName, expectedAge, expectedWeight, expectedHeight,
                expectedRace, expectedGender);

        //then
        String actualName = person.getName();
        int actualAge = person.getAge();
        int actualWeight = person.getWeight();
        int actualHeight = person.getHeight();
        String actualRace = person.getRace();
        String actualGender = person.getGender();
        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedAge, actualAge);
        Assert.assertEquals(expectedWeight, actualWeight);
        Assert.assertEquals(expectedHeight, actualHeight);
        Assert.assertEquals(expectedRace, actualRace);
        Assert.assertEquals(expectedGender, actualGender);
    }

    @Test
    public void testConstructorWithNameAgeWeightHeightRaceGenderEmployed(){
        //given
        String expectedName = "Andy";
        int expectedAge = 25;
        int expectedWeight = 170;
        int expectedHeight = 72;
        String expectedRace = "Asian";
        String expectedGender = "male";
        Boolean expectedEmployed = true;

        //when
        Person person = new Person(expectedName, expectedAge, expectedWeight, expectedHeight, expectedRace,
                expectedGender, expectedEmployed);

        //then
        String actualName = person.getName();
        int atualAge = person.getAge();
        int actualWeight = person.getWeight();
        int actualHeight = person.getHeight();
        String actualRace = person.getRace();
        String actualGender = person.getGender();
        Boolean actualEmployed = person.getEmployed();
    }

    @Test
    public void testSetName() {
        // Given
        Person person = new Person();
        String expected = "Leon";

        // When
        person.setName(expected);
        String actual = person.getName();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetAge() {
        // Given
        Person person = new Person();
        Integer expected = 5;

        // When
        person.setAge(expected);

        // Then
        Integer actual = person.getAge();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetWeight(){
        //Given
        Person person = new Person();
        Integer expectedWeight = 100;

        //when
        person.setWeight(expectedWeight);

        //then
        Integer actualWeight = person.getWeight();
        Assert.assertEquals(expectedWeight, actualWeight);
    }

    @Test
    public void testSetHeight(){
        //Given
        Person person = new Person();
        Integer expectedHeight = 72;

        //When
        person.setHeight(expectedHeight);

        //Then
        Integer actualHeight = person.getHeight();
        Assert.assertEquals(expectedHeight, actualHeight);
    }

    @Test
    public void testSetRace(){
        //Given
        Person person = new Person();
        String expectedRace = "white";

        //When
        person.setRace(expectedRace);

        //Then
        String actualRace = person.getRace();
        Assert.assertEquals(expectedRace, actualRace);
    }

    @Test
    public void testSetGender(){
        //Given
        Person person = new Person();
        String expectedGender = "nonbinary";

        //When
        person.setGender(expectedGender);

        //Then
        String actualGender = person.getGender();
        Assert.assertEquals(expectedGender, actualGender);
    }

    @Test
    public void testSetEmployed(){
        //Given
        Person person = new Person();
        Boolean expectedEmployed = false;

        //When
        person.setEmployed(expectedEmployed);

        //Then
        Boolean actualEmployed = person.getEmployed();
        Assert.assertEquals(expectedEmployed, actualEmployed);
    }
}
