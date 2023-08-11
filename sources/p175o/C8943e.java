package p175o;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import androidx.annotation.DrawableRes;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;
import p205r.C9345k;

@SourceDebugExtension({"SMAP\nResourceIntMapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ResourceIntMapper.kt\ncoil/map/ResourceIntMapper\n+ 2 Uri.kt\nandroidx/core/net/UriKt\n*L\n1#1,26:1\n29#2:27\n*S KotlinDebug\n*F\n+ 1 ResourceIntMapper.kt\ncoil/map/ResourceIntMapper\n*L\n15#1:27\n*E\n"})
/* renamed from: o.e */
/* compiled from: ResourceIntMapper.kt */
public final class C8943e implements C8942d<Integer, Uri> {
    /* renamed from: b */
    private final boolean m18141b(@DrawableRes int i, Context context) {
        try {
            if (context.getResources().getResourceEntryName(i) != null) {
                return true;
            }
            return false;
        } catch (Resources.NotFoundException unused) {
            return false;
        }
    }

    /* renamed from: a */
    public /* bridge */ /* synthetic */ Object mo43092a(Object obj, C9345k kVar) {
        return mo43096c(((Number) obj).intValue(), kVar);
    }

    /* renamed from: c */
    public Uri mo43096c(@DrawableRes int i, C9345k kVar) {
        if (!m18141b(i, kVar.mo43742g())) {
            return null;
        }
        Uri parse = Uri.parse("android.resource://" + kVar.mo43742g().getPackageName() + '/' + i);
        C12775o.m28638h(parse, "parse(this)");
        return parse;
    }
}
