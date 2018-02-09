package com.company.logic;

import com.company.model.Employee;
import com.company.session.Connection;
import org.apache.ibatis.session.SqlSession;

/**
 *
 * @author santiago.mamani
 */
public class EmployeeLogic {

    private static final String GET_BY_ID = "Employee.getById";

    public Employee get(int idEmployee) {
        Employee employee = null;
        SqlSession session = null;
        try {
            session = new Connection().getSqlSession();
            if (session != null) {
                employee = session.selectOne(GET_BY_ID, idEmployee);
                session.commit();
            }
        } catch (Exception e) {
        } finally {
            session.close();
        }
        return employee;
    }
}
