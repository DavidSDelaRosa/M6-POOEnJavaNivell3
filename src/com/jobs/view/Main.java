package com.jobs.view;

import com.jobs.application.JobsController;

public class Main {
	
	private static JobsController controller=new JobsController();
	
	public static void main(String[] args) throws Exception {
		
		controller.createBossEmployee("Pepe Boss", "Direccion molona", "666666666", 11800.0);
		controller.createBossEmployee("Paca Boss", "Direccion molona", "666666666", 12000.0);
		controller.createManagerEmployee("Pedro Manager", "Direccion molona 2", "665226666", 2500.0);
		controller.createManagerEmployee("Natalia Manager", "Direccion molona 2", "665226666", 2800.0);
		controller.createJuniorEmployee("Pedro Junior", "Direccion molona 2", "665266666", 600.0);
		controller.createJuniorEmployee("Luisa Junior", "Direccion molona 2", "665266666", 650.0);
		controller.createMidEmployee("Laura Mid", "Direccion molona 3", "625266666", 1000.0);
		controller.createMidEmployee("Diego Mid", "Direccion molona 3", "625266666", 1200.0);
		controller.createSeniorEmployee("Delia Senior", "Direccion aun mas molona" , "636636636", 1800.0);
		controller.createSeniorEmployee("Juan Senior", "Direccion aun mas molona" , "636636636", 2000.0);
		controller.createVolunteer("Juan Volunteer", "Direccion molona 4", "614266666", "No recibe ayuda", 0.0);
		controller.createVolunteer("Elisa Volunteer", "Direccion molona 4", "614266666", "Recibe ayuda", 300);
		
		
		controller.payAllEmployeers();
		
		String allEmployees=controller.getAllEmployees();
		
		System.out.println("EMPLOYEES: " + allEmployees + " \n");
		
	}

}
