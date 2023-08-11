package com.rmn.apiclient.impl.api.models;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.rmn.apiclient.core.model.BaseModel;
import com.rmn.apiclient.core.model.IDisplayable;
import com.rmn.apiclient.core.reflection.EnumUtils;
import com.rmn.apiclient.impl.api.models.submodels.merchant.BonusCommissionType;
import com.rmn.apiclient.impl.api.models.submodels.user.UserGrade;
import java.text.NumberFormat;
import java.util.Date;
import p446vd.C13633n;

public class MerchantBonus extends BaseModel implements IDisplayable {
    public final float amount;
    @Nullable
    public final Date dateEnd = null;
    @Nullable
    public final Date dateStart = null;
    @Nullable
    private final Integer gradeId;
    @Nullable
    public final String text1 = null;
    @Nullable
    public final String text2 = null;
    @NonNull
    public final BonusCommissionType type;

    public MerchantBonus(@NonNull String str, float f, @NonNull BonusCommissionType bonusCommissionType, @Nullable UserGrade userGrade) {
        super(str);
        Integer num = null;
        this.amount = f;
        this.type = bonusCommissionType;
        this.gradeId = userGrade != null ? Integer.valueOf(userGrade.gradeId) : num;
    }

    @NonNull
    public String getAmountText(@NonNull NumberFormat numberFormat) {
        try {
            return numberFormat.format((double) this.amount) + this.type.text;
        } catch (Exception e) {
            C13633n.m31165u(this, e);
            return "";
        }
    }

    @Nullable
    public Date getDateEnd() {
        return this.dateEnd;
    }

    @Nullable
    public Date getDateStart() {
        return this.dateStart;
    }

    @NonNull
    public String getId() {
        return this.f18063id;
    }

    @NonNull
    public UserGrade getUserGrade() {
        UserGrade userGrade = (UserGrade) EnumUtils.findWithSerializedValue(UserGrade.class, this.gradeId);
        if (userGrade != null) {
            return userGrade;
        }
        return UserGrade.DEFAULT;
    }

    public String toString() {
        return "MerchantBonus{id='" + this.f18063id + '\'' + ", amount=" + this.amount + ", type=" + this.type + ", grade=" + getUserGrade() + '}';
    }
}
