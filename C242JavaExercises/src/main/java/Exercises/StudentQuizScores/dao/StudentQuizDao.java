package Exercises.StudentQuizScores.dao;

import CodeAlongs.ClassRosterApp.dao.ClassRosterPersistenceException;
import CodeAlongs.ClassRosterApp.dto.Student;

import java.util.List;

public interface StudentQuizDao
{
    Student addStudent(String studentId, Student student) throws ClassRosterPersistenceException;

    List<Student> getAllStudents() throws ClassRosterPersistenceException;

    Student getStudent(String studentId) throws ClassRosterPersistenceException;

    Student removeStudent(String studentId) throws ClassRosterPersistenceException;
}
