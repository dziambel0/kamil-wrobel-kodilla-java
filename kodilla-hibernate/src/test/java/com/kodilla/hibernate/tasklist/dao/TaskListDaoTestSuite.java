package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.task.Task;
import com.kodilla.hibernate.task.TaskFinancialDetails;
import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class TaskDaoTestSuite {

    @Autowired
    private TaskListDao taskListDao;

    private static final String LISTNAME = "Lista testowa";

    @Test
    void testFindByListName(){
        //Given
        TaskList taskList = new TaskList(LISTNAME);
        taskListDao.save(taskList);
        String listName = taskList.getListName();

        //When
        List<TaskList> readTaskList = taskListDao.findByListName(listName);

        //Then
        assertEquals(1, readTaskList.size());

        //CleanUp
        int id = readTaskList.get(0).getId();
        taskListDao.deleteById(id);
    }
    @Test
    void testTaskListDaoSaveWithTasks(){
        //Given
        Task task1 = new Task("Test 1", 14);
        Task task2 = new Task("Test 2", 3);
        TaskFinancialDetails tfd1 = new TaskFinancialDetails(new BigDecimal(120), false);
        TaskFinancialDetails tfd2 = new TaskFinancialDetails(new BigDecimal(130), false);
        task1.setTaskFinancialDetails(tfd1);
        task2.setTaskFinancialDetails(tfd2);
        TaskList taskList = new TaskList(LISTNAME);
        taskList.getTasks().add(task1);
        taskList.getTasks().add(task2);
        task1.setTaskList(taskList);
        task2.setTaskList(taskList);

        //When
        taskListDao.save(taskList);
        int id = taskList.getId();

        //Then
        assertNotEquals(0, id);

        //CleanUp
        taskListDao.deleteById(id);
    }

}
