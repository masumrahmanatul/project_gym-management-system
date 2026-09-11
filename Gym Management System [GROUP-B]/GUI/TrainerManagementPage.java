package GUI;
import EntityList.TrainerList;
import Entity.Trainer;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TrainerManagementPage {
    private TrainerList trainerList;
    private JFrame frame;
    private JTextField nameField, ageField, heightField, weightField, genderField, idField, salaryField;
    private JTextArea displayArea;

    public TrainerManagementPage() {
        trainerList = new TrainerList();
        frame = new JFrame("Trainer Management");
        frame.setBounds(600, 200, 600, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(9, 2, 5, 5));

        panel.add(new JLabel("    Name:"));
        nameField = new JTextField();
        panel.add(nameField);

        panel.add(new JLabel("    Age:"));
        ageField = new JTextField();
        panel.add(ageField);

        panel.add(new JLabel("    Height:"));
        heightField = new JTextField();
        panel.add(heightField);

        panel.add(new JLabel("    Weight:"));
        weightField = new JTextField();
        panel.add(weightField);

        panel.add(new JLabel("    Gender (M/F):"));
        genderField = new JTextField();
        panel.add(genderField);

        panel.add(new JLabel("    Trainer ID:"));
        idField = new JTextField();
        panel.add(idField);

        panel.add(new JLabel("    Salary:"));
        salaryField = new JTextField();
        panel.add(salaryField);

        JButton addButton = new JButton("Add Trainer");
        panel.add(addButton);

        JButton showAllButton = new JButton("Show All Trainers");
        panel.add(showAllButton);

        JButton deleteButton = new JButton("Delete Trainer by ID");
        panel.add(deleteButton);

        JButton searchButton = new JButton("Search Trainer by ID");
        panel.add(searchButton);

        displayArea = new JTextArea(10, 40);
        displayArea.setEditable(false);

        frame.getContentPane().setLayout(new BorderLayout());
        frame.getContentPane().add(panel, BorderLayout.NORTH);
        frame.getContentPane().add(new JScrollPane(displayArea), BorderLayout.CENTER);

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addTrainer();
            }
        });

        showAllButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                displayTrainers();
            }
        });

        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                deleteTrainerById();
            }
        });

        searchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                searchTrainerById();
            }
        });

        frame.setVisible(true);
    }

    private void addTrainer() {
        try {
            String name = nameField.getText().trim();
            String height = heightField.getText().trim();
            String trainerId = idField.getText().trim();
            if (name.isEmpty() || height.isEmpty() || trainerId.isEmpty()) {
                JOptionPane.showMessageDialog(frame, "Error: Fields cannot be empty!", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            int age = Integer.parseInt(ageField.getText().trim());
            float weight = Float.parseFloat(weightField.getText().trim());
            float salary = Float.parseFloat(salaryField.getText().trim());

            String genderInput = genderField.getText().trim();
            if (genderInput.length() != 1 || (genderInput.charAt(0) != 'M' && genderInput.charAt(0) != 'F')) {
                JOptionPane.showMessageDialog(frame, "Error: Gender must be 'M' or 'F'", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            char gender = genderInput.charAt(0);

            if (trainerList.getById(trainerId) != null) {
                JOptionPane.showMessageDialog(frame, "Error: Trainer ID already exists!", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            if (salary < 0) {
                JOptionPane.showMessageDialog(frame, "Error: Salary cannot be negative!", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            Trainer trainer = new Trainer(name, age, height, weight, gender, trainerId, salary);
            trainerList.insert(trainer);
            JOptionPane.showMessageDialog(frame, "Trainer added successfully!");
            System.out.println("Added Trainer: " + trainer);

            nameField.setText("");
            ageField.setText("");
            heightField.setText("");
            weightField.setText("");
            genderField.setText("");
            idField.setText("");
            salaryField.setText("");

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(frame, "Error: Please enter valid numeric values for Age, Weight, and Salary!", "Error", JOptionPane.ERROR_MESSAGE);
            System.out.println("Error adding trainer: " + ex.getMessage());
        }
    }

    private void displayTrainers() {
        displayArea.setText("");
        boolean found = false;
        System.out.println("Current Trainers:");
        for (Trainer trainer : trainerList.getTrainers()) {
            if (trainer != null) {
                String trainerInfo = trainer.getTrainerId() + " - " + trainer.getName();
                displayArea.append(trainerInfo + "\n");
                System.out.println(trainerInfo);
                found = true;
            }
        }
        if (!found) {
            displayArea.append("No trainers available.\n");
            System.out.println("No trainers available.");
        }
    }

    private void deleteTrainerById() {
        String trainerId = JOptionPane.showInputDialog(frame, "Enter Trainer ID to delete:");
        if (trainerId != null && !trainerId.trim().isEmpty()) {
            Trainer trainer = trainerList.getById(trainerId);
            if (trainer != null) {
                int confirm = JOptionPane.showConfirmDialog(frame, "Are you sure you want to delete the trainer with ID: " + trainerId + "?",
                        "Confirm Deletion", JOptionPane.YES_NO_OPTION);
                if (confirm == JOptionPane.YES_OPTION) {
                    trainerList.delete(trainer);
                    JOptionPane.showMessageDialog(frame, "Trainer with ID " + trainerId + " has been deleted.");
                    System.out.println("Deleted Trainer with ID: " + trainerId);
                }
            } else {
                JOptionPane.showMessageDialog(frame, "Trainer with ID " + trainerId + " not found.");
                System.out.println("Delete failed: Trainer with ID " + trainerId + " not found.");
            }
        } else {
            JOptionPane.showMessageDialog(frame, "Error: Please enter a valid Trainer ID.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void searchTrainerById() {
        String trainerId = JOptionPane.showInputDialog(frame, "Enter Trainer ID to search:");
        if (trainerId != null && !trainerId.trim().isEmpty()) {
            Trainer trainer = trainerList.getById(trainerId);
            if (trainer != null) {
                JOptionPane.showMessageDialog(frame, trainer.toString());
                System.out.println("Found Trainer: " + trainer);
            } else {
                JOptionPane.showMessageDialog(frame, "Trainer with ID " + trainerId + " not found.");
                System.out.println("Search failed: Trainer with ID " + trainerId + " not found.");
            }
        }
    }
}
