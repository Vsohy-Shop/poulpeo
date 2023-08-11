package com.rmn.api.p322v2.poulpeo.model;

import android.text.TextUtils;
import com.rmn.api.p322v2.main.model.AbstractModel;
import java.util.Date;
import p446vd.C13633n;

/* renamed from: com.rmn.api.v2.poulpeo.model.BasePLPUser */
public abstract class BasePLPUser extends AbstractModel {
    private String avatar_url;
    private Date date_add;
    private EarningAmount earning_amount;
    private String email;
    private String first_name;
    private String gender;
    private PLPUserGrade grade;
    private int id_user;
    private boolean is_admin;
    private String last_name;
    private String login;
    private PLPUserPaylead paylead;
    private ReviewConfig review_config;
    private boolean should_update_payment_info;
    private String sponsor_code;
    private String sponsor_url;

    BasePLPUser() {
    }

    public String getAvatarUrl() {
        return this.avatar_url;
    }

    public String getCompleteName() {
        String str;
        if (!TextUtils.isEmpty(this.first_name)) {
            str = this.first_name;
        } else {
            str = "";
        }
        if (!TextUtils.isEmpty(this.last_name)) {
            if (!TextUtils.isEmpty(str)) {
                str = str + " ";
            }
            str = str + this.last_name;
        }
        if (TextUtils.isEmpty(str)) {
            return this.login;
        }
        return str;
    }

    public Date getDateAdd() {
        return this.date_add;
    }

    public EarningAmount getEarningAmount() {
        return this.earning_amount;
    }

    public String getEmail() {
        return this.email;
    }

    public String getFirstName() {
        return this.first_name;
    }

    public String getGender() {
        return this.gender;
    }

    public PLPUserGrade getGrade() {
        return this.grade;
    }

    public Object getIdentifier() {
        return Integer.valueOf(this.id_user);
    }

    public String getInitials() {
        String str;
        if (!TextUtils.isEmpty(this.first_name)) {
            str = this.first_name.substring(0, 1).toUpperCase();
        } else {
            str = "";
        }
        if (!TextUtils.isEmpty(this.last_name)) {
            str = str + this.last_name.substring(0, 1).toUpperCase();
        }
        if (!TextUtils.isEmpty(str) || TextUtils.isEmpty(this.login)) {
            return str;
        }
        return this.login.substring(0, 1).toUpperCase();
    }

    public String getLastName() {
        return this.last_name;
    }

    public String getLogin() {
        return this.login;
    }

    public ReviewConfig getReviewConfig() {
        return this.review_config;
    }

    public String getSponsorCode() {
        return this.sponsor_code;
    }

    public String getSponsorUrl() {
        return this.sponsor_url;
    }

    public int getUserId() {
        return this.id_user;
    }

    public PLPUserPaylead getUserPaylead() {
        return this.paylead;
    }

    public boolean isAdmin() {
        return this.is_admin;
    }

    public boolean isModelValidAfterParsing() {
        if (this.id_user <= 0) {
            return false;
        }
        return true;
    }

    public boolean isNewUser() {
        EarningAmount earningAmount = this.earning_amount;
        if (earningAmount == null) {
            return false;
        }
        double total = earningAmount.getTotal();
        if (total == 3.0d || total == 5.0d) {
            return true;
        }
        return false;
    }

    public void setEarningAmount(EarningAmount earningAmount) {
        if (earningAmount == null) {
            throw new IllegalArgumentException();
        } else if (this.earning_amount != null) {
            C13633n.m31145a(this, "Tried to re-set a value to earning_amount");
        } else {
            this.earning_amount = earningAmount;
        }
    }

    /* access modifiers changed from: package-private */
    public final void setShouldUpdatePaymentInfo(boolean z) {
        this.should_update_payment_info = z;
    }

    public boolean shouldUpdatePaymentInfo() {
        return this.should_update_payment_info;
    }

    /* access modifiers changed from: package-private */
    public final void updateLoginInfo(String str, String str2) {
        if (str != null) {
            this.login = str;
        }
        if (str2 != null) {
            this.email = str2;
        }
    }

    /* access modifiers changed from: package-private */
    public void updateName(String str, String str2, boolean z) {
        this.last_name = str;
        this.first_name = str2;
        this.should_update_payment_info = z;
    }

    BasePLPUser(BasePLPUser basePLPUser) {
        this.id_user = basePLPUser.id_user;
        this.login = basePLPUser.login;
        this.email = basePLPUser.email;
        this.avatar_url = basePLPUser.avatar_url;
        this.gender = basePLPUser.gender;
        this.first_name = basePLPUser.first_name;
        this.last_name = basePLPUser.last_name;
        this.date_add = basePLPUser.date_add;
        this.earning_amount = basePLPUser.earning_amount;
        this.review_config = basePLPUser.review_config;
        this.is_admin = basePLPUser.is_admin;
        this.grade = basePLPUser.grade;
        this.sponsor_code = basePLPUser.sponsor_code;
        this.sponsor_url = basePLPUser.sponsor_url;
        this.should_update_payment_info = basePLPUser.should_update_payment_info;
    }
}
