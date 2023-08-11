package androidx.compose.animation;

import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Immutable
/* compiled from: EnterExitTransition.kt */
public final class TransitionData {
    private final ChangeSize changeSize;
    private final Fade fade;
    private final Scale scale;
    private final Slide slide;

    public TransitionData() {
        this((Fade) null, (Slide) null, (ChangeSize) null, (Scale) null, 15, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ TransitionData copy$default(TransitionData transitionData, Fade fade2, Slide slide2, ChangeSize changeSize2, Scale scale2, int i, Object obj) {
        if ((i & 1) != 0) {
            fade2 = transitionData.fade;
        }
        if ((i & 2) != 0) {
            slide2 = transitionData.slide;
        }
        if ((i & 4) != 0) {
            changeSize2 = transitionData.changeSize;
        }
        if ((i & 8) != 0) {
            scale2 = transitionData.scale;
        }
        return transitionData.copy(fade2, slide2, changeSize2, scale2);
    }

    public final Fade component1() {
        return this.fade;
    }

    public final Slide component2() {
        return this.slide;
    }

    public final ChangeSize component3() {
        return this.changeSize;
    }

    public final Scale component4() {
        return this.scale;
    }

    public final TransitionData copy(Fade fade2, Slide slide2, ChangeSize changeSize2, Scale scale2) {
        return new TransitionData(fade2, slide2, changeSize2, scale2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TransitionData)) {
            return false;
        }
        TransitionData transitionData = (TransitionData) obj;
        if (C12775o.m28634d(this.fade, transitionData.fade) && C12775o.m28634d(this.slide, transitionData.slide) && C12775o.m28634d(this.changeSize, transitionData.changeSize) && C12775o.m28634d(this.scale, transitionData.scale)) {
            return true;
        }
        return false;
    }

    public final ChangeSize getChangeSize() {
        return this.changeSize;
    }

    public final Fade getFade() {
        return this.fade;
    }

    public final Scale getScale() {
        return this.scale;
    }

    public final Slide getSlide() {
        return this.slide;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        Fade fade2 = this.fade;
        int i4 = 0;
        if (fade2 == null) {
            i = 0;
        } else {
            i = fade2.hashCode();
        }
        int i5 = i * 31;
        Slide slide2 = this.slide;
        if (slide2 == null) {
            i2 = 0;
        } else {
            i2 = slide2.hashCode();
        }
        int i6 = (i5 + i2) * 31;
        ChangeSize changeSize2 = this.changeSize;
        if (changeSize2 == null) {
            i3 = 0;
        } else {
            i3 = changeSize2.hashCode();
        }
        int i7 = (i6 + i3) * 31;
        Scale scale2 = this.scale;
        if (scale2 != null) {
            i4 = scale2.hashCode();
        }
        return i7 + i4;
    }

    public String toString() {
        return "TransitionData(fade=" + this.fade + ", slide=" + this.slide + ", changeSize=" + this.changeSize + ", scale=" + this.scale + ')';
    }

    public TransitionData(Fade fade2, Slide slide2, ChangeSize changeSize2, Scale scale2) {
        this.fade = fade2;
        this.slide = slide2;
        this.changeSize = changeSize2;
        this.scale = scale2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TransitionData(Fade fade2, Slide slide2, ChangeSize changeSize2, Scale scale2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : fade2, (i & 2) != 0 ? null : slide2, (i & 4) != 0 ? null : changeSize2, (i & 8) != 0 ? null : scale2);
    }
}
