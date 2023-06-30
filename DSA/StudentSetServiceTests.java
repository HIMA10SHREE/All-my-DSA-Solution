package com.stackroute.collections;


import org.hamcrest.collection.IsIterableContainingInOrder;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.collection.IsIterableContainingInOrder.contains;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import com.stackroute.collections.Student;
import com.stackroute.collections.StudentCgpaComparator;
import com.stackroute.collections.StudentSetService;
import java.util.*;

public class StudentSetServiceTests {
    private static final String MESSAGE = "Class StudentSetService has not been initialized with an empty SortedSet";
    private static final String MESSAGE_ONE = "Students duplicate values should not be added and it should return name sorted set";
    private static final String MESSAGE_TWO = "Second Lowest student from sorted set by name not returned properly";
    private static final String MESSAGE_THREE = "Sorted list of students by name from third element including it is not returned properly";
    private static final String MESSAGE_FOUR = "Sorted list of students by name in reverse order is not returned properly";
    private static final String MESSAGE_FIVE = "Set of students are not sorted by CGPA properly";

    private StudentSetService studentSetService;
    private Student studentOne, studentTwo, studentThree, studentFour, studentFive, studentSix;
    private Set<Student> sortedSet;

    @BeforeEach
    public void setUp() {
        studentSetService = new StudentSetService();
    }

    @AfterEach
    public void tearDown() {
        studentSetService = null;
        studentOne = null;
        studentTwo = null;
        studentThree = null;
        studentFour = null;
        studentFive = null;
    }

    @Test
    public void givenStudentServiceThenStudentSetInitializedAsTreeSet() {
        assertThat(MESSAGE, studentSetService.getStudentSet(), is(empty()));
    }

    @Test
    public void givenStudentValuesWhenAddedThenReturnStudentSet() {
        studentOne = new Student(1001, "Punith", 54.5);
        studentSetService.addStudentsToTreeSet(studentOne);
        sortedSet = studentSetService.getStudentSet();
        assertThat(MESSAGE_ONE, sortedSet, IsIterableContainingInOrder.contains(studentOne));
    }

    @Test
    public void givenStudentDuplicateNameValuesWhenAddedThenReturnsUniqueStudentSet() {
        addStudentsDataToTreeSet();
        sortedSet = studentSetService.getStudentSet();
        assertThat(MESSAGE_ONE, sortedSet, contains(studentTwo, studentThree, studentOne, studentFour));
    }

    @Test
    public void givenStudentServiceThenReturnSecondLowestStudentElement() {
        addStudentsDataToTreeSet();
        Student student = studentSetService.getSecondLowestStudentElementFromSortedSetByName();
        assertThat(MESSAGE_TWO, student, allOf(notNullValue(), hasProperty("studentName", equalTo("Chandan"))));
        assertEquals(1003, student.getStudentId(), MESSAGE_TWO);
    }

    @Test
    public void givenStudentServiceWhenSingleElementPresentThenReturnNull() {
        studentOne = new Student(1001, "Punith", 54.5);
        sortedSet = studentSetService.getStudentSet();
        sortedSet.add(studentOne);
        Student student = studentSetService.getSecondLowestStudentElementFromSortedSetByName();
        assertThat(MESSAGE_FIVE, student, is(nullValue()));
    }

    @Test
    public void givenStudentServiceThenReturnSortedSetFromGivenElement() {
        addStudentsDataToTreeSet();
        SortedSet<Student> retrievedSortedSet = studentSetService.getStudentSortedSetByNameFromGivenElement(studentOne);
        assertThat(MESSAGE_THREE, retrievedSortedSet, contains(studentOne, studentFive));
    }

    @Test
    public void givenStudentServiceWhenGivenElementNotFoundThenReturnFullSet() {
        addStudentsDataToTreeSet();
        SortedSet<Student> retrievedSortedSet = studentSetService.getStudentSortedSetByNameFromGivenElement(new Student(1006, "Lakshmi", 67.8));
        assertThat(MESSAGE_THREE, retrievedSortedSet, contains(studentTwo, studentThree, studentOne, studentFour));
    }

    @Test
    public void givenStudentServiceWhenGivenElementIsNullThenThrowsException() {
        addStudentsDataToTreeSet();
        assertThrows(NullPointerException.class, () -> {
            studentSetService.getStudentSortedSetByNameFromGivenElement(studentSix);
        }, MESSAGE_THREE);
    }

    @Test
    public void givenStudentServiceThenReturnSortedSetInReverseOrder() {
        addStudentsDataToTreeSet();
        SortedSet<Student> reverseSortedSet = studentSetService.getStudentSetSortedByNameInReverseOrder();
        assertThat(MESSAGE_FOUR, reverseSortedSet, contains(studentFive, studentOne, studentThree, studentTwo));
    }

    @Test
    public void givenStudentServiceWhenEmptySetThenReturnEmptySetForReverseOrder() {
        SortedSet<Student> reverseSortedSet = studentSetService.getStudentSetSortedByNameInReverseOrder();
        assertThat(MESSAGE_FOUR, reverseSortedSet, is(empty()));
    }

    @Test
    public void givenStudentServiceThenReturnSortedSetByCGPAInDescendingOrder() {
        addStudentsDataToTreeSet();
        TreeSet<Student> cgpaSortedSet = studentSetService.getStudentSetSortedByCGPAInDescendingOrder();
        assertThat(MESSAGE_FIVE, cgpaSortedSet, contains(studentThree, studentTwo, studentOne, studentFive));
    }

    @Test
    public void givenStudentServiceWhenCGPAAreSameThenReturnSortedSetByID() {
        studentOne = new Student(1001, "Punith", 54.5);
        studentTwo = new Student(1002, "Abhirami", 54.5);
        studentThree = new Student(1003, "Chandan", 87.3);
        studentSetService.getStudentSet().add(studentOne);
        studentSetService.getStudentSet().add(studentTwo);
        studentSetService.getStudentSet().add(studentThree);
        TreeSet<Student> cgpaSortedSet = studentSetService.getStudentSetSortedByCGPAInDescendingOrder();
        assertThat(MESSAGE_FIVE, cgpaSortedSet, contains(studentThree, studentOne, studentTwo));
    }

    @Test
    public void givenStudentServiceWhenEmptySetThenReturnEmptySetForCgpaSortedOrder() {
        SortedSet<Student> cgpaSortedSet = studentSetService.getStudentSetSortedByCGPAInDescendingOrder();
        assertThat(MESSAGE_FOUR, cgpaSortedSet, is(empty()));
    }

    /**
     * Setting up  Student data in StudentSetService for some Tests
     */
    private void addStudentsDataToTreeSet() {
        studentOne = new Student(1001, "Punith", 54.5);
        studentTwo = new Student(1002, "Abhirami", 80.2);
        studentThree = new Student(1003, "Chandan", 87.3);
        studentFour = new Student(1004, "Ramana", 45.5);
        studentFive = new Student(1004, "Ramana", 47.5);
        studentSetService.getStudentSet().add(studentOne);
        studentSetService.getStudentSet().add(studentTwo);
        studentSetService.getStudentSet().add(studentThree);
        studentSetService.getStudentSet().add(studentFour);
        studentSetService.getStudentSet().add(studentFive);
    }

}