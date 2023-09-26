package bai_tap_hoc_lai.ss16_io_text_file.repository;

import bai_tap_hoc_lai.ss16_io_text_file.model.Job;

import java.io.IOException;
import java.util.List;

public interface IJobRepository extends IRepo<Job> {
    void removeJob(int id) throws IOException;

    void editJob(int id, Job job) throws IOException;

    Job searchId(int id) throws IOException;

    List<Job> searchName(String name) throws IOException;
}
