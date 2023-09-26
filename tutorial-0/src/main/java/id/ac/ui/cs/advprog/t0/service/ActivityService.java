package id.ac.ui.cs.advprog.t0.service;

import id.ac.ui.cs.advprog.t0.model.Activity;
import id.ac.ui.cs.advprog.t0.model.Day;

import java.util.List;

public interface ActivityService {
    public Activity create(Activity activity);
    public List<Activity> findAll();
    public List<Activity> findByDay(Day day);
    
}

