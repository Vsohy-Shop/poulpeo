package androidx.compose.material3;

import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.State;
import kotlin.jvm.internal.C12775o;
import p336ef.C11921v;
import p355hf.C12074d;
import p355hf.C12079g;
import p404of.C13088o;
import p466yf.C13995l0;
import p466yf.C14004n0;
import p466yf.C14054y1;

/* compiled from: Slider.kt */
final class RangeSliderLogic {
    private final MutableInteractionSource endInteractionSource;
    private final State<C13088o<Boolean, Float, C11921v>> onDrag;
    private final State<Float> rawOffsetEnd;
    private final State<Float> rawOffsetStart;
    private final MutableInteractionSource startInteractionSource;

    public RangeSliderLogic(MutableInteractionSource mutableInteractionSource, MutableInteractionSource mutableInteractionSource2, State<Float> state, State<Float> state2, State<? extends C13088o<? super Boolean, ? super Float, C11921v>> state3) {
        C12775o.m28639i(mutableInteractionSource, "startInteractionSource");
        C12775o.m28639i(mutableInteractionSource2, "endInteractionSource");
        C12775o.m28639i(state, "rawOffsetStart");
        C12775o.m28639i(state2, "rawOffsetEnd");
        C12775o.m28639i(state3, "onDrag");
        this.startInteractionSource = mutableInteractionSource;
        this.endInteractionSource = mutableInteractionSource2;
        this.rawOffsetStart = state;
        this.rawOffsetEnd = state2;
        this.onDrag = state3;
    }

    public final MutableInteractionSource activeInteraction(boolean z) {
        if (z) {
            return this.startInteractionSource;
        }
        return this.endInteractionSource;
    }

    public final void captureThumb(boolean z, float f, Interaction interaction, C13995l0 l0Var) {
        State<Float> state;
        C12775o.m28639i(interaction, "interaction");
        C12775o.m28639i(l0Var, "scope");
        C13088o value = this.onDrag.getValue();
        Boolean valueOf = Boolean.valueOf(z);
        if (z) {
            state = this.rawOffsetStart;
        } else {
            state = this.rawOffsetEnd;
        }
        value.invoke(valueOf, Float.valueOf(f - state.getValue().floatValue()));
        C14054y1 unused = C13985j.m32422d(l0Var, (C12079g) null, (C14004n0) null, new RangeSliderLogic$captureThumb$1(this, z, interaction, (C12074d<? super RangeSliderLogic$captureThumb$1>) null), 3, (Object) null);
    }

    public final int compareOffsets(float f) {
        return Float.compare(Math.abs(this.rawOffsetStart.getValue().floatValue() - f), Math.abs(this.rawOffsetEnd.getValue().floatValue() - f));
    }

    public final MutableInteractionSource getEndInteractionSource() {
        return this.endInteractionSource;
    }

    public final State<C13088o<Boolean, Float, C11921v>> getOnDrag() {
        return this.onDrag;
    }

    public final State<Float> getRawOffsetEnd() {
        return this.rawOffsetEnd;
    }

    public final State<Float> getRawOffsetStart() {
        return this.rawOffsetStart;
    }

    public final MutableInteractionSource getStartInteractionSource() {
        return this.startInteractionSource;
    }
}
