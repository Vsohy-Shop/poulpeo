package androidx.core.database.sqlite;

import android.database.sqlite.SQLiteDatabase;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12773m;
import kotlin.jvm.internal.C12775o;

/* compiled from: SQLiteDatabase.kt */
public final class SQLiteDatabaseKt {
    public static final <T> T transaction(SQLiteDatabase sQLiteDatabase, boolean z, Function1<? super SQLiteDatabase, ? extends T> function1) {
        C12775o.m28639i(sQLiteDatabase, "<this>");
        C12775o.m28639i(function1, "body");
        if (z) {
            sQLiteDatabase.beginTransaction();
        } else {
            sQLiteDatabase.beginTransactionNonExclusive();
        }
        try {
            T invoke = function1.invoke(sQLiteDatabase);
            sQLiteDatabase.setTransactionSuccessful();
            return invoke;
        } finally {
            C12773m.m28629b(1);
            sQLiteDatabase.endTransaction();
            C12773m.m28628a(1);
        }
    }

    public static /* synthetic */ Object transaction$default(SQLiteDatabase sQLiteDatabase, boolean z, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        C12775o.m28639i(sQLiteDatabase, "<this>");
        C12775o.m28639i(function1, "body");
        if (z) {
            sQLiteDatabase.beginTransaction();
        } else {
            sQLiteDatabase.beginTransactionNonExclusive();
        }
        try {
            Object invoke = function1.invoke(sQLiteDatabase);
            sQLiteDatabase.setTransactionSuccessful();
            return invoke;
        } finally {
            C12773m.m28629b(1);
            sQLiteDatabase.endTransaction();
            C12773m.m28628a(1);
        }
    }
}
