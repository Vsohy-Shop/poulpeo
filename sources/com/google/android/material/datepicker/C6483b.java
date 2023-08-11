package com.google.android.material.datepicker;

/* renamed from: com.google.android.material.datepicker.b */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6483b implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ DateFormatTextWatcher f8516b;

    /* renamed from: c */
    public final /* synthetic */ long f8517c;

    public /* synthetic */ C6483b(DateFormatTextWatcher dateFormatTextWatcher, long j) {
        this.f8516b = dateFormatTextWatcher;
        this.f8517c = j;
    }

    public final void run() {
        this.f8516b.lambda$createRangeErrorCallback$1(this.f8517c);
    }
}
