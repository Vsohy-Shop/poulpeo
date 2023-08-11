package androidx.compose.runtime;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import p336ef.C11921v;

/* compiled from: Composer.kt */
public final class SkippableUpdater<T> {
    private final Composer composer;

    private /* synthetic */ SkippableUpdater(Composer composer2) {
        this.composer = composer2;
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ SkippableUpdater m35283boximpl(Composer composer2) {
        return new SkippableUpdater(composer2);
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static <T> Composer m35284constructorimpl(Composer composer2) {
        C12775o.m28639i(composer2, "composer");
        return composer2;
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m35285equalsimpl(Composer composer2, Object obj) {
        if ((obj instanceof SkippableUpdater) && C12775o.m28634d(composer2, ((SkippableUpdater) obj).m35290unboximpl())) {
            return true;
        }
        return false;
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m35286equalsimpl0(Composer composer2, Composer composer3) {
        return C12775o.m28634d(composer2, composer3);
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m35287hashCodeimpl(Composer composer2) {
        return composer2.hashCode();
    }

    /* renamed from: toString-impl  reason: not valid java name */
    public static String m35288toStringimpl(Composer composer2) {
        return "SkippableUpdater(composer=" + composer2 + ')';
    }

    /* renamed from: update-impl  reason: not valid java name */
    public static final void m35289updateimpl(Composer composer2, Function1<? super Updater<T>, C11921v> function1) {
        C12775o.m28639i(function1, "block");
        composer2.startReplaceableGroup(509942095);
        function1.invoke(Updater.m35291boximpl(Updater.m35292constructorimpl(composer2)));
        composer2.endReplaceableGroup();
    }

    public boolean equals(Object obj) {
        return m35285equalsimpl(this.composer, obj);
    }

    public int hashCode() {
        return m35287hashCodeimpl(this.composer);
    }

    public String toString() {
        return m35288toStringimpl(this.composer);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ Composer m35290unboximpl() {
        return this.composer;
    }

    public static /* synthetic */ void getComposer$annotations() {
    }
}
