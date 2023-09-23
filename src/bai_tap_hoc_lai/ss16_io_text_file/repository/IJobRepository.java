package bai_tap_hoc_lai.ss16_io_text_file.repository;

import bai_tap_hoc_lai.ss16_io_text_file.model.Job;

import java.util.List;

public interface IJobRepository extends IRepo<Job> {
    void removeJob(int id);

    void editJob(int id, Job job);

    Job searchId(int id);

    List<Job> searchName(String name);
}
