/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejjunit04;

import java.util.ArrayList;

/**
 *
 * @author crist
 */
public class TaskManager {
    
    ArrayList<String> taskManager = new ArrayList();
    
    public void addTask(String task) {
        taskManager.add(task);
    }
    
    public void removeTask(String task) {
        taskManager.remove(task);
    }
    
    public ArrayList listTasks() {
        return taskManager;
    }    
}
