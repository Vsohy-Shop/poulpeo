package com.braze.p055ui.inappmessage;

import androidx.annotation.Keep;
import java.util.Locale;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: com.braze.ui.inappmessage.InAppMessageOperation */
/* compiled from: InAppMessageOperation.kt */
public enum InAppMessageOperation {
    DISPLAY_NOW,
    DISPLAY_LATER,
    DISCARD;
    

    /* renamed from: b */
    public static final Companion f3611b = null;

    @Keep
    /* renamed from: com.braze.ui.inappmessage.InAppMessageOperation$Companion */
    /* compiled from: InAppMessageOperation.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InAppMessageOperation fromValue(String str) {
            String str2;
            InAppMessageOperation inAppMessageOperation;
            String name;
            InAppMessageOperation[] values = InAppMessageOperation.values();
            int length = values.length;
            int i = 0;
            do {
                str2 = null;
                if (i >= length) {
                    return null;
                }
                inAppMessageOperation = values[i];
                i++;
                name = inAppMessageOperation.name();
                if (str != null) {
                    Locale locale = Locale.US;
                    C12775o.m28638h(locale, "US");
                    str2 = str.toUpperCase(locale);
                    C12775o.m28638h(str2, "this as java.lang.String).toUpperCase(locale)");
                }
            } while (!C12775o.m28634d(name, str2));
            return inAppMessageOperation;
        }
    }

    static {
        f3611b = new Companion((DefaultConstructorMarker) null);
    }
}
