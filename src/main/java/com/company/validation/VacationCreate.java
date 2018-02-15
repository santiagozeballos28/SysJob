package com.company.validation;

import com.company.logic.DateOperation;
import com.company.model.DayVacation;
import com.company.model.HistoryVacation;
import com.company.model.VacationCompany;
import com.company.util.Bundle;
import com.company.tools.ConstantData;
import com.company.util.Either;
import com.company.util.Error;
import java.util.List;
import org.apache.commons.lang3.StringUtils;

/**
 *
 * @author santiago.mamani
 */
public class VacationCreate {

    private Bundle bundle;
    private DayVacation dayVacation;
    private HistoryVacation historyVacation;
    private List<VacationCompany> vacationsCompany;

    public VacationCreate() {
        bundle = new Bundle();
    }

    public VacationCreate(DayVacation dayVacation, HistoryVacation historyVacation, List<VacationCompany> vacationsCompany) {
        this.dayVacation = dayVacation;
        this.historyVacation = historyVacation;
        this.vacationsCompany = vacationsCompany;
        bundle = new Bundle();
    }

    public void setDayVacation(DayVacation dayVacation) {
        this.dayVacation = dayVacation;
    }

    public void setHistoryVacation(HistoryVacation historyVacation) {
        this.historyVacation = historyVacation;
    }

    public void setVacationsCompany(List<VacationCompany> vacationsCompany) {
        this.vacationsCompany = vacationsCompany;
    }

    private Either<Error, Boolean> notEmpty(String startDate, String endDate) {
        Error error = new Error();
        if (StringUtils.isBlank(startDate)) {
            Object[] args = {bundle.getData(ConstantData.START_DATE)};
            String message = bundle.getMessage(ConstantData.EMPTY, args);
            error.addError(message);
        }
        if (StringUtils.isBlank(endDate)) {
            Object[] args = {bundle.getData(ConstantData.END_DATE)};
            String message = bundle.getMessage(ConstantData.EMPTY, args);
            error.addError(message);
        }
        if (error.isEmpty()) {
            return Either.error(error);
        }
        return Either.success(true);
    }

    public Either<Error, Boolean> dataValid(String startDate, String endDate, String reason) {
        return null;
    }

    private Either<Error, Boolean> isValidFormat(String startDate, String endDate) {
        Either<Error, Boolean> res = new Either<Error, Boolean>();
        Error error = new Error();
        if (!DateOperation.isValidDateFormat(startDate)) {
            Object[] args = {bundle.getData(ConstantData.START_DATE)};
            String message = bundle.getMessage(ConstantData.EMPTY, args);
            error.addError(message);
        }
        return res;
    }
}
