package com.google.firebase.messaging;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.collection.ArrayMap;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.firebase.messaging.b */
/* compiled from: com.google.firebase:firebase-messaging@@23.0.0 */
public final class C6959b {

    /* renamed from: a */
    public static final long f9245a = TimeUnit.MINUTES.toMillis(3);

    /* renamed from: com.google.firebase.messaging.b$a */
    /* compiled from: com.google.firebase:firebase-messaging@@23.0.0 */
    public static final class C6960a {
        @NonNull
        /* renamed from: a */
        public static ArrayMap<String, String> m12223a(@NonNull Bundle bundle) {
            ArrayMap<String, String> arrayMap = new ArrayMap<>();
            for (String next : bundle.keySet()) {
                Object obj = bundle.get(next);
                if (obj instanceof String) {
                    String str = (String) obj;
                    if (!next.startsWith("google.") && !next.startsWith("gcm.") && !next.equals(TypedValues.TransitionType.S_FROM) && !next.equals("message_type") && !next.equals("collapse_key")) {
                        arrayMap.put(next, str);
                    }
                }
            }
            return arrayMap;
        }
    }
}
