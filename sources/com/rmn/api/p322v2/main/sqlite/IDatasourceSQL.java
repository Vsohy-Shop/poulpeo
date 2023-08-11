package com.rmn.api.p322v2.main.sqlite;

import com.rmn.iosadapters.android.database.sqlite.SQLiteDatabaseWrapper;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.rmn.api.v2.main.sqlite.IDatasourceSQL */
public interface IDatasourceSQL {
    void clearContent();

    void clearContent(SQLiteDatabaseWrapper sQLiteDatabaseWrapper);

    void createTableIfExists(SQLiteDatabaseWrapper sQLiteDatabaseWrapper);

    void deleteContent(List<Map<KeySQLColumn, Object>> list);

    void dropTableIfExists(SQLiteDatabaseWrapper sQLiteDatabaseWrapper);

    long getColumnsChecksum();

    long getLifetimeInMs();

    String getTableName();

    void insertOrUpdateContent(List<Map<KeySQLColumn, Object>> list);

    List<Map<KeySQLColumn, Object>> selectContent(List<Map<KeySQLColumn, Object>> list, Set<KeySQLColumn> set, KeySQLColumn keySQLColumn);

    List<Map<KeySQLColumn, Object>> selectContent(Map<KeySQLColumn, Object> map, Set<KeySQLColumn> set, KeySQLColumn keySQLColumn);
}
