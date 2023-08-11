package p042bo.app;

import java.math.BigDecimal;
import java.math.RoundingMode;
import kotlin.jvm.internal.C12775o;

/* renamed from: bo.app.u3 */
public final class C3728u3 {
    /* renamed from: a */
    public static final BigDecimal m3974a(BigDecimal bigDecimal) {
        C12775o.m28639i(bigDecimal, "<this>");
        BigDecimal scale = bigDecimal.setScale(2, RoundingMode.HALF_UP);
        C12775o.m28638h(scale, "this.setScale(2, RoundingMode.HALF_UP)");
        return scale;
    }
}
