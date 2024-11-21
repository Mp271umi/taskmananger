/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.poepart3;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author RC_Student_lab
 */
public class POEPART3 {

    public static void main(String[] args) {
       Taskmananger taskManager = new Taskmananger();
        taskManager.populateArrays();
        taskManager.displayDoneTasks();
        taskManager.displayLongestDuration();
        taskManager.searchTask("Create Login");
        taskManager.searchDeveloperTasks("Samantha Paulson");
        taskManager.deleteTask("Create Reports");
        taskManager.displayReport();
    }
}
