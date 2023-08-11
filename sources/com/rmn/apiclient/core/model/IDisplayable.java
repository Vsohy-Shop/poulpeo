package com.rmn.apiclient.core.model;

import androidx.annotation.Nullable;
import java.util.Date;

public interface IDisplayable {
    static boolean isDateFormatValid(@Nullable Date date) {
        if (date == null || date.getTime() <= 0) {
            return false;
        }
        return true;
    }

    static boolean isDatePassed(@Nullable Date date, boolean z) {
        if (!isDateFormatValid(date)) {
            return z;
        }
        if (date.getTime() < new Date().getTime()) {
            return true;
        }
        return false;
    }

    boolean canBeDisplayed() {
        if (!isStarted() || isEnded()) {
            return false;
        }
        return true;
    }

    @Nullable
    Date getDateEnd();

    @Nullable
    Date getDateEndValidity() {
        return getDateEnd();
    }

    @Nullable
    Date getDateStart();

    @Nullable
    Date getDateStartValidity() {
        return getDateStart();
    }

    boolean isEnded() {
        return isDatePassed(getDateEnd(), false);
    }

    boolean isStarted() {
        return isDatePassed(getDateStart(), true);
    }

    boolean isValid() {
        if (!isValidityStarted() || isValidityEnded()) {
            return false;
        }
        return true;
    }

    boolean isValidityEnded() {
        return isDatePassed(getDateEndValidity(), false);
    }

    boolean isValidityEndingSoon(long j) {
        if (!isValidityStarted() || isValidityEnded()) {
            return false;
        }
        Date dateEndValidity = getDateEndValidity();
        if (isDateFormatValid(dateEndValidity) && new Date().getTime() > dateEndValidity.getTime() - j) {
            return true;
        }
        return false;
    }

    boolean isValidityStarted() {
        return isDatePassed(getDateStartValidity(), true);
    }

    boolean isValidityStartingSoon(long j) {
        if (isValidityStarted() || isValidityEnded()) {
            return false;
        }
        Date dateStartValidity = getDateStartValidity();
        if (isDateFormatValid(dateStartValidity) && new Date().getTime() > dateStartValidity.getTime() - j) {
            return true;
        }
        return false;
    }
}
