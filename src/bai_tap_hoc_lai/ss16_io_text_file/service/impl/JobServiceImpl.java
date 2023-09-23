package bai_tap_hoc_lai.ss16_io_text_file.service.impl;

import bai_tap_hoc_lai.ss16_io_text_file.model.Job;
import bai_tap_hoc_lai.ss16_io_text_file.repository.impl.JobRepositoryImpl;
import bai_tap_hoc_lai.ss16_io_text_file.service.IJobService;

import java.util.List;

public class JobServiceImpl implements IJobService {
    private final JobRepositoryImpl jobRepository = new JobRepositoryImpl();

    @Override
    public void removeJob(int id) {
        jobRepository.removeJob(id);
    }

    @Override
    public void editJob(int id, Job job) {
        jobRepository.editJob(id, job);
    }


    @Override
    public Job searchId(int id) {
        return jobRepository.searchId(id);
    }

    @Override
    public List<Job> searchName(String name) {
        return jobRepository.searchName(name);
    }

    @Override
    public void add(Job job) {
        jobRepository.add(job);
    }

    @Override
    public List<Job> getList() {
        return jobRepository.getList();
    }
}
