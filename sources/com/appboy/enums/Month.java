package com.appboy.enums;

import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p126j0.C8266c;
import p404of.C13074a;

public enum Month {
    JANUARY(0),
    FEBRUARY(1),
    MARCH(2),
    APRIL(3),
    MAY(4),
    JUNE(5),
    JULY(6),
    AUGUST(7),
    SEPTEMBER(8),
    OCTOBER(9),
    NOVEMBER(10),
    DECEMBER(11);
    
    public static final Companion Companion = null;
    private final int value;

    public static final class Companion {

        /* renamed from: com.appboy.enums.Month$Companion$a */
        static final class C4159a extends C12777p implements C13074a<String> {

            /* renamed from: b */
            final /* synthetic */ int f3280b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C4159a(int i) {
                super(0);
                this.f3280b = i;
            }

            /* renamed from: a */
            public final String invoke() {
                return "No month with value " + this.f3280b + ", value must be in (0,11)";
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Month getMonth(int i) {
            Month month;
            boolean z;
            Month[] values = Month.values();
            int length = values.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    month = null;
                    break;
                }
                month = values[i2];
                i2++;
                if (month.getValue() == i) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (z) {
                    break;
                }
            }
            if (month != null) {
                return month;
            }
            C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11651g, (Throwable) null, false, new C4159a(i), 6, (Object) null);
            return null;
        }

        private Companion() {
        }
    }

    static {
        Companion = new Companion((DefaultConstructorMarker) null);
    }

    private Month(int i) {
        this.value = i;
    }

    public static final Month getMonth(int i) {
        return Companion.getMonth(i);
    }

    public final int getValue() {
        return this.value;
    }
}
