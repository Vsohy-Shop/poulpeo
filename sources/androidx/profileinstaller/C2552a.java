package androidx.profileinstaller;

/* renamed from: androidx.profileinstaller.a */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C2552a implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ DeviceProfileWriter f1070b;

    /* renamed from: c */
    public final /* synthetic */ int f1071c;

    /* renamed from: d */
    public final /* synthetic */ Object f1072d;

    public /* synthetic */ C2552a(DeviceProfileWriter deviceProfileWriter, int i, Object obj) {
        this.f1070b = deviceProfileWriter;
        this.f1071c = i;
        this.f1072d = obj;
    }

    public final void run() {
        this.f1070b.lambda$result$0(this.f1071c, this.f1072d);
    }
}
