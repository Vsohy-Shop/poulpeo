package com.appboy.enums;

import com.appboy.Constants;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p057d0.C7213c;
import p126j0.C8266c;
import p404of.C13074a;

public enum Gender implements C7213c<String> {
    MALE("m"),
    FEMALE("f"),
    OTHER("o"),
    UNKNOWN("u"),
    NOT_APPLICABLE(Constants.APPBOY_PUSH_CUSTOM_NOTIFICATION_ID),
    PREFER_NOT_TO_SAY(Constants.APPBOY_PUSH_PRIORITY_KEY);
    
    public static final Companion Companion = null;
    private final String value;

    public static final class Companion {

        /* renamed from: com.appboy.enums.Gender$Companion$a */
        static final class C4158a extends C12777p implements C13074a<String> {

            /* renamed from: b */
            final /* synthetic */ String f3279b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C4158a(String str) {
                super(0);
                this.f3279b = str;
            }

            /* renamed from: a */
            public final String invoke() {
                return "No gender with value " + this.f3279b + '.';
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Gender getGender(String str) {
            C12775o.m28639i(str, "value");
            Gender[] values = Gender.values();
            int length = values.length;
            Gender gender = null;
            int i = 0;
            Gender gender2 = null;
            boolean z = false;
            while (true) {
                if (i < length) {
                    Gender gender3 = values[i];
                    i++;
                    if (C12775o.m28634d(gender3.getValue(), str)) {
                        if (z) {
                            break;
                        }
                        z = true;
                        gender2 = gender3;
                    }
                } else if (z) {
                    gender = gender2;
                }
            }
            if (gender == null) {
                C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11651g, (Throwable) null, false, new C4158a(str), 6, (Object) null);
            }
            return gender;
        }

        private Companion() {
        }
    }

    static {
        Companion = new Companion((DefaultConstructorMarker) null);
    }

    private Gender(String str) {
        this.value = str;
    }

    public static final Gender getGender(String str) {
        return Companion.getGender(str);
    }

    public final String getValue() {
        return this.value;
    }

    public String forJsonPut() {
        return this.value;
    }
}
