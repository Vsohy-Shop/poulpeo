package com.google.android.play.core.assetpacks;

import java.io.File;
import java.io.FilenameFilter;

/* renamed from: com.google.android.play.core.assetpacks.j2 */
final /* synthetic */ class C6731j2 implements FilenameFilter {

    /* renamed from: a */
    static final FilenameFilter f8691a = new C6731j2();

    private C6731j2() {
    }

    public final boolean accept(File file, String str) {
        return C6735k2.f8697a.matcher(str).matches();
    }
}
