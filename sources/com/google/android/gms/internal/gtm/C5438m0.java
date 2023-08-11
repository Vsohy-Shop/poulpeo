package com.google.android.gms.internal.gtm;

import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.text.TextUtils;
import androidx.autofill.HintConstants;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.android.gms.internal.gtm.C5423l0;
import java.io.IOException;
import java.util.Locale;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: com.google.android.gms.internal.gtm.m0 */
class C5438m0<T extends C5423l0> extends C5392j {

    /* renamed from: c */
    private C5453n0<T> f6122c;

    public C5438m0(C5437m mVar, C5453n0<T> n0Var) {
        super(mVar);
        this.f6122c = n0Var;
    }

    /* renamed from: N0 */
    private final T m8168N0(XmlResourceParser xmlResourceParser) {
        try {
            xmlResourceParser.next();
            int eventType = xmlResourceParser.getEventType();
            while (eventType != 1) {
                if (xmlResourceParser.getEventType() == 2) {
                    String lowerCase = xmlResourceParser.getName().toLowerCase(Locale.US);
                    if (lowerCase.equals("screenname")) {
                        String attributeValue = xmlResourceParser.getAttributeValue((String) null, HintConstants.AUTOFILL_HINT_NAME);
                        String trim = xmlResourceParser.nextText().trim();
                        if (!TextUtils.isEmpty(attributeValue) && !TextUtils.isEmpty(trim)) {
                            this.f6122c.mo33378I(attributeValue, trim);
                        }
                    } else if (lowerCase.equals(TypedValues.Custom.S_STRING)) {
                        String attributeValue2 = xmlResourceParser.getAttributeValue((String) null, HintConstants.AUTOFILL_HINT_NAME);
                        String trim2 = xmlResourceParser.nextText().trim();
                        if (!TextUtils.isEmpty(attributeValue2) && trim2 != null) {
                            this.f6122c.mo33375F(attributeValue2, trim2);
                        }
                    } else if (lowerCase.equals("bool")) {
                        String attributeValue3 = xmlResourceParser.getAttributeValue((String) null, HintConstants.AUTOFILL_HINT_NAME);
                        String trim3 = xmlResourceParser.nextText().trim();
                        if (!TextUtils.isEmpty(attributeValue3) && !TextUtils.isEmpty(trim3)) {
                            try {
                                this.f6122c.mo33379J(attributeValue3, Boolean.parseBoolean(trim3));
                            } catch (NumberFormatException e) {
                                mo33277c0("Error parsing bool configuration value", trim3, e);
                            }
                        }
                    } else if (lowerCase.equals(TypedValues.Custom.S_INT)) {
                        String attributeValue4 = xmlResourceParser.getAttributeValue((String) null, HintConstants.AUTOFILL_HINT_NAME);
                        String trim4 = xmlResourceParser.nextText().trim();
                        if (!TextUtils.isEmpty(attributeValue4) && !TextUtils.isEmpty(trim4)) {
                            try {
                                this.f6122c.mo33377H(attributeValue4, Integer.parseInt(trim4));
                            } catch (NumberFormatException e2) {
                                mo33277c0("Error parsing int configuration value", trim4, e2);
                            }
                        }
                    }
                }
                eventType = xmlResourceParser.next();
            }
        } catch (IOException | XmlPullParserException e3) {
            mo33265H0("Error parsing tracker configuration file", e3);
        }
        return this.f6122c.mo33376G();
    }

    /* renamed from: O0 */
    public final T mo33345O0(int i) {
        try {
            return m8168N0(mo33278j0().mo33339n().getResources().getXml(i));
        } catch (Resources.NotFoundException e) {
            mo33262E0("inflate() called with unknown resourceId", e);
            return null;
        }
    }
}
