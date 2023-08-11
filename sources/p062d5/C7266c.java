package p062d5;

import android.os.IInterface;
import p036b5.C2888a;

/* renamed from: d5.c */
/* compiled from: com.google.android.gms:play-services-flags@@17.0.1 */
public interface C7266c extends IInterface {
    boolean getBooleanFlagValue(String str, boolean z, int i);

    int getIntFlagValue(String str, int i, int i2);

    long getLongFlagValue(String str, long j, int i);

    String getStringFlagValue(String str, String str2, int i);

    void init(C2888a aVar);
}
