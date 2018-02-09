package com.company.logic;

import com.company.model.HistoryVacation;
import com.company.session.Connection;
import com.company.tools.ConstantData;
import java.util.ArrayList;
import java.util.List;
import org.apache.ibatis.session.SqlSession;

/**
 *
 * @author santiago.mamani
 */
public class HistoryVacationLogic {

    public List<HistoryVacation> getAllHistory(int idEmployee) {
        List<HistoryVacation> historyVacations = new ArrayList<HistoryVacation>();
        SqlSession session = null;
        try {
            session = new Connection().getSqlSession();
            if (session != null) {
                historyVacations = session.selectList(ConstantData.GET_BY_ID_HISTORY_VACATION, idEmployee);
                session.commit();
            }
        } catch (Exception e) {
        } finally {
            session.close();
        }
        return historyVacations;
    }

    public HistoryVacation getOne(int idEmployee) {
        HistoryVacation historyVacation = new HistoryVacation();
        SqlSession session = null;
        try {
            session = new Connection().getSqlSession();
            if (session != null) {
                historyVacation = session.selectOne(ConstantData.GET_BY_ID_HISTORY_VACATION, idEmployee);
                session.commit();
            }
        } catch (Exception e) {
        } finally {
            session.close();
        }
        return historyVacation;
    }
}
