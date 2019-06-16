package com.exam;

public class Tester2 {
    public static void main(String[] args) {
        Report2 report = new HealthReport2();
        report.print();
    }
}

interface Report2 {
    void print();
}

/*
class HealthReport extends Report {
   HealthReport無法繼承Report，因為Report不是類別，需implements
}*/

class HealthReport2 implements Report2 {

	@Override
	public void print() {
		// TODO Auto-generated method stub
		
	}
	
}
