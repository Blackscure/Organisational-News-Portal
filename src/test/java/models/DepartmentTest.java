ackage models;


import org.junit.Test;
import static org.junit.Assert.*;
public class DepartmentTest {
    @Test
    public void departmentInstanciatesCorrectly() {
        Department department = new Department("Accounting", "Deals with Accounting", 50);
        assertEquals(true, department instanceof Department);
    }

    @Test
    public void getsDepartmentName() {
        Department department = new Department("Accounting", "Deals with Accounting", 50);
        assertEquals("Accounting", department.getDepartmentName());
    }

    @Test
    public void getsDepartmentDescription() {
        Department department = new Department("Accounting", "Deals with Accounting", 50);
        assertEquals("Deals with Accounting", department.getdepartmentDescription());
    }

    @Test
    public void getsDepartmentEmployees() {
        Department department = new Department("Accounting", "Deals with Accounting", 50);
        assertEquals(50, department.getNumberOfEmployees());
    }
}