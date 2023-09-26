package bai_tap_hoc_lai.ss16_io_text_file.repository.impl;

import bai_tap_hoc_lai.ss16_io_text_file.model.Job;
import bai_tap_hoc_lai.ss16_io_text_file.repository.IJobRepository;
import bai_tap_hoc_lai.ss16_io_text_file.ultis.FileUtils;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class JobRepositoryImpl implements IJobRepository {
    private final String PATH_FILE = "F:\\C0723G1_TranLinhGiang_Module2\\src\\bai_tap_hoc_lai\\ss16_io_text_file\\data\\job.csv";
    private final String COMMA = ",";

    public boolean checkId(int id) throws IOException {
        List<Job> jobList = this.getList();
        for (Job job : jobList) {
          if (job.getId()== id)
              return true;
        }
        return false;
    }

    @Override

    public void removeJob(int id){
        List<Job> jobList = convertToE(FileUtils.readFile(PATH_FILE));
        int index;
        for (Job valueRemove : jobList) {
            if (valueRemove.getId() == (id)) {
                index = jobList.indexOf(valueRemove);
                jobList.remove(index);
                break;
            }
        }
        FileUtils.writeFile(PATH_FILE, convertToString(jobList));
    }

    @Override
    public void editJob(int id, Job job){
        List<Job> jobList = convertToE(FileUtils.readFile(PATH_FILE));
        int index;
        for (Job valueEdit : jobList) {
            if (valueEdit.getId() == (id)) {
                index = jobList.indexOf(valueEdit);
                jobList.set(index, job);
            }
        }
        FileUtils.writeFile(PATH_FILE, convertToString(jobList));
    }


    @Override
    public Job searchId(int id){
        List<Job> jobList = convertToE(FileUtils.readFile(PATH_FILE));
        for (Job valueSearchId : jobList) {
            if (valueSearchId.getId() == (id)) {
                return valueSearchId;
            }

        }
        return null;
    }

    @Override
    public List<Job> searchName(String name){
        List<Job> jobList = convertToE(FileUtils.readFile(PATH_FILE));
        List<Job> result = new ArrayList<>();
        for (Job valueSearchName : jobList) {
            if (valueSearchName.getName().contains(name)) {
                result.add(valueSearchName);
            }
        }

        return result;
    }

    @Override
    public void add(Job job){
        List<Job> jobList = convertToE(FileUtils.readFile(PATH_FILE));
        jobList.add(job);
        FileUtils.writeFile(PATH_FILE, convertToString(jobList));
    }

    @Override
    public List<Job> getList()  {
        List<Job> jobList = convertToE(FileUtils.readFile(PATH_FILE));
        jobList.sort(new Comparator<Job>() {
            @Override
            public int compare(Job o1, Job o2) {
                return (o1.getName().compareTo(o2.getName()));
            }
        });

        jobList.sort(new Comparator<Job>() {
            @Override
            public int compare(Job o1, Job o2) {
                return Double.compare(o2.getMoney(), o1.getMoney());
            }
        });
        return jobList;
    }

    public List<String> convertToString(List<Job> e) {
        List<String> stringList = new ArrayList<>();
        for (Job job : e) {
            stringList.add(job.getId() + COMMA +
                    job.getName() + COMMA +
                    job.getDate() + COMMA +
                    job.getMoney() + COMMA +
                    job.getDescribe());
        }
        return stringList;
    }

    public List<Job> convertToE(List<String> strings) {
        List<Job> jobs = new ArrayList<>();
        for (String string : strings) {
            String[] data = string.split(COMMA);
            jobs.add(new Job(Integer.parseInt(data[0]), data[1], Integer.parseInt(data[2]), Double.parseDouble(data[3]), data[4]));
        }
        return jobs;
    }
}
