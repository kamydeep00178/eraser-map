package com.mapzen.erasermap.view

import android.os.Bundle
import android.preference.PreferenceManager
import android.widget.Toast
import com.mapzen.erasermap.EraserMapApplication
import com.mapzen.erasermap.model.AppSettings
import com.mapzen.pelias.SavedSearch
import javax.inject.Inject

public class SettingsActivity : HomeAsUpActivity() {
    var savedSearch: SavedSearch? = null
        @Inject set
    var settings: AppSettings? = null
        @Inject set

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        (application as EraserMapApplication).component()?.inject(this)
        val fragment = SettingsFragment.newInstance(settings)
        fragmentManager.beginTransaction()
                .replace(android.R.id.content, fragment)
                .commit()
    }

    public fun clearHistory() {
        savedSearch?.clear()
        PreferenceManager.getDefaultSharedPreferences(this)
                .edit()
                .putString(SavedSearch.TAG, savedSearch?.serialize())
                .commit()
        Toast.makeText(this@SettingsActivity, "History Erased", Toast.LENGTH_SHORT).show()
    }
}
