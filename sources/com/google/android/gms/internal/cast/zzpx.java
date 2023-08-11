package com.google.android.gms.internal.cast;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-cast@@21.2.0 */
public final class zzpx extends IOException {
    zzpx() {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.");
    }

    zzpx(String str, Throwable th) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(String.valueOf(str)), th);
    }

    zzpx(Throwable th) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
    }
}
