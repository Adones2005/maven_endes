import java.util.ArrayList;
import java.util.List;

/**
 * Clase para gestionar empleados.
 * 
 * Esta clase permite agregar empleados y mostrar una lista de ellos.
 * 
 * @author Daniel Adones
 * @version 1.0
 */
public class EmployeeManager {
    private List<Employee> employees = new ArrayList<>(); // Lista de empleados

    /**
     * Método para añadir un empleado.
     * 
     * @param name Nombre del empleado.
     * @param years Años en la empresa.
     */
    public void addEmployee(String name, int years) {
        Employee employee = new Employee(name, years);
        employees.add(employee);
        System.out.println(name + " added to the system.");
    }
}