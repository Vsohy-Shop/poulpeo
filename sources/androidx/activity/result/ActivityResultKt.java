package androidx.activity.result;

import android.content.Intent;
import kotlin.jvm.internal.C12775o;

/* compiled from: ActivityResult.kt */
public final class ActivityResultKt {
    public static final int component1(ActivityResult activityResult) {
        C12775o.m28639i(activityResult, "<this>");
        return activityResult.getResultCode();
    }

    public static final Intent component2(ActivityResult activityResult) {
        C12775o.m28639i(activityResult, "<this>");
        return activityResult.getData();
    }
}
