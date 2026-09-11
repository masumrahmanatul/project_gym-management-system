package EntityList;

import Entity.Trainer;
import java.util.ArrayList;
import java.util.Iterator;

public class TrainerList {
    private ArrayList<Trainer> trainers;

    public TrainerList() {
        trainers = new ArrayList<>();
    }

    public void insert(Trainer trainer) {
        trainers.add(trainer);
        System.out.println("Inserted trainer: " + trainer);
    }

    public Trainer getById(String trainerId) {
        for (Trainer trainer : trainers) {
            if (trainer.getTrainerId().equals(trainerId)) {
                return trainer;
            }
        }
        return null;
    }

    public void delete(Trainer trainer) {
        Iterator<Trainer> iterator = trainers.iterator();
        while (iterator.hasNext()) {
            Trainer t = iterator.next();
            if (t.getTrainerId().equals(trainer.getTrainerId())) {
                iterator.remove();
                System.out.println("Deleted trainer: " + t);
                return;
            }
        }
    }

    public ArrayList<Trainer> getTrainers() {
        return trainers;
    }
}
