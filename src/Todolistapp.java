
import java.util.ArrayList;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Administrator
 */
public class Todolistapp {
     class Todo {
    String description;
    boolean completed;

    public Todo(String description) {
        this.description = description;
        this.completed = false;
    }

    public void markAsCompleted() {
        this.completed = true;
    }

    public void updateDescription(String newDescription) {
        this.description = newDescription;
    }

    @Override
    public String toString() {
        return "[" + (completed ? "X" : " ") + "] " + description;
    }
    }

    public Todolistapp(String description) {
    }
    public static void main(String[] args) {
        ArrayList<Todolistapp> todos= new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Ajouter une tâche");
            System.out.println("2. Afficher les tâches");
            System.out.println("3. Marquer une tâche comme terminée");
            System.out.println("4. Modifier la description d'une tâche");
            System.out.println("5. Supprimer une tâche");
            System.out.println("6. Quitter");
            System.out.print("Choisissez une option : ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Clear the newline character

            switch (choice) {
                case 1:
                    System.out.print("Entrez la description de la tâche : ");
                    String description = scanner.nextLine();
                    todos.add(new Todolistapp(description));
                    System.out.println("Tâche ajoutée avec succès !");
                    break;
                case 2:
                    System.out.println("\nListe des tâches :");
                    for (int i = 0; i < todos.size(); i++) {
                        System.out.println((i + 1) + ". " + todos.get(i));
                    }
                    break;
                case 3:
                    System.out.print("Entrez le numéro de la tâche terminée : ");
                    int todoIndexComplete = scanner.nextInt();
                    if (isValidIndex(todoIndexComplete, todos)) {
                        todos.get(todoIndexComplete - 1).markAsCompleted();
                        System.out.println("Tâche marquée comme terminée !");
                    } else {
                        System.out.println("Numéro de tâche invalide !");
                    }
                    break;
                case 4:
                    System.out.print("Entrez le numéro de la tâche à modifier : ");
                    int todoIndexUpdate = scanner.nextInt();
                    if (isValidIndex(todoIndexUpdate, todos)) {
                        System.out.print("Entrez la nouvelle description : ");
                        String newDescription = scanner.nextLine();
                        todos.get(todoIndexUpdate - 1).updateDescription(newDescription);
                        System.out.println("Description de la tâche modifiée avec succès !");
                    } else {
                        System.out.println("Numéro de tâche invalide !");
                    }
                    break;
                case 5:
                    System.out.print("Entrez le numéro de la tâche à supprimer : ");
                    int todoIndexDelete = scanner.nextInt();
                    if (isValidIndex(todoIndexDelete, todos)) {
                        todos.remove(todoIndexDelete - 1);
                        System.out.println("Tâche supprimée avec succès !");
                    } else {
                        System.out.println("Numéro de tâche invalide !");
                    }
                    break;
                case 6:
                    System.out.println("Merci d'utiliser l'application Todo List. Au revoir !");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Option invalide. Veuillez réessayer.");
            }
        }
    }

    private static boolean isValidIndex(int index, ArrayList<Todolistapp> todos) {
        return index >= 1 && index <= todos.size();
    }

    private void markAsCompleted() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void updateDescription(String newDescription) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
