package androidx.core.location;

import android.location.Location;
import kotlin.jvm.internal.C12775o;

/* compiled from: Location.kt */
public final class LocationKt {
    public static final double component1(Location location) {
        C12775o.m28639i(location, "<this>");
        return location.getLatitude();
    }

    public static final double component2(Location location) {
        C12775o.m28639i(location, "<this>");
        return location.getLongitude();
    }
}
