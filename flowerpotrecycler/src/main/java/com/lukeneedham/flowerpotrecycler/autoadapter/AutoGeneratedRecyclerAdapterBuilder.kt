package com.lukeneedham.flowerpotrecycler.autoadapter

import com.lukeneedham.flowerpotrecycler.autoadapter.builderbinder.BuilderBinder
import com.lukeneedham.flowerpotrecycler.delegatedadapter.singletype.ConfigurableSingleTypeRecyclerAdapter
import com.lukeneedham.flowerpotrecycler.delegatedadapter.config.RecyclerAdapterConfig

object AutoGeneratedRecyclerAdapterBuilder {
    inline fun <reified ItemType : Any> build(
        builderBinder: BuilderBinder<ItemType>,
        config: RecyclerAdapterConfig<ItemType>?
    ) =
        ConfigurableSingleTypeRecyclerAdapter(
            config
        ) {
            AutoGeneratedRecyclerItemView(it, builderBinder)
        }
}
