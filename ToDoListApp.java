import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.*;
import java.util.ArrayList;
import javax.swing.*;

public class ToDoListApp {
    private JFrame frame;
    private DefaultListModel<String> listModel;
    private JList<String> list;
    private JTextField textField;

    private final ArrayList<String> tasks;
    private static final String FILE_NAME = "tasks.txt";

    public ToDoListApp() {
        tasks = new ArrayList<>();
        loadTasks();
        initialize();
    }

    private void initialize() {
        // Set up the frame
        frame = new JFrame("To-Do List");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        // Create and add components
        listModel = new DefaultListModel<>();
        for (String task : tasks) {
            listModel.addElement(task);
        }

        list = new JList<>(listModel);
        JScrollPane scrollPane = new JScrollPane(list);
        frame.add(scrollPane, BorderLayout.CENTER);

        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        textField = new JTextField();
        panel.add(textField, BorderLayout.CENTER);

        JButton addButton = new JButton("Add Task");
        panel.add(addButton, BorderLayout.EAST);
        addButton.addActionListener((ActionEvent e) -> {
            addTask();
        });

        frame.add(panel, BorderLayout.NORTH);

        JButton completeButton = new JButton("Mark as Completed");
        completeButton.addActionListener((ActionEvent e) -> {
            markAsCompleted();
        });
        frame.add(completeButton, BorderLayout.SOUTH);

        frame.setVisible(true);
    }

    private void addTask() {
        String task = textField.getText().trim();
        if (!task.isEmpty()) {
            tasks.add(task);
            listModel.addElement(task);
            textField.setText("");
            saveTasks();
        }
    }

    private void markAsCompleted() {
        int selectedIndex = list.getSelectedIndex();
        if (selectedIndex != -1) {
            String task = listModel.getElementAt(selectedIndex);
            tasks.remove(task);
            listModel.remove(selectedIndex);
            saveTasks();
        }
    }

    private void saveTasks() {
        try (PrintWriter writer = new PrintWriter(new FileWriter(FILE_NAME))) {
            for (String task : tasks) {
                writer.println(task);
            }
        } catch (IOException e) {
        }
    }

    private void loadTasks() {
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            while ((line = reader.readLine()) != null) {
                tasks.add(line);
            }
        } catch (FileNotFoundException e) {
            // File not found, start with empty list
        } catch (IOException e) {
        }
    }

    public static void main(String[] args) {
        new ToDoListApp();
    }
}
