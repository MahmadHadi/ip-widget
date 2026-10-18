package com.example.minimalipwidget

import android.appwidget.AppWidgetManager
import android.appwidget.AppWidgetProvider
import android.content.Context
import android.widget.RemoteViews

class MinimalIpWidgetProvider : AppWidgetProvider() {
    override fun onUpdate(
        context: Context,
        appWidgetManager: AppWidgetManager,
        appWidgetIds: IntArray
    ) {
        appWidgetIds.forEach { appWidgetId ->
            val views = RemoteViews(context.packageName, R.layout.widget_minimal_ip)
            views.setTextViewText(R.id.ip_text, "127.0.0.1")
            appWidgetManager.updateAppWidget(appWidgetId, views)
        }
    }
}
