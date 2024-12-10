package com.example.motivation.infra

import android.content.Context

class SecuritySharedPreference(context: Context) {

    private val security = context.getSharedPreferences("Motivation", Context.MODE_PRIVATE)

    fun storeString(key: String, name: String) {
        security.edit().putString(key, name).apply()
    }

    fun getString(key: String): String {
        return security.getString(key, "") ?: ""
    }
}