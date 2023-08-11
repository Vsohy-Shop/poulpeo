package com.google.android.play.core.assetpacks;

import com.google.android.play.core.tasks.C6801j;
import p298z5.C10824a;

public class AssetPackException extends C6801j {

    /* renamed from: b */
    private final int f8550b;

    AssetPackException(int i) {
        super(String.format("Asset Pack Download Error(%d): %s", new Object[]{Integer.valueOf(i), C10824a.m23079a(i)}));
        if (i != 0) {
            this.f8550b = i;
            return;
        }
        throw new IllegalArgumentException("errorCode should not be 0.");
    }
}
