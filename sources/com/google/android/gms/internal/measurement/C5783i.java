package com.google.android.gms.internal.measurement;

import androidx.exifinterface.media.ExifInterface;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.i */
/* compiled from: com.google.android.gms:play-services-measurement@@20.0.0 */
public final class C5783i implements C5914q {

    /* renamed from: b */
    private final Double f6999b;

    public C5783i(Double d) {
        if (d == null) {
            this.f6999b = Double.valueOf(Double.NaN);
        } else {
            this.f6999b = d;
        }
    }

    /* renamed from: b */
    public final String mo33956b() {
        int i;
        if (Double.isNaN(this.f6999b.doubleValue())) {
            return "NaN";
        }
        if (!Double.isInfinite(this.f6999b.doubleValue())) {
            BigDecimal stripTrailingZeros = BigDecimal.valueOf(this.f6999b.doubleValue()).stripTrailingZeros();
            DecimalFormat decimalFormat = new DecimalFormat("0E0");
            decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
            if (stripTrailingZeros.scale() > 0) {
                i = stripTrailingZeros.precision();
            } else {
                i = stripTrailingZeros.scale();
            }
            decimalFormat.setMinimumFractionDigits(i - 1);
            String format = decimalFormat.format(stripTrailingZeros);
            int indexOf = format.indexOf(ExifInterface.LONGITUDE_EAST);
            if (indexOf <= 0) {
                return format;
            }
            int parseInt = Integer.parseInt(format.substring(indexOf + 1));
            if ((parseInt >= 0 || parseInt <= -7) && (parseInt < 0 || parseInt >= 21)) {
                return format.replace("E-", "e-").replace(ExifInterface.LONGITUDE_EAST, "e+");
            }
            return stripTrailingZeros.toPlainString();
        } else if (this.f6999b.doubleValue() > 0.0d) {
            return "Infinity";
        } else {
            return "-Infinity";
        }
    }

    /* renamed from: c */
    public final C5914q mo33957c() {
        return new C5783i(this.f6999b);
    }

    /* renamed from: d */
    public final Boolean mo33958d() {
        boolean z = false;
        if (!Double.isNaN(this.f6999b.doubleValue()) && this.f6999b.doubleValue() != 0.0d) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C5783i)) {
            return false;
        }
        return this.f6999b.equals(((C5783i) obj).f6999b);
    }

    public final int hashCode() {
        return this.f6999b.hashCode();
    }

    /* renamed from: r */
    public final C5914q mo33965r(String str, C6015w4 w4Var, List<C5914q> list) {
        if ("toString".equals(str)) {
            return new C5978u(mo33956b());
        }
        throw new IllegalArgumentException(String.format("%s.%s is not a function.", new Object[]{mo33956b(), str}));
    }

    public final String toString() {
        return mo33956b();
    }

    /* renamed from: y */
    public final Double mo33971y() {
        return this.f6999b;
    }

    /* renamed from: z */
    public final Iterator<C5914q> mo33972z() {
        return null;
    }
}
