package com.muhamed.muhamedlibrary

import android.os.Bundle
import androidx.activity.ComponentActivity
import com.muhamed.toasterlibrary.ToasterMaker

class MainActivity: ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val toast = ToasterMaker()
        toast.makeToaster(this, "Toaster Maker working successfully")
    }
}