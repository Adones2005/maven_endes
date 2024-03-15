package com.prueba.endes;

public class Main {
	/**
	 * metodo principal para probar los archivos
	 * @param args
	 */
   public static void main(String[] args) {
       EmployeeManager manager = new EmployeeManager();
       manager.addEmployee("John Doe", 5);
       manager.addEmployee("Jane Smith", 2);
       manager.printEmployees();
   }
}
  

