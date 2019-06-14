package com.exam;

import java.util.ArrayList;
import java.util.List;

public class Tester {
    public static void main(String[] args) {
        List<Report> reports = new ArrayList<>();
        Report report = new HealthReport();
        reports.add(report);
        reports.add(new FinanceReport());
        for (Report r: reports) {
            r.print();
        }
    }
}

interface Report {
    void print();
}

class HealthReport implements Report {
    @Override
    public void print() {
        System.out.println("Health Report");
    }
}

class FinanceReport implements Report {
    @Override
    public void print() {
        System.out.println("Finance Report");
    }
}

