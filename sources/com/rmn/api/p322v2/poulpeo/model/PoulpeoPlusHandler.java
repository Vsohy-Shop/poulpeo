package com.rmn.api.p322v2.poulpeo.model;

import com.rmn.api.p322v2.common.model.BaseMerchant;
import com.rmn.api.p322v2.common.model.submodel.MerchantBonusObject;
import java.util.Date;

/* renamed from: com.rmn.api.v2.poulpeo.model.PoulpeoPlusHandler */
public final class PoulpeoPlusHandler {
    public static boolean hasBonus(BaseMerchant baseMerchant) {
        MerchantBonusObject merchantBonus;
        if (baseMerchant == null || !baseMerchant.hasCashback() || (merchantBonus = baseMerchant.getMerchantBonus()) == null) {
            return false;
        }
        PLPUserGrade findUserGrade = PLPUserGrade.findUserGrade(merchantBonus.getGrade());
        long time = new Date().getTime();
        Date dateStart = merchantBonus.getDateStart();
        Date dateEnd = merchantBonus.getDateEnd();
        if (findUserGrade != PLPUserGrade.POULPEO_PLUS) {
            return false;
        }
        if (dateStart != null && dateStart.getTime() > time) {
            return false;
        }
        if (dateEnd == null || time <= dateEnd.getTime()) {
            return true;
        }
        return false;
    }

    public static boolean isPoulpeoPlus(PLPUser pLPUser) {
        if (pLPUser == null) {
            return false;
        }
        return isPoulpeoPlus(pLPUser.getGrade());
    }

    public static boolean isPoulpeoPlus(PLPUserGrade pLPUserGrade) {
        return pLPUserGrade == PLPUserGrade.POULPEO_PLUS;
    }
}
