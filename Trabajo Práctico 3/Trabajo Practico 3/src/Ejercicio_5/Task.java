package Ejercicio_5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class Task implements Comparable<Task>{
    private String description;
    private int priority;

    public Task(String description, int priority) {
        this.description = description;
        this.priority = priority;
    }

    public String getDescription() {
        return description;
    }

    public int getPriority() {
        return priority;
    }

    public int compareTo(Task otherTask){
        return Integer.compare(otherTask.priority, this.priority);
    }

    @Override
    public boolean equals(Object obj) {
        if (this==obj) return true;
        if (obj==null || getClass() != obj.getClass()) return false;
        Task task=(Task) obj;
        return priority==task.priority && Objects.equals(description, task.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description, priority);
    }

    @Override
    public String toString() {
        return "Tarea{Descripción: "+description+"|Prioridad: "+priority+"}";
    }
}

class ListTask implements Iterable<Task>{
    private List<Task> tasks = new ArrayList<>();

    public void addTask(Task task){
        tasks.add(task);
        Collections.sort(tasks);
    }

    public void removeTask(String description){
        Iterator<Task> iterator = tasks.iterator();
        while (iterator.hasNext()){
            Task task = iterator.next();
            if (task.getDescription().equals(description)){
                iterator.remove();
                break;
            }
        }
    }

    public int obtainTotalTaskNum(){
        return tasks.size();
    }

    @Override
    public Iterator<Task> iterator(){
        return tasks.iterator();
    }
}
