import java.util.ArrayList;
import java.util.List;

public class ProyectoJava {
    private List<Task> tasks;

    public ProyectoJava() {
        tasks = new ArrayList<>();
    }

    public void addJava(Task task) {
        tasks.add(task);
        System.out.println("Tarea agregada: " + task.getDescription());
    }

    public void removeJava(Task task) {
        tasks.remove(task);
        System.out.println("Tarea eliminada: " + task.getDescription());
    }

    public void listJava() {
        System.out.println("Lista de tareas:");
        for (Task task : tasks) {
            System.out.println("- " + task.getDescription());
        }
    }
}
