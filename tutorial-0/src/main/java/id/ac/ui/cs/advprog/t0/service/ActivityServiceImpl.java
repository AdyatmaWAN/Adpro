package id.ac.ui.cs.advprog.t0.service;

import id.ac.ui.cs.advprog.t0.model.Activity;
import id.ac.ui.cs.advprog.t0.model.Day;
import id.ac.ui.cs.advprog.t0.repository.ActivityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ActivityServiceImpl implements ActivityService {
    
    @Autowired
    private ActivityRepository activityRepository;
    
    @Override
    public Activity create(Activity activity) {
        activityRepository.create(activity);
        return activity;
    }
    
    @Override
    public List<Activity> findAll() {
        Iterator<Activity> activityIterator = activityRepository.findAll();
        List<Activity> allActivity = new ArrayList<>();
        activityIterator.forEachRemaining(allActivity::add);
        return allActivity;
    }
    
    @Override
    public List<Activity> findByDay(Day day) {
        // TO DO: get a list of activities that match the day
        ArrayList<Activity> activities = (ArrayList<Activity>) findAll();
        ArrayList<Activity> allActivity = new ArrayList<>();
        
        for (int i = 0; i < activities.size(); i++) {
            if (activities.get(i).getDay().equals(day)) {
                allActivity.add(activities.get(i));
            }
        }
        
        return allActivity;
    }
    
}
