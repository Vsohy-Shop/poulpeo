package com.rmn.apiclient.impl.api.models;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.rmn.apiclient.core.model.BaseModel;
import com.rmn.apiclient.impl.api.models.submodels.cashback.CommissionType;
import java.text.NumberFormat;
import p446vd.C13631l;
import p446vd.C13633n;

public class CashbackObject extends BaseModel {
    private final boolean specificationCashbackVariableStatus;
    @NonNull
    private final CommissionType specificationCommissionType;
    private final float specificationUsersSpecificationStandardCashbackRate;
    private final float specificationUsersSpecificationStandardCashbackRateTtc;
    @NonNull
    private final String specificationUsersSpecificationStandardConditionGenerated;
    @Nullable
    private final Float specificationUsersSpecificationStandardPreviousCashbackRate;

    public CashbackObject(@NonNull String str, @NonNull CommissionType commissionType, boolean z, float f, float f2, @Nullable Float f3, @NonNull String str2) {
        super(str);
        this.specificationCommissionType = commissionType;
        this.specificationCashbackVariableStatus = z;
        this.specificationUsersSpecificationStandardCashbackRate = f;
        this.specificationUsersSpecificationStandardCashbackRateTtc = f2;
        this.specificationUsersSpecificationStandardPreviousCashbackRate = f3;
        this.specificationUsersSpecificationStandardConditionGenerated = str2;
    }

    @NonNull
    private String getFormattedCashbackText(@NonNull NumberFormat numberFormat, @Nullable String str, @Nullable String str2, float f) {
        try {
            String str3 = numberFormat.format((double) f) + getCommissionType().text;
            if (!TextUtils.isEmpty(str) && isVariable()) {
                str3 = String.format(getValidTextFormat(str), new Object[]{str3});
            }
            if (TextUtils.isEmpty(str2)) {
                return str3;
            }
            return String.format(getValidTextFormat(str2), new Object[]{str3});
        } catch (Exception e) {
            C13633n.m31165u(this, e);
            return "";
        }
    }

    @NonNull
    private String getValidTextFormat(@Nullable String str) {
        if (str == null) {
            return "";
        }
        String[] strArr = {"%a", "%e", "%f", "%g", "%b", "%c", TimeModel.NUMBER_FORMAT, "%o", "%x", "%h", "%n", "%s", "%t"};
        String replaceAll = str.replaceAll("%", "%%");
        for (int i = 0; i < 13; i++) {
            String str2 = strArr[i];
            replaceAll = replaceAll.replaceAll("%" + str2, str2);
        }
        return replaceAll;
    }

    @NonNull
    public String getCashbackText(@NonNull NumberFormat numberFormat, @NonNull String str) {
        return getFormattedCashbackText(numberFormat, str, (String) null, getRate());
    }

    @NonNull
    public CommissionType getCommissionType() {
        return this.specificationCommissionType;
    }

    @NonNull
    public String getHtmlConditions() {
        if (!hasConditions()) {
            return "";
        }
        return this.specificationUsersSpecificationStandardConditionGenerated;
    }

    @NonNull
    public String getId() {
        return this.f18063id;
    }

    public float getNonNullPreviousRate() {
        Float f = this.specificationUsersSpecificationStandardPreviousCashbackRate;
        if (f != null) {
            return f.floatValue();
        }
        return 0.0f;
    }

    @NonNull
    public String getPlainTextConditions() {
        return C13631l.m31143a(getHtmlConditions());
    }

    @NonNull
    public String getPreviousCashbackText(@NonNull NumberFormat numberFormat, @NonNull String str) {
        if (!hasIncrease()) {
            return "";
        }
        return getFormattedCashbackText(numberFormat, (String) null, str, getNonNullPreviousRate());
    }

    public float getRate() {
        return this.specificationUsersSpecificationStandardCashbackRateTtc;
    }

    @NonNull
    public String getShortCashbackText(@NonNull NumberFormat numberFormat) {
        return getFormattedCashbackText(numberFormat, (String) null, (String) null, getRate());
    }

    @NonNull
    public String getShortPreviousCashbackText(@NonNull NumberFormat numberFormat) {
        if (!hasIncrease()) {
            return "";
        }
        return getFormattedCashbackText(numberFormat, (String) null, (String) null, getNonNullPreviousRate());
    }

    public boolean hasConditions() {
        return !TextUtils.isEmpty(this.specificationUsersSpecificationStandardConditionGenerated);
    }

    public boolean hasIncrease() {
        float nonNullPreviousRate = getNonNullPreviousRate();
        if (nonNullPreviousRate <= 0.0f || getRate() <= nonNullPreviousRate) {
            return false;
        }
        return true;
    }

    public boolean isVariable() {
        return this.specificationCashbackVariableStatus;
    }

    @NonNull
    public String toString() {
        return "CashbackObject{id='" + this.f18063id + '\'' + "cashback='" + getShortCashbackText(NumberFormat.getInstance()) + '\'' + "previousCashback='" + getShortPreviousCashbackText(NumberFormat.getInstance()) + '\'' + '}';
    }

    @NonNull
    public String getCashbackText(@NonNull NumberFormat numberFormat, @NonNull String str, @NonNull String str2) {
        return getFormattedCashbackText(numberFormat, str, str2, getRate());
    }
}
