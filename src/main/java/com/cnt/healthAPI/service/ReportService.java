package com.cnt.healthAPI.service;

import com.cnt.healthAPI.model.Report;
import com.cnt.healthAPI.repository.IReportRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReportService implements  IReportService {

    @Autowired
    private IReportRepository reportRepository;

    @Override
    public List<Report> getReports() {
        return reportRepository.findAll();
    }

    @Override
    public void saveReport(Report report) {
        reportRepository.save(report);

    }

    @Override
    public void deleteReport(Long id) {
        reportRepository.deleteById(id);
    }

    @Override
    public Report findReport(Long id) {
        return reportRepository.findById(id).orElse(null);
    }
}
