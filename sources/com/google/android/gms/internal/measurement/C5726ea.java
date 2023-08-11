package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.ea */
/* compiled from: com.google.android.gms:play-services-measurement-base@@20.0.0 */
final class C5726ea {

    /* renamed from: a */
    private static final C5709da f6887a;

    /* renamed from: b */
    private static final C5709da f6888b = new C5709da();

    static {
        C5709da daVar;
        try {
            daVar = (C5709da) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            daVar = null;
        }
        f6887a = daVar;
    }

    /* renamed from: a */
    static C5709da m9145a() {
        return f6887a;
    }

    /* renamed from: b */
    static C5709da m9146b() {
        return f6888b;
    }
}
