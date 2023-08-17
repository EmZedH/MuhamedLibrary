package com.muhamed.toasterlibrary

import android.content.Context
import android.widget.Toast

class ToasterMaker {
    fun makeToaster(c: Context, msg: String){
        Toast.makeText(c, msg, Toast.LENGTH_SHORT).show()
    }
}