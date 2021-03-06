package com.lowwor.tuicool.data.db.tables;

import android.support.annotation.NonNull;

import com.pushtorefresh.storio.sqlite.queries.Query;

/**
 * Created by lowworker on 2015/9/27.
 */
public class HotTopicsItemTable {


    @NonNull
    public static final String TABLE = "hot_topics_item";


    @NonNull
    public static final String COLUMN_ID = "_id";

    @NonNull
    public static final String COLUMN_NAME = "name";


    private HotTopicsItemTable() {
        throw new IllegalStateException("No instances please");
    }

    @NonNull
    public static final Query QUERY_ALL = Query.builder()
            .table(TABLE)
            .build();



    @NonNull
    public static String getCreateTableQuery() {
        return "CREATE TABLE " + TABLE + "("
                + COLUMN_ID + " INTEGER NOT NULL PRIMARY KEY, "
                + COLUMN_NAME + " TEXT NOT NULL"
                + ");";
    }
}
