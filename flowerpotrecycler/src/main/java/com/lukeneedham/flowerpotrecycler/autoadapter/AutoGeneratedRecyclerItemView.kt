package com.lukeneedham.flowerpotrecycler.autoadapter

import android.annotation.SuppressLint
import android.content.Context
import android.widget.FrameLayout
import com.lukeneedham.flowerpotrecycler.autoadapter.builderbinder.BuilderBinder
import com.lukeneedham.flowerpotrecycler.delegatedadapter.RecyclerItemView

@SuppressLint("ViewConstructor")
class AutoGeneratedRecyclerItemView<ItemType>(
    context: Context,
    private val builderBinder: BuilderBinder<ItemType>
) : FrameLayout(context), RecyclerItemView<ItemType> {

    init {
        addView(builderBinder.build(this))
    }

    override fun setItem(position: Int, item: ItemType) {
        builderBinder.bind(position, item, this)
    }
}