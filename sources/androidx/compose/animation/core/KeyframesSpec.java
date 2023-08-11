package androidx.compose.animation.core;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p336ef.C11906l;
import p336ef.C11915r;

@Immutable
/* compiled from: AnimationSpec.kt */
public final class KeyframesSpec<T> implements DurationBasedAnimationSpec<T> {
    private final KeyframesSpecConfig<T> config;

    @StabilityInferred(parameters = 0)
    /* compiled from: AnimationSpec.kt */
    public static final class KeyframesSpecConfig<T> {
        public static final int $stable = 8;
        private int delayMillis;
        private int durationMillis = AnimationConstants.DefaultDurationMillis;
        private final Map<Integer, KeyframeEntity<T>> keyframes = new LinkedHashMap();

        /* renamed from: at */
        public final KeyframeEntity<T> mo4121at(T t, int i) {
            KeyframeEntity<T> keyframeEntity = new KeyframeEntity<>(t, (Easing) null, 2, (DefaultConstructorMarker) null);
            this.keyframes.put(Integer.valueOf(i), keyframeEntity);
            return keyframeEntity;
        }

        public boolean equals(Object obj) {
            if (obj instanceof KeyframesSpecConfig) {
                KeyframesSpecConfig keyframesSpecConfig = (KeyframesSpecConfig) obj;
                if (this.delayMillis == keyframesSpecConfig.delayMillis && this.durationMillis == keyframesSpecConfig.durationMillis && C12775o.m28634d(this.keyframes, keyframesSpecConfig.keyframes)) {
                    return true;
                }
                return false;
            }
            return false;
        }

        public final int getDelayMillis() {
            return this.delayMillis;
        }

        public final int getDurationMillis() {
            return this.durationMillis;
        }

        public final Map<Integer, KeyframeEntity<T>> getKeyframes$animation_core_release() {
            return this.keyframes;
        }

        public int hashCode() {
            return (((this.durationMillis * 31) + this.delayMillis) * 31) + this.keyframes.hashCode();
        }

        public final void setDelayMillis(int i) {
            this.delayMillis = i;
        }

        public final void setDurationMillis(int i) {
            this.durationMillis = i;
        }

        public final void with(KeyframeEntity<T> keyframeEntity, Easing easing) {
            C12775o.m28639i(keyframeEntity, "<this>");
            C12775o.m28639i(easing, "easing");
            keyframeEntity.setEasing$animation_core_release(easing);
        }
    }

    public KeyframesSpec(KeyframesSpecConfig<T> keyframesSpecConfig) {
        C12775o.m28639i(keyframesSpecConfig, "config");
        this.config = keyframesSpecConfig;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof KeyframesSpec) || !C12775o.m28634d(this.config, ((KeyframesSpec) obj).config)) {
            return false;
        }
        return true;
    }

    public final KeyframesSpecConfig<T> getConfig() {
        return this.config;
    }

    public int hashCode() {
        return this.config.hashCode();
    }

    @StabilityInferred(parameters = 0)
    /* compiled from: AnimationSpec.kt */
    public static final class KeyframeEntity<T> {
        public static final int $stable = 8;
        private Easing easing;
        private final T value;

        public KeyframeEntity(T t, Easing easing2) {
            C12775o.m28639i(easing2, "easing");
            this.value = t;
            this.easing = easing2;
        }

        public boolean equals(Object obj) {
            if (obj instanceof KeyframeEntity) {
                KeyframeEntity keyframeEntity = (KeyframeEntity) obj;
                if (!C12775o.m28634d(keyframeEntity.value, this.value) || !C12775o.m28634d(keyframeEntity.easing, this.easing)) {
                    return false;
                }
                return true;
            }
            return false;
        }

        public final Easing getEasing$animation_core_release() {
            return this.easing;
        }

        public final T getValue$animation_core_release() {
            return this.value;
        }

        public int hashCode() {
            int i;
            T t = this.value;
            if (t != null) {
                i = t.hashCode();
            } else {
                i = 0;
            }
            return (i * 31) + this.easing.hashCode();
        }

        public final void setEasing$animation_core_release(Easing easing2) {
            C12775o.m28639i(easing2, "<set-?>");
            this.easing = easing2;
        }

        public final <V extends AnimationVector> C11906l<V, Easing> toPair$animation_core_release(Function1<? super T, ? extends V> function1) {
            C12775o.m28639i(function1, "convertToVector");
            return C11915r.m25707a(function1.invoke(this.value), this.easing);
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ KeyframeEntity(Object obj, Easing easing2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(obj, (i & 2) != 0 ? EasingKt.getLinearEasing() : easing2);
        }
    }

    public <V extends AnimationVector> VectorizedKeyframesSpec<V> vectorize(TwoWayConverter<T, V> twoWayConverter) {
        C12775o.m28639i(twoWayConverter, "converter");
        Map<Integer, KeyframeEntity<T>> keyframes$animation_core_release = this.config.getKeyframes$animation_core_release();
        LinkedHashMap linkedHashMap = new LinkedHashMap(C12714q0.m28413d(keyframes$animation_core_release.size()));
        for (Map.Entry entry : keyframes$animation_core_release.entrySet()) {
            linkedHashMap.put(entry.getKey(), ((KeyframeEntity) entry.getValue()).toPair$animation_core_release(twoWayConverter.getConvertToVector()));
        }
        return new VectorizedKeyframesSpec<>(linkedHashMap, this.config.getDurationMillis(), this.config.getDelayMillis());
    }
}
