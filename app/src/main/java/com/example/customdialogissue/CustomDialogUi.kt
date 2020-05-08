package com.example.customdialogissue

import android.content.Context
import android.content.res.ColorStateList
import android.graphics.Color
import android.view.View
import android.view.ViewGroup
import splitties.views.backgroundColor
import splitties.views.dsl.constraintlayout.constraintLayout
import splitties.views.dsl.constraintlayout.lParams
import splitties.views.dsl.core.Ui
import splitties.views.dsl.core.add
import splitties.views.dsl.core.imageView
import splitties.views.dsl.core.wrapContent
import splitties.views.imageResource

class CustomDialogUi(override val ctx: Context) : Ui {
    override val root: View = constraintLayout {
        layoutParams = ViewGroup.LayoutParams(
            800, 300
        )

        backgroundColor = Color.WHITE

        add(
            imageView {
                imageResource = R.drawable.ic_launcher_foreground
                imageTintList = ColorStateList.valueOf(Color.BLACK)
            },
            lParams(wrapContent, wrapContent)
        )
    }
}