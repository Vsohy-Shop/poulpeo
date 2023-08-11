package com.appboy.enums;

import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p057d0.C7213c;

public enum NotificationSubscriptionType implements C7213c<String> {
    OPTED_IN("opted_in"),
    SUBSCRIBED("subscribed"),
    UNSUBSCRIBED("unsubscribed");
    
    public static final Companion Companion = null;
    /* access modifiers changed from: private */
    public static final Map<String, NotificationSubscriptionType> map = null;
    private final String key;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final NotificationSubscriptionType fromValue(String str) {
            String str2;
            Map access$getMap$cp = NotificationSubscriptionType.map;
            NotificationSubscriptionType notificationSubscriptionType = null;
            if (str == null) {
                str2 = null;
            } else {
                Locale locale = Locale.US;
                C12775o.m28638h(locale, "US");
                str2 = str.toLowerCase(locale);
                C12775o.m28638h(str2, "this as java.lang.String).toLowerCase(locale)");
            }
            if (str2 == null) {
                str2 = "";
            }
            Object obj = access$getMap$cp.get(str2);
            if (obj != null) {
                notificationSubscriptionType = obj;
            }
            return notificationSubscriptionType;
        }

        private Companion() {
        }
    }

    static {
        int i;
        Companion = new Companion((DefaultConstructorMarker) null);
        NotificationSubscriptionType[] values = values();
        LinkedHashMap linkedHashMap = new LinkedHashMap(C13537l.m30877d(C12714q0.m28413d(values.length), 16));
        int length = values.length;
        while (i < length) {
            NotificationSubscriptionType notificationSubscriptionType = values[i];
            i++;
            linkedHashMap.put(notificationSubscriptionType.getKey(), notificationSubscriptionType);
        }
        map = linkedHashMap;
    }

    private NotificationSubscriptionType(String str) {
        this.key = str;
    }

    public static final NotificationSubscriptionType fromValue(String str) {
        return Companion.fromValue(str);
    }

    public final String getKey() {
        return this.key;
    }

    public String forJsonPut() {
        return this.key;
    }
}
