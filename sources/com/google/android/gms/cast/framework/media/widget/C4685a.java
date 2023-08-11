package com.google.android.gms.cast.framework.media.widget;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.SeekBar;
import p140k4.C8562d;
import p286y4.C10680n;

/* renamed from: com.google.android.gms.cast.framework.media.widget.a */
/* compiled from: com.google.android.gms:play-services-cast-framework@@21.2.0 */
final class C4685a extends View.AccessibilityDelegate {

    /* renamed from: a */
    final /* synthetic */ CastSeekBar f4798a;

    /* synthetic */ C4685a(CastSeekBar castSeekBar, C8562d dVar) {
        this.f4798a = castSeekBar;
    }

    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        accessibilityEvent.setClassName(SeekBar.class.getName());
        accessibilityEvent.setItemCount(this.f4798a.f4781b.f12229b);
        accessibilityEvent.setCurrentItemIndex(this.f4798a.getProgress());
    }

    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(SeekBar.class.getName());
        if (C10680n.m22698b() && view.isEnabled()) {
            accessibilityNodeInfo.addAction(4096);
            accessibilityNodeInfo.addAction(8192);
        }
    }

    public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        if (!view.isEnabled()) {
            return false;
        }
        if (super.performAccessibilityAction(view, i, bundle)) {
            return true;
        }
        if (C10680n.m22698b() && (i == 4096 || i == 8192)) {
            this.f4798a.m6298g();
            CastSeekBar castSeekBar = this.f4798a;
            int i2 = castSeekBar.f4781b.f12229b / 20;
            if (i == 8192) {
                i2 = -i2;
            }
            castSeekBar.m6297f(castSeekBar.getProgress() + i2);
            this.f4798a.m6299h();
        }
        return false;
    }
}
