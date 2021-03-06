package com.xinh.authentication.login.component

import android.content.Context
import android.widget.LinearLayout

interface LoginHandler {
    fun init(context: Context, root: LinearLayout)

    fun setOnLoginClickListener(listener: (com.xinh.domain.param.LoginParam) -> Unit)
}