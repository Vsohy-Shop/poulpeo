package androidx.compose.p002ui.input.key;

import kotlin.jvm.internal.C12775o;

/* renamed from: androidx.compose.ui.input.key.KeyEvent */
/* compiled from: KeyEvent.kt */
public final class KeyEvent {
    private final android.view.KeyEvent nativeKeyEvent;

    private /* synthetic */ KeyEvent(android.view.KeyEvent keyEvent) {
        this.nativeKeyEvent = keyEvent;
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ KeyEvent m37009boximpl(android.view.KeyEvent keyEvent) {
        return new KeyEvent(keyEvent);
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static android.view.KeyEvent m37010constructorimpl(android.view.KeyEvent keyEvent) {
        C12775o.m28639i(keyEvent, "nativeKeyEvent");
        return keyEvent;
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m37011equalsimpl(android.view.KeyEvent keyEvent, Object obj) {
        if ((obj instanceof KeyEvent) && C12775o.m28634d(keyEvent, ((KeyEvent) obj).m37015unboximpl())) {
            return true;
        }
        return false;
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m37012equalsimpl0(android.view.KeyEvent keyEvent, android.view.KeyEvent keyEvent2) {
        return C12775o.m28634d(keyEvent, keyEvent2);
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m37013hashCodeimpl(android.view.KeyEvent keyEvent) {
        return keyEvent.hashCode();
    }

    /* renamed from: toString-impl  reason: not valid java name */
    public static String m37014toStringimpl(android.view.KeyEvent keyEvent) {
        return "KeyEvent(nativeKeyEvent=" + keyEvent + ')';
    }

    public boolean equals(Object obj) {
        return m37011equalsimpl(this.nativeKeyEvent, obj);
    }

    public final android.view.KeyEvent getNativeKeyEvent() {
        return this.nativeKeyEvent;
    }

    public int hashCode() {
        return m37013hashCodeimpl(this.nativeKeyEvent);
    }

    public String toString() {
        return m37014toStringimpl(this.nativeKeyEvent);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ android.view.KeyEvent m37015unboximpl() {
        return this.nativeKeyEvent;
    }
}
