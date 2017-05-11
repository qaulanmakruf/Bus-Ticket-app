package com.codephillip.app.busticket.provider.orders;

import java.util.Date;

import android.database.Cursor;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import com.codephillip.app.busticket.provider.base.AbstractCursor;

/**
 * Cursor wrapper for the {@code orders} table.
 */
public class OrdersCursor extends AbstractCursor implements OrdersModel {
    public OrdersCursor(Cursor cursor) {
        super(cursor);
    }

    /**
     * Primary key.
     */
    public long getId() {
        Long res = getLongOrNull(OrdersColumns._ID);
        if (res == null)
            throw new NullPointerException("The value of '_id' in the database was null, which is not allowed according to the model definition");
        return res;
    }

    /**
     * Get the {@code code} value.
     * Can be {@code null}.
     */
    @Nullable
    public String getCode() {
        String res = getStringOrNull(OrdersColumns.CODE);
        return res;
    }

    /**
     * Get the {@code dalid} value.
     * Can be {@code null}.
     */
    @Nullable
    public Boolean getDalid() {
        Boolean res = getBooleanOrNull(OrdersColumns.DALID);
        return res;
    }

    /**
     * Get the {@code date} value.
     * Can be {@code null}.
     */
    @Nullable
    public String getDate() {
        String res = getStringOrNull(OrdersColumns.DATE);
        return res;
    }

    /**
     * Get the {@code customer} value.
     * Can be {@code null}.
     */
    @Nullable
    public String getCustomer() {
        String res = getStringOrNull(OrdersColumns.CUSTOMER);
        return res;
    }

    /**
     * Get the {@code route} value.
     * Can be {@code null}.
     */
    @Nullable
    public String getRoute() {
        String res = getStringOrNull(OrdersColumns.ROUTE);
        return res;
    }
}