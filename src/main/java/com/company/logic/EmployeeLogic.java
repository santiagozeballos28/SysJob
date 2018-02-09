/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.logic;

import com.company.model.Employee;
import com.company.session.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;

/**
 *
 * @author santiago.mamani
 */
public class EmployeeLogic {

    public String insert(Employee employee) {
        SqlSession session = new MyBatisUtil().getSqlSession();
        String res = "No insertado";
        if (session != null) {
            try {
                session.insert("Employee.insertarEmployee", employee);
                session.commit();
                res = "Insertado";
            } finally {
                session.close();
            }
        } else {
            System.out.println("Error.. to open Session");
            res = "Error.. to open Session";
        }
        return res;
    }

    public Employee get(int idEmployee) {
        SqlSession session = new MyBatisUtil().getSqlSession();
        Employee contacto = null;
        if (session != null) {
            try {
                System.out.println("Employee.getById: " + idEmployee);
                contacto = session.selectOne("Employee.getById", idEmployee);
                session.commit();
            } finally {
                session.close();
            }
        } else {
            System.out.println("Error.. to open Session");
        }
        return contacto;
    }
}
