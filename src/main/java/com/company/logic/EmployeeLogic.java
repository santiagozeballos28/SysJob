package com.company.logic;

import com.company.model.Employee;
import com.company.model.HistoryVacation;
import com.company.session.Connection;
import com.company.tools.ConstantData;
import java.util.List;
import org.apache.ibatis.session.SqlSession;

/**
 *
 * @author santiago.mamani
 */
public class EmployeeLogic {

    public Employee get(int idEmployee) {
        Employee employee = new Employee();
        SqlSession session = null;
        try {
            session = new Connection().getSqlSession();
            if (session != null) {
                employee = session.selectOne(ConstantData.GET_BY_ID_EMPLOYEE, idEmployee);
                session.commit();
            }
        } catch (Exception e) {
        } finally {
            session.close();
        }
        return employee;
    }

    public Employee getHistoryVacation(int idEmployee) {
        Employee employee = new Employee();
        SqlSession session = null;
        try {
            session = new Connection().getSqlSession();
            if (session != null) {
                employee = session.selectOne(ConstantData.GET_BY_ID_EMPLOYEE, idEmployee);
                List<HistoryVacation> historyVacations = session.selectList(ConstantData.GET_BY_ID_HISTORY_VACATION, idEmployee);
                employee.setHistoryVacations(historyVacations);
                session.commit();
            }
        } catch (Exception e) {
        } finally {
            session.close();
        }
        return employee;
    }
}
