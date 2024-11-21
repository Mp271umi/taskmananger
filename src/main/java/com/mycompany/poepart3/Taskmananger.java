/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poepart3;
 import javax.swing.JOptionPane;

/**
 *
 * @author RC_Student_lab
 */
public class Taskmananger {

    private final String[] developers;
    private final String[] taskNames;
    private final int[] taskDurations;
    private final String[] taskStatuses;

    public Taskmananger() {
        developers = new String[4];
        taskNames = new String[4];
        taskDurations = new int[4];
        taskStatuses = new String[4];
    }

    public void populateArrays() {
        for (int i = 0; 4 >= i; i++) {
            developers[i] = JOptionPane.showInputDialog("Enter developer name:");
            taskNames[i] = JOptionPane.showInputDialog("Enter task name:");
            taskDurations[i] = Integer.parseInt(JOptionPane.showInputDialog("Enter task duration:"));
            taskStatuses[i] = JOptionPane.showInputDialog("Enter task status:");
        }
    }

    public void displayDoneTasks() {
        String message = "";
        for (int i = 0; i < taskStatuses.length; i++) {
            if (taskStatuses[i].equals("Done")) {
                message += "Developer: " + developers[i] + ", Task Name: " + taskNames[i] + ", Task Duration: " + taskDurations[i] + "\n";
            }
        }
        JOptionPane.showMessageDialog(null, message);
    }

    public void displayLongestDuration() {
        int maxDuration = 0;
        String developer = "";
        for (int i = 0; i < taskDurations.length; i++) {
            if (taskDurations[i] > maxDuration) {
                maxDuration = taskDurations[i];
                developer = developers[i];
            }
        }
        JOptionPane.showMessageDialog(null, "Developer: " + developer + ", Duration: " + maxDuration);
    }

    public void searchTask(String taskName) {
        for (int i = 0; i < taskNames.length; i++) {
            if (taskNames[i].equals(taskName)) {
                JOptionPane.showMessageDialog(null, "Task Name: " + taskNames[i] + ", Developer: " + developers[i] + ", Task Status: " + taskStatuses[i]);
            }
        }
    }

    public void searchDeveloperTasks(String developer) {
        String message = "";
        for (int i = 0; i < developers.length; i++) {
            if (developers[i].equals(developer)) {
                message += "Task Name: " + taskNames[i] + ", Task Status: " + taskStatuses[i] + "\n";
            }
        }
        JOptionPane.showMessageDialog(null, message);
    }

    public void deleteTask(String taskName) {
        for (int i = 0; i < taskNames.length; i++) {
            if (taskNames[i].equals(taskName)) {
                taskNames[i] = null;
                developers[i] = null;
                taskDurations[i] = 0;
                taskStatuses[i] = null;
                JOptionPane.showMessageDialog(null, "Entry successfully deleted");
            }
        }
    }

    public void displayReport() {
        String message = "";
        for (int i = 0; i < taskNames.length; i++) {
            message += "Task Name: " + taskNames[i] + ", Developer: " + developers[i] + ", Task Duration: " + taskDurations[i] + ", Task Status: " + taskStatuses[i] + "\n";
        }
        JOptionPane.showMessageDialog(null, message);
    }
}
 